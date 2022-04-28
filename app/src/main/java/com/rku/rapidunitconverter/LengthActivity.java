package com.rku.rapidunitconverter;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

public class LengthActivity extends AppCompatActivity {

    EditText edt_length;
    Button btn_length;
    AutoCompleteTextView actv;
    TextView txt_length_result;

    @SuppressLint("DefaultLocale")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);

        initialize_widgets();

        create_spinner();


        actv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                btn_length.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String spn = actv.getText().toString();

                        double value = 0;

                        double ans;

                        if (edt_length.getText().toString().trim().isEmpty()) {

                            Snackbar.make(v, getResources().getString(R.string.emty_sb_msg), Snackbar.LENGTH_LONG).setAction("Close", new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                }
                            }).show();

                            return;
                        }

                        try {
                            value = Double.parseDouble(edt_length.getText().toString());

                            if (value == 0) {
                                txt_length_result.setText("0");
                                return;
                            }

                        } catch (Exception e) {
                            txt_length_result.setText("0");
                            return;
                        }


                        switch (spn) {
                            case "Foot To Inch":
                                ans = value * 12;
                                txt_length_result.setText(String.format("%.2f", ans));
                                break;
                            case "Inch To Foot":
                                ans = value / 12;
                                txt_length_result.setText(String.format("%.2f", ans));
                                break;
                            case "Kilometer To Meter":
                                ans = value * 1000;
                                txt_length_result.setText(String.format("%.2f", ans));
                                break;
                            case "Meter To Kilometer":
                                ans = value / 1000;
                                txt_length_result.setText(String.format("%.2f", ans));
                                break;
                            case "Centimeter To Inch":
                                ans = value * 0.39370;
                                txt_length_result.setText(String.format("%.2f", ans));
                                break;
                            case "Inch To Centimeter":
                                ans = value / 0.39370;
                                txt_length_result.setText(String.format("%.2f", ans));
                                break;
                            case "Foot To Meter":
                                ans = value / 3.281;
                                txt_length_result.setText(String.format("%.2f", ans));
                                break;
                            case "Meter To Foot":
                                ans = value * 3.281;
                                txt_length_result.setText(String.format("%.2f", ans));
                                break;
                            case "Yard To Foot":
                                ans = value * 3;
                                txt_length_result.setText(String.format("%.2f", ans));
                                break;
                            case "Foot To Yard":
                                ans = value / 3;
                                txt_length_result.setText(String.format("%.2f", ans));
                                break;

                            case "ફૂટ થી ઇંચ":
                                ans = value * 12;
                                txt_length_result.setText(String.format("%.2f", ans));
                                break;
                            case "ઇંચ ટુ ફૂટ":
                                ans = value / 12;
                                txt_length_result.setText(String.format("%.2f", ans));
                                break;
                            case "કિલોમીટર થી મીટર":
                                ans = value * 1000;
                                txt_length_result.setText(String.format("%.2f", ans));
                                break;
                            case "મીટર થી કિલોમીટર":
                                ans = value / 1000;
                                txt_length_result.setText(String.format("%.2f", ans));
                                break;
                            case "સેન્ટીમીટર થી ઇંચ":
                                ans = value * 0.39370;
                                txt_length_result.setText(String.format("%.2f", ans));
                                break;
                            case "ઇંચ થી સેન્ટીમીટર":
                                ans = value / 0.39370;
                                txt_length_result.setText(String.format("%.2f", ans));
                                break;
                            case "ફૂટ ટુ મીટર":
                                ans = value / 3.281;
                                txt_length_result.setText(String.format("%.2f", ans));
                                break;
                            case "મીટર ટુ ફૂટ":
                                ans = value * 3.281;
                                txt_length_result.setText(String.format("%.2f", ans));
                                break;
                            case "યાર્ડ ટુ ફુટ":
                                ans = value * 3;
                                txt_length_result.setText(String.format("%.2f", ans));
                                break;
                            case "ફૂટ ટુ યાર્ડ":
                                ans = value / 3;
                                txt_length_result.setText(String.format("%.2f", ans));
                                break;

                            default:
                                Snackbar.make(v, getResources().getString(R.string.emty_sb_msg), Snackbar.LENGTH_LONG).setAction("Close", new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                    }
                                }).show();

                                break;
                        }

                    }
                });
            }
        });

    }

    private void create_spinner() {
        String[] arr_spn_weather = getResources().getStringArray(R.array.spn_length);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,
                R.layout.drop_down_item,
                arr_spn_weather
        );

        actv.setAdapter(adapter);

    }

    private void initialize_widgets() {
        edt_length = findViewById(R.id.edt_length);
        btn_length = findViewById(R.id.btn_length);
        txt_length_result = findViewById(R.id.txt_length_result);
        actv = findViewById(R.id.spn_length);

    }

}