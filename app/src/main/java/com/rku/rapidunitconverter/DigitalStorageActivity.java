package com.rku.rapidunitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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

        btn_digital_storage.setOnClickListener(v -> {
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

            if ("Byte To Bit".equals(spn)) {
                if (edt_value == 0) {
                    edt_ans_digital_storage.setText("0");
                } else {
                    double ans = edt_value * 8;
                    edt_ans_digital_storage.setText(String.format("%.2f", ans));
                }
            }
            if ("Bit To Byte".equals(spn)) {
                if (edt_value == 0) {
                    edt_ans_digital_storage.setText("0");
                } else {
                    double ans = edt_value / 8;
                    edt_ans_digital_storage.setText(String.format("%.2f", ans));
                }
            }
            if ("Nibble To Bit".equals(spn)) {
                if (edt_value == 0) {
                    edt_ans_digital_storage.setText("0");
                } else {
                    double ans = edt_value * 4;
                    edt_ans_digital_storage.setText(String.format("%.2f", ans));
                }
            }
            if ("Bit To Nibble".equals(spn)) {
                if (edt_value == 0) {
                    edt_ans_digital_storage.setText("0");
                } else {
                    double ans = edt_value / 4;
                    edt_ans_digital_storage.setText(String.format("%.2f", ans));
                }
            }
            if ("Kilobyte To Byte".equals(spn)) {
                if (edt_value == 0) {
                    edt_ans_digital_storage.setText("0");
                } else {
                    double ans = edt_value * 1024;
                    edt_ans_digital_storage.setText(String.format("%.2f", ans));
                }
            }
            if ("Megabyte To Kilobyte".equals(spn)) {
                if (edt_value == 0) {
                    edt_ans_digital_storage.setText("0");
                } else {
                    double ans = edt_value * 1024;
                    edt_ans_digital_storage.setText(String.format("%.2f", ans));
                }
            }
            if ("Gigabyte To Megabyte".equals(spn)) {
                if (edt_value == 0) {
                    edt_ans_digital_storage.setText("0");
                } else {
                    double ans = edt_value * 1024;
                    edt_ans_digital_storage.setText(String.format("%.2f", ans));
                }
            }
            if ("Terabyte To Gigabyte".equals(spn)) {
                if (edt_value == 0) {
                    edt_ans_digital_storage.setText("0");
                } else {
                    double ans = edt_value * 1024;
                    edt_ans_digital_storage.setText(String.format("%.2f", ans));
                }
            }
            if ("Megabyte To Gigabyte".equals(spn)) {
                if (edt_value == 0) {
                    edt_ans_digital_storage.setText("0");
                } else {
                    double ans = edt_value / 1024;
                    edt_ans_digital_storage.setText(String.format("%.4f", ans));
                }
            }
            if ("Byte To Kilobyte".equals(spn)) {
                if (edt_value == 0) {
                    edt_ans_digital_storage.setText("0");
                }else {
                    double ans = edt_value / 1024;
                    edt_ans_digital_storage.setText(String.format("%.4f", ans));
                }
            }
        });
    }
}

