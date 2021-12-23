package com.rku.rapidunitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class AreaActivity extends AppCompatActivity {
    Button btn_area;
    EditText edt_area, edt_ans_area;
    Spinner spn_area;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);

        btn_area = findViewById(R.id.btn_area);
        edt_ans_area = findViewById(R.id.edt_ans_area);
        edt_area = findViewById(R.id.edt_area);
        spn_area = findViewById(R.id.spn_area);

        btn_area.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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

                if (spn.equals("Hectare To Acre")) {
                    double ans = edt_value * 2.4711;
                    edt_ans_area.setText(String.format("%.2f", ans));
                }
                if (spn.equals("Acre To Hectare")) {
                    double ans = edt_value / 2.4711;
                    edt_ans_area.setText(String.format("%.2f", ans));
                }
                if (spn.equals("Hectare To Square Foot")) {
                    double ans = edt_value * 107639.1041;
                    edt_ans_area.setText(String.format("%.2f", ans));
                }
                if (spn.equals("Acre To Square Foot")) {
                    double ans = edt_value * 43560;
                    edt_ans_area.setText(String.format("%.2f", ans));
                }
                if (spn.equals("Square Foot To Square Inch")) {
                    double ans = edt_value * 144;
                    edt_ans_area.setText(String.format("%.2f", ans));
                }

            }
        });

    }
}