package com.rku.rapidunitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class TimeActivity extends AppCompatActivity {

    Spinner spn_time;
    EditText edt_time, edt_ans_time;
    Button btn_time;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);

        spn_time = findViewById(R.id.spn_time);
        edt_time = findViewById(R.id.edt_time);
        edt_ans_time = findViewById(R.id.edt_ans_time);
        btn_time = findViewById(R.id.btn_time);


        btn_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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


                if (spn.equals("Hour To Minute")) {
                    double ans = edt_value * 60;
                    edt_ans_time.setText(String.format("%.2f", ans));
                }

                if (spn.equals("Minute To Hour")) {
                    double ans = edt_value / 60;
                    edt_ans_time.setText(String.format("%.2f", ans));
                }

                if (spn.equals("Minute To Second")) {
                    double ans = edt_value * 60;
                    edt_ans_time.setText(String.format("%.2f", ans));
                }

                if (spn.equals("Hour To Second")) {
                    double ans = edt_value * 3600;
                    edt_ans_time.setText(String.format("%.2f", ans));
                }

                if (spn.equals("Second To Hour")) {
                    double temp = edt_value * 1;
                    double ans = temp * 1 / 3600;
                    edt_ans_time.setText(String.format("%.4f", ans));
                }

                if (spn.equals("Month To Day")) {
                    double ans = edt_value * 30.436875;
                    edt_ans_time.setText(String.format("%.4f", ans));
                }
                if (spn.equals("Year To Day")) {
                    double ans = edt_value * 365;
                    edt_ans_time.setText(String.format("%.2f", ans));
                }

            }
        });

    }
}