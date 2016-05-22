package com.example.liisi.gmaps;

/**
 * Created by Liisi on 22-May-16.
 */
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

public class GpsService extends Service {

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        //handleCommand(intent);
        // We want this service to continue running until it is explicitly
        // stopped, so return sticky.
        return START_STICKY;
    }
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
