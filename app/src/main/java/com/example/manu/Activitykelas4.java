package com.example.manu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Activitykelas4 extends AppCompatActivity {
    ImageButton back;
    ImageButton nextper;
    ImageButton nextakar;
    ImageButton nextfak;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitykelas4);

        back=(ImageButton) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));

            }
        });
        nextper=(ImageButton) findViewById(R.id.nextper);
        nextper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Activity_perpangkatan.class));
            }
        });

        nextakar=(ImageButton) findViewById(R.id.nextakar);
        nextakar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Activity_akarpangkat.class));
            }
        });

        nextfak = (ImageButton) findViewById(R.id.nextfak);
        nextfak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Activity_faktor.class));
            }
        });
    }
}