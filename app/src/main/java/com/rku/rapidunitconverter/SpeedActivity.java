package com.rku.rapidunitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class SpeedActivity extends AppCompatActivity {
    EditText edt_speed,edt_ans_speed;
    Spinner spinnerType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speed);

        edt_speed = findViewById(R.id.edt_speed);
        edt_ans_speed = findViewById(R.id.edt_ans_speed);
        spinnerType = findViewById(R.id.spn_speed);

        String spinner = spinnerType.getSelectedItem().toString();

           Toast.makeText(this, String.valueOf(spinner), Toast.LENGTH_SHORT).show();

        edt_speed.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {


            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });



    }
}