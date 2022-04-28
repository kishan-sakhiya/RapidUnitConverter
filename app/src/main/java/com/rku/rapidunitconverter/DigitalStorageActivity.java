package com.rku.rapidunitconverter;

import androidx.appcompat.app.AppCompatActivity;

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

public class DigitalStorageActivity extends AppCompatActivity {
    Button btn_digital_storage;
    EditText edt_digital_storage;
    TextView txt_ds_result;
    AutoCompleteTextView actv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_digital_storage);

        initializeWidgets();

        createSpinner();

        actv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                btn_digital_storage.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String spn = actv.getText().toString();

                        double value = 0;

                        double ans;

                        if (edt_digital_storage.getText().toString().trim().isEmpty()) {

                            Snackbar.make(v, getResources().getString(R.string.emty_sb_msg), Snackbar.LENGTH_LONG).setAction("Close", new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                }
                            }).show();

                            return;
                        }


                        try {
                            value = Double.parseDouble(edt_digital_storage.getText().toString());

                            if (value == 0) {
                                txt_ds_result.setText("0");
                                return;
                            }

                        } catch (Exception e) {
                            txt_ds_result.setText("0");
                            return;
                        }

                        switch (spn) {
                            case "Byte To Bit":
                                ans = value * 8;
                                txt_ds_result.setText(String.format("%.2f", ans));
                                break;

                            case "Bit To Byte":
                                ans = value / 8;
                                txt_ds_result.setText(String.format("%.2f", ans));
                                break;

                            case "Nibble To Bit":
                                ans = value * 4;
                                txt_ds_result.setText(String.format("%.2f", ans));
                                break;

                            case "Bit To Nibble":
                                ans = value * 4;
                                txt_ds_result.setText(String.format("%.2f", ans));
                                break;

                            case "Kilobyte To Byte":
                                ans = value * 1024;
                                txt_ds_result.setText(String.format("%.2f", ans));
                                break;

                            case "Byte To Kilobyte":
                                ans = value / 1024;
                                txt_ds_result.setText(String.format("%.4f", ans));
                                break;

                            case "Megabyte To Kilobyte":
                                ans = value * 1024;
                                txt_ds_result.setText(String.format("%.2f", ans));
                                break;

                            case "Gigabyte To Megabyte":
                                ans = value * 1024;
                                txt_ds_result.setText(String.format("%.2f", ans));
                                break;

                            case "Terabyte To Gigabyte":
                                ans = value * 1024;
                                txt_ds_result.setText(String.format("%.2f", ans));
                                break;

                            case "Megabyte To Gigabyte":
                                ans = value / 1024;
                                txt_ds_result.setText(String.format("%.4f", ans));
                                break;


                            case "બાઈટ ટુ બીટ":
                                ans = value * 8;
                                txt_ds_result.setText(String.format("%.2f", ans));
                                break;

                            case "બીટ ટુ બાઈટ":
                                ans = value / 8;
                                txt_ds_result.setText(String.format("%.2f", ans));
                                break;

                            case "નિબલ ટુ બીટ":
                                ans = value * 4;
                                txt_ds_result.setText(String.format("%.2f", ans));
                                break;

                            case "બીટ ટુ નિબલ":
                                ans = value * 4;
                                txt_ds_result.setText(String.format("%.2f", ans));
                                break;

                            case "કિલોબાઈટ થી બાઈટ":
                                ans = value * 1024;
                                txt_ds_result.setText(String.format("%.2f", ans));
                                break;

                            case "બાઈટ થી કિલોબાઈટ":
                                ans = value / 1024;
                                txt_ds_result.setText(String.format("%.4f", ans));
                                break;

                            case "મેગાબાઈટ થી કિલોબાઈટ":
                                ans = value * 1024;
                                txt_ds_result.setText(String.format("%.2f", ans));
                                break;

                            case "ગીગાબાઈટ થી મેગાબાઈટ":
                                ans = value * 1024;
                                txt_ds_result.setText(String.format("%.2f", ans));
                                break;

                            case "ટેરાબાઈટ થી ગીગાબાઈટ":
                                ans = value * 1024;
                                txt_ds_result.setText(String.format("%.2f", ans));
                                break;

                            case "મેગાબાઈટ થી ગીગાબાઈટ":
                                ans = value / 1024;
                                txt_ds_result.setText(String.format("%.4f", ans));
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
        String[] arr_spn_weather = getResources().getStringArray(R.array.spn_digital_storage);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,
                R.layout.drop_down_item,
                arr_spn_weather
        );

        actv.setAdapter(adapter);
    }

    private void initializeWidgets() {

        btn_digital_storage = findViewById(R.id.btn_ds);
        txt_ds_result = findViewById(R.id.txt_ds_result);
        edt_digital_storage = findViewById(R.id.edt_ds);
        actv = findViewById(R.id.spn_ds);

    }
}

