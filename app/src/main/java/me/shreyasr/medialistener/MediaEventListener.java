package me.shreyasr.medialistener;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MediaEventListener extends BroadcastReceiver {

    @Override public void onReceive(Context context, Intent intent) {
        // AudioManager.isMusicActive();
        String action = intent.getAction();
//        String cmd = intent.getStringExtra("command");
        String artist = intent.getStringExtra("artist");
        String track = intent.getStringExtra("track");
//        String album = intent.getStringExtra("album");

        handleMessage(context, action + " - " + artist + ": " + track);
    }

    private void handleMessage(Context context, String message) {
        Log.e("MediaEvent", message);
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }
}
