package com.rku.rapidunitconverter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;
import com.google.android.play.core.review.ReviewManagerFactory;

import static com.google.android.material.snackbar.BaseTransientBottomBar.LENGTH_LONG;

public class MainActivity extends AppCompatActivity {

    CardView cvspeed, cvlength, cvmass, cvtime, cvdigitalstorage, cvarea;
    ReviewManager manager;
    ReviewInfo reviewInfo;
    ConstraintLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        getSupportActionBar().setIcon(R.drawable.ic_about_phone);
        setContentView(R.layout.activity_main);

        cvspeed = findViewById(R.id.cvspeed);
        cvlength = findViewById(R.id.cvlength);
        cvmass = findViewById(R.id.cvmass);
        cvtime = findViewById(R.id.cvtime);
        cvdigitalstorage = findViewById(R.id.cvdigitalstorage);
        cvarea = findViewById(R.id.cvarea);
        layout = findViewById(R.id.layout);

        // this is in app review in playstore
        manager = ReviewManagerFactory.create(MainActivity.this);
        Task<ReviewInfo> request = manager.requestReviewFlow();
        request.addOnCompleteListener(new OnCompleteListener<ReviewInfo>() {
            @Override
            public void onComplete(@NonNull Task<ReviewInfo> task) {
                if(task.isSuccessful()){
                    reviewInfo = task.getResult();

                    Task<Void> flow = manager.launchReviewFlow(MainActivity.this,reviewInfo);

                    flow.addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {

                        }
                    });
                }else {

                    Snackbar snackbar = Snackbar.make(layout,"Review Not Send", LENGTH_LONG);
                    snackbar.show();
                }
            }
        });



        // all card view click listener
        cvspeed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WeatherActivity.class);
                startActivity(intent);

            }
        });

        cvlength.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LengthActivity.class);
                startActivity(intent);

            }
        });

        cvmass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MassActivity.class);
                startActivity(intent);

            }
        });

        cvtime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TimeActivity.class);
                startActivity(intent);

            }
        });

        cvdigitalstorage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DigitalStorageActivity.class);
                startActivity(intent);

            }
        });

        cvarea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AreaActivity.class);
                startActivity(intent);

            }
        });
    }


    //option menu for about
    @Override
    public boolean onCreatePanelMenu(int featureId, @NonNull Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreatePanelMenu(featureId, menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.about:

                Intent intent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}