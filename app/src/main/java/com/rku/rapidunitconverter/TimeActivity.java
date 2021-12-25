package com.rku.rapidunitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class TimeActivity extends AppCompatActivity {

    Spinner spn_time;
    EditText edt_time, edt_ans_time;
    Button btn_time;

    @SuppressLint({"DefaultLocale", "SetTextI18n"})
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);

        spn_time = findViewById(R.id.spn_time);
        edt_time = findViewById(R.id.edt_time);
        edt_ans_time = findViewById(R.id.edt_ans_time);
        btn_time = findViewById(R.id.btn_time);

        btn_time.setOnClickListener(v -> {
            String spn = null;
            double edt_value = 0;


            try {
                spn = spn_time.getSelectedItem().toString();
                edt_value = Double.parseDouble(edt_time.getText().toString());
            } catch (Exception e) {
                edt_ans_time.setText("0");
            }
            if (edt_time.getText().toString().length() == 0) {
                edt_ans_time.setText("0");
            }


            if ("Hour To Minute".equals(spn)) {
                if (edt_value == 0) {
                    edt_ans_time.setText("0");
                } else {
                    double ans = edt_value * 60;
                    edt_ans_time.setText(String.format("%.2f", ans));
                }
            }

            if ("Minute To Hour".equals(spn)) {
                if (edt_value == 0) {
                    edt_ans_time.setText("0");
                } else {
                    double ans = edt_value / 60;
                    edt_ans_time.setText(String.format("%.2f", ans));
                }
            }

            if ("Minute To Second".equals(spn)) {
                if (edt_value == 0) {
                    edt_ans_time.setText("0");
                } else {
                    double ans = edt_value * 60;
                    edt_ans_time.setText(String.format("%.2f", ans));
                }
            }

            if ("Hour To Second".equals(spn)) {
                if (edt_value == 0) {
                    edt_ans_time.setText("0");
                } else {
                    double ans = edt_value * 3600;
                    edt_ans_time.setText(String.format("%.2f", ans));
                }
            }

            if ("Second To Hour".equals(spn)) {
                if (edt_value == 0) {
                    edt_ans_time.setText("0");
                } else {
                    double temp = edt_value * 1;
                    double ans = temp * 1 / 3600;
                    edt_ans_time.setText(String.format("%.4f", ans));
                }
            }

            if ("Month To Day".equals(spn)) {
                if (edt_value == 0) {
                    edt_ans_time.setText("0");
                } else {
                    double ans = edt_value * 30.436875;
                    edt_ans_time.setText(String.format("%.4f", ans));
                }
            }
            if ("Year To Day".equals(spn)) {
                if (edt_value == 0) {
                    edt_ans_time.setText("0");
                } else {
                    double ans = edt_value * 365;
                    edt_ans_time.setText(String.format("%.2f", ans));
                }
            }
            if ("Second To Minute".equals(spn)) {
                if (edt_value == 0) {
                    edt_ans_time.setText("0");
                } else {
                    double ans = edt_value / 60;
                    edt_ans_time.setText(String.format("%.2f", ans));
                }
            }
            if ("Day To Year".equals(spn)) {
                if (edt_value == 0) {
                    edt_ans_time.setText("0");
                } else {
                    double ans = edt_value / 365;
                    edt_ans_time.setText(String.format("%.2f", ans));
                }
            }
            if ("Day To Month".equals(spn)) {
                if (edt_value == 0) {
                    edt_ans_time.setText("0");
                } else if (edt_value == 365) {
                    edt_ans_time.setText("12");
                } else if (edt_value == 730) {
                    edt_ans_time.setText("24");
                } else if (edt_value == 1095) {
                    edt_ans_time.setText("36");
                } else {
                    double ans = edt_value / 30;
                    edt_ans_time.setText(String.format("%.2f", ans));
                }
            }

        });

    }
}