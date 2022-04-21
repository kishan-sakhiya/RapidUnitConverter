package com.rku.rapidunitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class AreaActivity extends AppCompatActivity {
    Button btn_area;
    EditText edt_area, edt_ans_area;
    Spinner spn_area;

    @SuppressLint("DefaultLocale")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btn_area = findViewById(R.id.btn_area);
        edt_ans_area = findViewById(R.id.edt_ans_area);
        edt_area = findViewById(R.id.edt_area);
        spn_area = findViewById(R.id.spn_area);

        btn_area.setOnClickListener(v -> {
            String spn = null;
            double edt_value = 0;

            try {
                spn = spn_area.getSelectedItem().toString();
                edt_value = Double.parseDouble(edt_area.getText().toString());
            } catch (Exception e) {
                edt_ans_area.setText("0");
            }

            if (edt_area.getText().toString().length() == 0) {
                edt_ans_area.setText("0");
            }

            if ("Hectare To Acre".equals(spn)) {
                if (edt_value == 0) {
                    edt_ans_area.setText("0");
                } else {
                    double ans = edt_value * 2.4711;
                    edt_ans_area.setText(String.format("%.2f", ans));
                }
            }
            if ("Acre To Hectare".equals(spn)) {
                if (edt_value == 0) {
                    edt_ans_area.setText("0");
                } else {
                    double ans = edt_value / 2.4711;
                    edt_ans_area.setText(String.format("%.2f", ans));
                }
            }
            if ("Hectare To Square Foot".equals(spn)) {
                if (edt_value == 0) {
                    edt_ans_area.setText("0");
                } else {
                    double ans = edt_value * 107639.1041;
                    edt_ans_area.setText(String.format("%.2f", ans));
                }
            }
            if ("Acre To Square Foot".equals(spn)) {
                if (edt_value == 0) {
                    edt_ans_area.setText("0");
                } else {
                    double ans = edt_value * 43560;
                    edt_ans_area.setText(String.format("%.2f", ans));
                }
            }
            if ("Square Foot To Square Inch".equals(spn)) {
                if (edt_value == 0) {
                    edt_ans_area.setText("0");
                } else {
                    double ans = edt_value * 144;
                    edt_ans_area.setText(String.format("%.2f", ans));
                }
            }
            if ("Square Yard To Square Foot".equals(spn)) {
                if (edt_value == 0) {
                    edt_ans_area.setText("0");
                } else {
                    double ans = edt_value * 9;
                    edt_ans_area.setText(String.format("%.2f", ans));
                }
            }
            if ("Square Foot To Square Yard".equals(spn)) {
                if (edt_value == 0) {
                    edt_ans_area.setText("0");
                } else {
                    double ans = edt_value / 9;
                    edt_ans_area.setText(String.format("%.2f", ans));
                }
            }

            if ("Square Inch To Square Foot".equals(spn)) {
                if (edt_value == 0) {
                    edt_ans_area.setText("0");
                } else {
                    double ans = edt_value / 144;
                    edt_ans_area.setText(String.format("%.3f", ans));
                }
            }
        });

    }
}