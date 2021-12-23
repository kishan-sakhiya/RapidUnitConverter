package com.rku.rapidunitconverter;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LengthActivity extends AppCompatActivity {

    EditText edt_length, edt_ans_length;
    Spinner spn_length;
    Button btn_length;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);

        edt_length = findViewById(R.id.edt_length);
        edt_ans_length = findViewById(R.id.edt_ans_length);
        spn_length = findViewById(R.id.spn_length);
        btn_length = findViewById(R.id.btn_length);

        btn_length.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String spn = null;
                double edt_value = 0;

                try {
                    spn = spn_length.getSelectedItem().toString();
                    edt_value = Double.parseDouble(edt_length.getText().toString());
                } catch (Exception e) {
                    edt_ans_length.setText("0");
                }

                if (edt_length.getText().toString().length() == 0) {
                    edt_ans_length.setText("0");
                }

                if (spn.equals("Foot_To_Inch")) {
                    double ans = edt_value * 12;
                    edt_ans_length.setText(String.format("%.2f", ans));
                }

                if (spn.equals("Inch To Foot")) {
                    double ans = edt_value / 12;
                    edt_ans_length.setText(String.format("%.2f", ans));
                }
                if (spn.equals("Kilometer To Meter")) {
                    double ans = edt_value * 1000;
                    edt_ans_length.setText(String.format("%.2f", ans));
                }
                if (spn.equals("Meter To Kilometer")) {
                    double ans = edt_value / 1000;
                    edt_ans_length.setText(String.format("%.2f", ans));
                }
                if (spn.equals("Centimeter To Inch")) {
                    double ans = edt_value * 0.39370;
                    edt_ans_length.setText(String.format("%.2f", ans));
                }
                if (spn.equals("Inch To Centimeter")) {
                    double ans = edt_value / 0.39370;
                    edt_ans_length.setText(String.format("%.2f", ans));
                }
                if (spn.equals("Foot To Meter")) {
                    double ans = edt_value *  0.3048;
                    edt_ans_length.setText(String.format("%.2f", ans));
                }
                if (spn.equals("Meter To Foot")) {
                    double ans = edt_value * 3.2808;
                    edt_ans_length.setText(String.format("%.2f", ans));
                }

            }
        });

    }

}