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

public class TimeActivity extends AppCompatActivity {

    EditText edt_time;
    Button btn_time;
    TextView txt_time_result;
    AutoCompleteTextView actv;

    @SuppressLint({"DefaultLocale", "SetTextI18n"})
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);

        initialize_widgets();

        create_spinner();

        actv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                btn_time.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String spn = actv.getText().toString();

                        double value = 0;

                        double ans;

                        if (edt_time.getText().toString().trim().isEmpty()) {

                            Snackbar.make(v, getResources().getString(R.string.emty_sb_msg), Snackbar.LENGTH_LONG).setAction("Close", new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                }
                            }).show();

                            return;
                        }


                        try {
                            value = Double.parseDouble(edt_time.getText().toString());

                            if (value == 0) {
                                txt_time_result.setText("0");
                                return;
                            }

                        } catch (Exception e) {
                            txt_time_result.setText("0");
                            return;
                        }

                        switch (spn) {
                            case "Hour To Minute":
                                ans = value * 60;
                                txt_time_result.setText(String.format("%.2f", ans));
                                break;
                            case "કલાક થી મિનિટ":
                                ans = value * 60;
                                txt_time_result.setText(String.format("%.2f", ans));
                                break;

                            case "Minute To Hour":
                                ans = value / 60;
                                txt_time_result.setText(String.format("%.2f", ans));
                                break;

                            case "મિનિટ થી કલાક":
                                ans = value / 60;
                                txt_time_result.setText(String.format("%.2f", ans));
                                break;

                            case "Minute To Second":
                                ans = value / 60;
                                txt_time_result.setText(String.format("%.2f", ans));
                                break;
                            case "મિનિટ થી સેકન્ડ":
                                ans = value / 60;
                                txt_time_result.setText(String.format("%.2f", ans));
                                break;

                            case "Second To Minute":
                                ans = value / 60;
                                txt_time_result.setText(String.format("%.2f", ans));
                                break;

                            case "સેકન્ડ ટુ મિનિટ":
                                ans = value / 60;
                                txt_time_result.setText(String.format("%.2f", ans));
                                break;

                            case "Hour To Second":
                                ans = value * 3600;
                                txt_time_result.setText(String.format("%.2f", ans));
                                break;

                            case "કલાક થી સેકન્ડ":
                                ans = value * 3600;
                                txt_time_result.setText(String.format("%.2f", ans));
                                break;

                            case "Second To Hour":
                                double temp = value * 1;
                                ans = temp * 1 / 3600;
                                txt_time_result.setText(String.format("%.4f", ans));
                                break;

                            case "સેકન્ડ ટુ કલાક":
                                double temp1 = value * 1;
                                ans = temp1 * 1 / 3600;
                                txt_time_result.setText(String.format("%.4f", ans));
                                break;

                            case "Month To Day":
                                ans = value * 30.436875;
                                txt_time_result.setText(String.format("%.2f", ans));
                                break;

                            case "મહિનો ટુ ડે":
                                ans = value * 30.436875;
                                txt_time_result.setText(String.format("%.2f", ans));
                                break;

                            case "Year To Day":
                                ans = value * 365;
                                txt_time_result.setText(String.format("%.2f", ans));
                                break;

                            case "વર્ષ થી દિવસ":
                                ans = value * 365;
                                txt_time_result.setText(String.format("%.2f", ans));
                                break;

                            case "Day To Year":
                                ans = value / 365;
                                txt_time_result.setText(String.format("%.2f", ans));
                                break;
                            case "દિવસ થી વર્ષ":
                                ans = value / 365;
                                txt_time_result.setText(String.format("%.2f", ans));
                                break;

                            case "દિવસ થી મહિનો":
                                if ("દિવસ થી મહિનો".equals(spn)) {
                                    if (value == 0) {
                                        txt_time_result.setText("0");
                                    } else if (value == 365) {
                                        txt_time_result.setText("12");
                                    } else if (value == 730) {
                                        txt_time_result.setText("24");
                                    } else if (value == 1095) {
                                        txt_time_result.setText("36");
                                    } else {
                                        double dayans = value / 30;
                                        txt_time_result.setText(String.format("%.2f", dayans));
                                    }
                                }
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
        String[] arr_spn_weather = getResources().getStringArray(R.array.spn_time);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,
                R.layout.drop_down_item,
                arr_spn_weather
        );

        actv.setAdapter(adapter);

    }

    private void initialize_widgets() {
        actv = findViewById(R.id.spn_time);
        edt_time = findViewById(R.id.edt_time);
        txt_time_result = findViewById(R.id.txt_time_result);
        btn_time = findViewById(R.id.btn_time);
    }
}