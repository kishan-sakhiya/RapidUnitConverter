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

public class MassActivity extends AppCompatActivity {
    Button btn_mass;
    EditText edt_mass;
    TextView txt_mass_result;
    AutoCompleteTextView actv;

    @SuppressLint("DefaultLocale")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mass);

        initialization_Widgets();

        createSpinner();

        actv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                btn_mass.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String spn = actv.getText().toString();

                        double value = 0;

                        double ans;

                        if (edt_mass.getText().toString().trim().isEmpty()) {

                            Snackbar.make(v, getResources().getString(R.string.emty_sb_msg), Snackbar.LENGTH_LONG).setAction("Close", new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                }
                            }).show();

                            return;
                        }


                        try {
                            value = Double.parseDouble(edt_mass.getText().toString());

                            if (value == 0) {
                                txt_mass_result.setText("0");
                                return;
                            }

                        } catch (Exception e) {
                            txt_mass_result.setText("0");
                            return;
                        }

                        switch (spn) {
                            case "Kilogram To Gram":
                                ans = value * 1000;
                                txt_mass_result.setText(String.format("%.2f", ans));
                                break;

                            case "Gram To Kilogram":
                                ans = value / 1000;
                                txt_mass_result.setText(String.format("%.2f", ans));
                                break;

                            case "Milligram To Microgram":
                                ans = value * 1000;
                                txt_mass_result.setText(String.format("%.2f", ans));
                                break;

                            case "Microgram To Milligram":
                                ans = value / 1000;
                                txt_mass_result.setText(String.format("%.3f", ans));
                                break;

                            case "Quintal To Kilogram":
                                ans = value * 1000;
                                txt_mass_result.setText(String.format("%.2f", ans));
                                break;

                            case "Kilogram To Quintal":
                                ans = value / 1000;
                                txt_mass_result.setText(String.format("%.2f", ans));
                                break;

                            case "Tonne To Kilogram":
                                ans = value * 1000;
                                txt_mass_result.setText(String.format("%.2f", ans));
                                break;

                            case "Kilogram To Tonne":
                                ans = value / 1000;
                                txt_mass_result.setText(String.format("%.2f", ans));
                                break;

                            case "કિલોગ્રામ થી ગ્રામ":
                                ans = value * 1000;
                                txt_mass_result.setText(String.format("%.2f", ans));
                                break;

                            case "ગ્રામ થી કિલોગ્રામ":
                                ans = value / 1000;
                                txt_mass_result.setText(String.format("%.2f", ans));
                                break;

                            case "મિલિગ્રામ થી માઇક્રોગ્રામ":
                                ans = value * 1000;
                                txt_mass_result.setText(String.format("%.2f", ans));
                                break;

                            case "માઇક્રોગ્રામ થી મિલિગ્રામ":
                                ans = value / 1000;
                                txt_mass_result.setText(String.format("%.3f", ans));
                                break;

                            case "ક્વિન્ટલ થી કિલોગ્રામ":
                                ans = value * 1000;
                                txt_mass_result.setText(String.format("%.2f", ans));
                                break;

                            case "કિલોગ્રામ થી ક્વિન્ટલ":
                                ans = value / 1000;
                                txt_mass_result.setText(String.format("%.2f", ans));
                                break;

                            case "ટન થી કિલોગ્રામ":
                                ans = value * 1000;
                                txt_mass_result.setText(String.format("%.2f", ans));
                                break;

                            case "કિલોગ્રામ થી ટન":
                                ans = value / 1000;
                                txt_mass_result.setText(String.format("%.2f", ans));
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

    private void createSpinner() {
        String[] arr_spn_weather = getResources().getStringArray(R.array.spn_mass);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,
                R.layout.drop_down_item,
                arr_spn_weather
        );

        actv.setAdapter(adapter);
    }

    private void initialization_Widgets() {

        btn_mass = findViewById(R.id.btn_mass);
        txt_mass_result = findViewById(R.id.txt_mass_result);
        edt_mass = findViewById(R.id.edt_mass);
        actv = findViewById(R.id.spn_mass);

    }
}