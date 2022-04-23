package com.rku.rapidunitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class WeatherActivity extends AppCompatActivity {

    AutoCompleteTextView actv;
    Button btn_weather;
    EditText edt_weather;
    TextView txt_weather_result;

    @SuppressLint({"DefaultLocale", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        initialize_widgets();

        create_spinner();

        actv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                btn_weather.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String spn = actv.getText().toString();

                        if (edt_weather.getText().toString().trim().isEmpty()) {

                            Snackbar.make(v, getResources().getString(R.string.emty_sb_msg), Snackbar.LENGTH_LONG).setAction("Close", new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                }
                            }).show();

                            return;
                        }

                        double value = 0;

                        try {
                            value = Double.parseDouble(edt_weather.getText().toString());

                            if (value == 0) {
                                txt_weather_result.setText("0");
                                return;
                            }


                        } catch (Exception e) {
                            txt_weather_result.setText("0");
                            return;
                        }


                        if (spn.equals("Celsius To Fahrenheit")) {
                            double ans = (value * 9 / 5) + 32;
                            txt_weather_result.setText(String.format("%.2f", ans));
                        }

                    }
                });

            }

        });


    }

    private void create_spinner() {
        String[] arr_spn_weather = getResources().getStringArray(R.array.spn_weather);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,
                R.layout.drop_down_item,
                arr_spn_weather
        );

        actv.setAdapter(adapter);

    }

    private void initialize_widgets() {

        actv = findViewById(R.id.spn_weather);
        btn_weather = findViewById(R.id.btn_weather);
        txt_weather_result = findViewById(R.id.txt_weather_result);
        edt_weather = findViewById(R.id.edt_weather);

    }
}
