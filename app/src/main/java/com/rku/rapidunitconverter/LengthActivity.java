package com.rku.rapidunitconverter;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class LengthActivity extends AppCompatActivity {

    EditText edt_length, edt_ans_length;
    Spinner spn_length;
    Button btn_length;

    @SuppressLint("DefaultLocale")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);

        edt_length = findViewById(R.id.edt_length);
        edt_ans_length = findViewById(R.id.edt_ans_length);
        spn_length = findViewById(R.id.spn_length);
        btn_length = findViewById(R.id.btn_length);

        btn_length.setOnClickListener(v -> {
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


            if (spn != null && spn.equals("Foot To Inch")) {

                if (edt_value == 0) {
                    edt_ans_length.setText("0");
                } else {
                    double ans = edt_value * 12;
                    edt_ans_length.setText(String.format("%.2f", ans));
                }
            }

            if ("Inch To Foot".equals(spn)) {
                if (edt_value == 0) {
                    edt_ans_length.setText("0");
                } else {
                    double ans = edt_value / 12;
                    edt_ans_length.setText(String.format("%.2f", ans));
                }
            }

            if ("Kilometer To Meter".equals(spn)) {
                if (edt_value == 0) {
                    edt_ans_length.setText("0");
                } else {
                    double ans = edt_value * 1000;
                    edt_ans_length.setText(String.format("%.2f", ans));
                }
            }

            if ("Meter To Kilometer".equals(spn)) {
                if (edt_value == 0) {
                    edt_ans_length.setText("0");
                } else {
                    double ans = edt_value / 1000;
                    edt_ans_length.setText(String.format("%.2f", ans));
                }
            }

            if ("Centimeter To Inch".equals(spn)) {
                if (edt_value == 0) {
                    edt_ans_length.setText("0");
                } else {
                    double ans = edt_value * 0.39370;
                    edt_ans_length.setText(String.format("%.2f", ans));
                }
            }
            if ("Inch To Centimeter".equals(spn)) {
                if (edt_value == 0) {
                    edt_ans_length.setText("0");
                } else {
                    double ans = edt_value / 0.39370;
                    edt_ans_length.setText(String.format("%.2f", ans));
                }
            }
            if ("Foot To Meter".equals(spn)) {
                if (edt_value == 0) {
                    edt_ans_length.setText("0");
                } else {
                    double ans = edt_value * 0.3048;
                    edt_ans_length.setText(String.format("%.2f", ans));
                }
            }
            if ("Meter To Foot".equals(spn)) {
                if (edt_value == 0) {
                    edt_ans_length.setText("0");
                } else {
                    double ans = edt_value * 3.2808;
                    edt_ans_length.setText(String.format("%.2f", ans));
                }
            }
        });
    }

}