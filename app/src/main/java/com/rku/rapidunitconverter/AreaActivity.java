package com.rku.rapidunitconverter;

import androidx.appcompat.app.AppCompatActivity;

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

import com.google.android.material.snackbar.Snackbar;

public class AreaActivity extends AppCompatActivity {
    Button btn_area;
    EditText edt_area;
    AutoCompleteTextView actv;
    TextView txt_area_result;

    @SuppressLint("DefaultLocale")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        initialize_widgets();

        create_spinner();

        actv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                btn_area.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String spn = actv.getText().toString();

                        double value = 0;

                        double ans;

                        if (edt_area.getText().toString().trim().isEmpty()) {

                            Snackbar.make(v, getResources().getString(R.string.emty_sb_msg), Snackbar.LENGTH_LONG).setAction("Close", new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                }
                            }).show();

                            return;
                        }


                        try {
                            value = Double.parseDouble(edt_area.getText().toString());

                            if (value == 0) {
                                txt_area_result.setText("0");
                                return;
                            }

                        } catch (Exception e) {
                            txt_area_result.setText("0");
                            return;
                        }

                        switch (spn) {
                            case "Hectare To Acre":
                                ans = value * 2.4711;
                                txt_area_result.setText(String.format("%.2f", ans));
                                break;
                            case "Acre To Hectare":
                                ans = value / 2.4711;
                                txt_area_result.setText(String.format("%.2f", ans));
                                break;
                            case "Hectare To Square Foot":
                                ans = value * 107639.1041;
                                txt_area_result.setText(String.format("%.2f", ans));
                                break;
                            case "Acre To Square Foot":
                                ans = value * 43560;
                                txt_area_result.setText(String.format("%.2f", ans));
                                break;
                            case "Square Foot To Square Inch":
                                ans = value * 144;
                                txt_area_result.setText(String.format("%.2f", ans));
                                break;
                            case "Square Inch To Square Foot":
                                ans = value / 144;
                                txt_area_result.setText(String.format("%.2f", ans));
                                break;
                            case "Square Yard To Square Foot":
                                ans = value * 9;
                                txt_area_result.setText(String.format("%.2f", ans));
                                break;
                            case "Square Foot To Square Yard":
                                ans = value / 9;
                                txt_area_result.setText(String.format("%.2f", ans));
                                break;

                            case "હેક્ટર થી એકર":
                                ans = value * 2.4711;
                                txt_area_result.setText(String.format("%.2f", ans));
                                break;
                            case "એકર થી હેક્ટર":
                                ans = value / 2.4711;
                                txt_area_result.setText(String.format("%.2f", ans));
                                break;
                            case "હેક્ટર થી ચોરસ ફૂટ":
                                ans = value * 107639.1041;
                                txt_area_result.setText(String.format("%.2f", ans));
                                break;
                            case "એકર થી ચોરસ ફૂટ":
                                ans = value * 43560;
                                txt_area_result.setText(String.format("%.2f", ans));
                                break;
                            case "સ્ક્વેર ફૂટ થી સ્ક્વેર ઇંચ":
                                ans = value * 144;
                                txt_area_result.setText(String.format("%.2f", ans));
                                break;
                            case "ચોરસ ઇંચ થી ચોરસ ફૂટ":
                                ans = value / 144;
                                txt_area_result.setText(String.format("%.2f", ans));
                                break;
                            case "સ્ક્વેર યાર્ડ થી સ્ક્વેર ફૂટ":
                                ans = value * 9;
                                txt_area_result.setText(String.format("%.2f", ans));
                                break;
                            case "સ્ક્વેર ફૂટ થી સ્ક્વેર યાર્ડ":
                                ans = value / 9;
                                txt_area_result.setText(String.format("%.2f", ans));
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
        String[] arr_spn_weather = getResources().getStringArray(R.array.spn_area);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,
                R.layout.drop_down_item,
                arr_spn_weather
        );

        actv.setAdapter(adapter);

    }

    private void initialize_widgets() {

        btn_area = findViewById(R.id.btn_area);
        txt_area_result = findViewById(R.id.txt_area_result);
        edt_area = findViewById(R.id.edt_area);
        actv = findViewById(R.id.spn_area);

    }
}