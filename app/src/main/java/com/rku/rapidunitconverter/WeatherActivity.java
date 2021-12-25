package com.rku.rapidunitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class WeatherActivity extends AppCompatActivity {

    Button btn_weather;
    EditText edt_weather, edt_ans_weather;
    Spinner spn_weather;

    @SuppressLint({"DefaultLocale", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        btn_weather = findViewById(R.id.btn_weather);
        edt_ans_weather = findViewById(R.id.edt_ans_weather);
        edt_weather = findViewById(R.id.edt_weather);
        spn_weather = findViewById(R.id.spn_weather);

        btn_weather.setOnClickListener(v -> {
            String spn = null;
            double edt_value = 0;

            try {
                spn = spn_weather.getSelectedItem().toString();
                edt_value = Double.parseDouble(edt_weather.getText().toString());
            } catch (Exception e) {
                edt_ans_weather.setText("0");
            }

            if (edt_weather.getText().toString().length() == 0) {
                edt_ans_weather.setText("0");
            }

            if ("Celsius To Fahrenheit".equals(spn)) {
                if (edt_value == 0) {
                    edt_ans_weather.setText("32");
                } else {
                    double ans = (edt_value * 9 / 5) + 32;
                    edt_ans_weather.setText(String.format("%.2f", ans));
                }
            }
            if ("Fahrenheit To Celsius".equals(spn)) {
                if (edt_value == 0) {
                    double ans = (edt_value - 32) * 5 / 9;
                    edt_ans_weather.setText(String.format("%.2f", ans));
                } else {

                    double ans = (edt_value - 32) * 5 / 9;
                    edt_ans_weather.setText(String.format("%.2f", ans));
                }
            }
        });
    }
}
