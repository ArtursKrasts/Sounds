package com.example.sounds;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private PlaySound playSound;
    private Button play_1;
    private Button play_2;
    private Button stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playSound = new PlaySound(getApplicationContext());

        play_1 = findViewById(R.id.play1);
        play_2 = findViewById(R.id.play2);
        stop = findViewById(R.id.stop);

        play_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound.play(1);
            }
        });

        play_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound.play(2);
            }
        });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound.stop();
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        playSound.stop();
    }
}
