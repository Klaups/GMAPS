package com.example.liisi.gmaps;

/**
 * Created by Liisi on 22-May-16.
 */
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class NotificationActivity extends AppCompatActivity {

    private TextView textViewTripmeterMetrics;
    private TextView textViewWayPointMetrics;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_notification);

    }
}