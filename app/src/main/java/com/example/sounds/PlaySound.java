package com.example.sounds;

import android.content.Context;
import android.media.MediaPlayer;
import android.util.Log;

public class PlaySound {
    private static final String TAG = "PlaySound";
    private Context context;
    private MediaPlayer player;
    private static int[] sounds = {R.raw.sound_1, R.raw.sound_2};

    public PlaySound(Context context) {
        this.context = context;
    }

    public void play(final int nr){
        if(player != null){
            stop();
        }
        player = MediaPlayer.create(this.context, sounds[nr - 1]);
        player.setLooping(true);
        player.start();
        Log.d(TAG , "  play : Player started.");
    }

    public void stop(){
        if(player != null) {
            player.release();
            player = null;
            Log.d(TAG , "  stop : Player stopped.");
        }
    }
}
