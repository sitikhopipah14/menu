package com.example.manu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

public class Activity_perpangkatan extends AppCompatActivity {

    VideoView mVideoView;
    MediaController mediaController;
    Button play1;
    ImageButton beck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perpangkatan);

        //Inisialisasi VideoView, MediaController dan Button
        mVideoView = findViewById(R.id.mVideoView);
        play1 = findViewById(R.id.play1);
        mediaController = new MediaController(this);


        //Menjalankan Video saat tombol Play di Klik
        play1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Variable Uri untuk menentukan lokasi Resource Video yang akan ditampilkan
                Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.penjumlahan);

                mVideoView.setVideoURI(uri);

                //Memasang MediaController untuk menampilkan tombol play, pause, dsb
                mVideoView.setMediaController(mediaController);
                mediaController.setAnchorView(mVideoView);

                //Menjalankan Video
                mVideoView.start();

                beck = (ImageButton) findViewById(R.id.beck);
                beck.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(getApplicationContext(),Activitykelas4.class));

                    }
                });

            }
        });
    }
}
