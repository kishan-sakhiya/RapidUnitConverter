package com.rku.rapidunitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MassActivity extends AppCompatActivity {
    Button btn_mass;
    EditText edt_mass, edt_ans_mass;
    Spinner spn_mass;

    @SuppressLint("DefaultLocale")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mass);

        btn_mass = findViewById(R.id.btn_mass);
        edt_ans_mass = findViewById(R.id.edt_ans_mass);
        edt_mass = findViewById(R.id.edt_mass);
        spn_mass = findViewById(R.id.spn_mass);

        btn_mass.setOnClickListener(v -> {
            String spn = null;
            double edt_value = 0;

            try {
                spn = spn_mass.getSelectedItem().toString();
                edt_value = Double.parseDouble(edt_mass.getText().toString());
            } catch (Exception e) {
                edt_ans_mass.setText("0");
            }

            if (edt_mass.getText().toString().length() == 0) {
                edt_ans_mass.setText("0");
            }

            if ("Kilogram To Gram".equals(spn)) {
                if (edt_value == 0) {
                    edt_ans_mass.setText("0");
                } else {
                    double ans = edt_value * 1000;
                    edt_ans_mass.setText(String.format("%.3f", ans));
                }
            }
            if ("Gram To Kilogram".equals(spn)) {
                if (edt_value == 0) {
                    edt_ans_mass.setText("0");
                } else {
                    double ans = edt_value / 1000;
                    edt_ans_mass.setText(String.format("%.2f", ans));
                }
            }
            if ("Milligram To Microgram".equals(spn)) {
                if (edt_value == 0) {
                    edt_ans_mass.setText("0");
                } else {
                    double ans = edt_value * 1000;
                    edt_ans_mass.setText(String.format("%.2f", ans));
                }
            }
            if ("Microgram To Milligram".equals(spn)) {
                if (edt_value == 0) {
                    edt_ans_mass.setText("0");
                } else {
                    double ans = edt_value / 1000;
                    edt_ans_mass.setText(String.format("%.3f", ans));
                }
            }
            if ("Quintal To Kilogram".equals(spn)) {
                if (edt_value == 0) {
                    edt_ans_mass.setText("0");
                } else {
                    double ans = edt_value * 100;
                    edt_ans_mass.setText(String.format("%.2f", ans));
                }
            }
            if ("Tonne To Kilogram".equals(spn)) {
                if (edt_value == 0) {
                    edt_ans_mass.setText("0");
                } else {
                    double ans = edt_value * 1000;
                    edt_ans_mass.setText(String.format("%.2f", ans));
                }
            }
            if ("Kilogram To Quintal".equals(spn)) {
                if (edt_value == 0) {
                    edt_ans_mass.setText("0");
                } else {
                    double ans = edt_value / 100;
                    edt_ans_mass.setText(String.format("%.2f", ans));
                }
            }
            if ("Kilogram To Tonne".equals(spn)) {
                if (edt_value == 0) {
                    edt_ans_mass.setText("0");
                } else {
                    double ans = edt_value / 1000;
                    edt_ans_mass.setText(String.format("%.2f", ans));
                }
            }

        });

    }
}