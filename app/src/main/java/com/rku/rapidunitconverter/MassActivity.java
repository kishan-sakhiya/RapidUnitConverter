package com.rku.rapidunitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MassActivity extends AppCompatActivity {
    Button btn_mass;
    EditText edt_mass,edt_ans_mass;
    Spinner spn_mass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mass);

        btn_mass = findViewById(R.id.btn_mass);
        edt_ans_mass = findViewById(R.id.edt_ans_mass);
        edt_mass = findViewById(R.id.edt_mass);
        spn_mass = findViewById(R.id.spn_mass);

        btn_mass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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

                if (spn.equals("Kilogram To Gram")) {
                    double ans = edt_value * 1000;
                    edt_ans_mass.setText(String.format("%.3f", ans));
                }
                if (spn.equals("Gram To Kilogram")) {
                    double ans = edt_value / 1000;
                    edt_ans_mass.setText(String.format("%.2f", ans));
                }
                if (spn.equals("Milligram To Microgram")) {
                    double ans = edt_value * 1000;
                    edt_ans_mass.setText(String.format("%.2f", ans));
                }
                if (spn.equals("Microgram To Milligram")) {
                    double ans = edt_value / 1000;
                    edt_ans_mass.setText(String.format("%.3f", ans));
                }
                if (spn.equals("Quintal To Kilogram")) {
                    double ans = edt_value * 100;
                    edt_ans_mass.setText(String.format("%.2f", ans));
                }
                if (spn.equals("Tonne To Kilogram")) {
                    double ans = edt_value * 1000;
                    edt_ans_mass.setText(String.format("%.2f", ans));
                }

            }
        });

    }
}