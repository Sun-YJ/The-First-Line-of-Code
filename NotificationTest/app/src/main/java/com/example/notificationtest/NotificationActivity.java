package com.example.notificationtest;

import android.app.Activity;
import android.app.NotificationManager;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by Sun_Y on 2017/4/12.
 */

public class NotificationActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notification_layout);
    }
}
