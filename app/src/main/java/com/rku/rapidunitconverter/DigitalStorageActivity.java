package com.rku.rapidunitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class DigitalStorageActivity extends AppCompatActivity {
    Button btn_digital_storage;
    EditText edt_digital_storage, edt_ans_digital_storage;
    Spinner spn_digital_storage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_digital_storage);

        btn_digital_storage = findViewById(R.id.btn_digital_storage);
        edt_ans_digital_storage = findViewById(R.id.edt_ans_digital_storage);
        edt_digital_storage = findViewById(R.id.edt_digital_storage);
        spn_digital_storage = findViewById(R.id.spn_digital_storage);

        btn_digital_storage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String spn = null;
                double edt_value = 0;

                try {
                    spn = spn_digital_storage.getSelectedItem().toString();
                    edt_value = Double.parseDouble(edt_digital_storage.getText().toString());
                } catch (Exception e) {
                    edt_ans_digital_storage.setText("0");
                }

                if (edt_digital_storage.getText().toString().length() == 0) {
                    edt_ans_digital_storage.setText("0");
                }

                if (spn.equals("Byte To Bit")) {
                    double ans = edt_value * 8;
                    edt_ans_digital_storage.setText(String.format("%.2f", ans));
                }
                if (spn.equals("Bit To Byte")) {
                    double ans = edt_value / 8;
                    edt_ans_digital_storage.setText(String.format("%.2f", ans));
                }
                if (spn.equals("Nibble To Bit")) {
                    double ans = edt_value * 4;
                    edt_ans_digital_storage.setText(String.format("%.2f", ans));
                }
                if (spn.equals("Bit To Nibble")) {
                    double ans = edt_value / 4;
                    edt_ans_digital_storage.setText(String.format("%.2f", ans));
                }
                if (spn.equals("Kilobyte To Byte")) {
                    double ans = edt_value * 1024;
                    edt_ans_digital_storage.setText(String.format("%.2f", ans));
                }
                if (spn.equals("Megabyte To Kilobyte")) {
                    double ans = edt_value * 1024;
                    edt_ans_digital_storage.setText(String.format("%.2f", ans));
                }
                if (spn.equals("Gigabyte To Megabyte")) {
                    double ans = edt_value * 1024;
                    edt_ans_digital_storage.setText(String.format("%.2f", ans));
                }
                if (spn.equals("Terabyte To Gigabyte")) {
                    double ans = edt_value * 1024;
                    edt_ans_digital_storage.setText(String.format("%.2f", ans));
                }
                if (spn.equals("Megabyte To Gigabyte")) {
                    double ans = edt_value / 1024;
                    edt_ans_digital_storage.setText(String.format("%.4f", ans));
                }

            }
        });

    }
}