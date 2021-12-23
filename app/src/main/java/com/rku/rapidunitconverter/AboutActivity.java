package com.rku.rapidunitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AboutActivity extends AppCompatActivity {

    ImageView img_linkedin_kishan,getImg_linkedin_harsh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        img_linkedin_kishan = findViewById(R.id.img_linkedin_kishan);
        getImg_linkedin_harsh = findViewById(R.id.img_linkedin_harsh);

        img_linkedin_kishan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoURL("https://www.linkedin.com/in/kishansakhiya/");
            }
        });

        getImg_linkedin_harsh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoURL("https://www.linkedin.com/in/harsh-nagar-67044b1a2/");
            }
        });
    }

    private void gotoURL(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}

