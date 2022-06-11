package com.work.myandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;

public class songs extends AppCompatActivity {

    Button btn_play, btn_pause, btn_stop;

    MediaPlayer mp;

    int[] songs = {R.raw.song};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        btn_play = findViewById(R.id.btn_play);
        btn_pause = findViewById(R.id.btn_pause);
        btn_stop = findViewById(R.id.btn_stop);

        mp = MediaPlayer.create(songs.this,songs[0]);

        btn_play.setOnClickListener(view->{
        mp.start();
        });

        btn_pause.setOnClickListener(view->{
            mp.pause();
        });

        btn_stop.setOnClickListener(view->{
            if(mp.isPlaying() || mp.isLooping())
            {
                mp.stop();
                mp = MediaPlayer.create(songs.this,R.raw.song);
            }

        });

    }
}