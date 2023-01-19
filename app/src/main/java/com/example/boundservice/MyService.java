package com.example.boundservice;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

import androidx.annotation.Nullable;

import java.security.Provider;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class MyService extends Service {


    ScheduledExecutorService myschedgule_executor;
    private  IBinder binder = new Binder();
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return binder;

    myschedgule_executor = Executors.newScheduledThreadPool(1);
    myschedgule_executor.scheduleAtFixedRate(new Runnable(){
        @Override
        public void

    }

    }
}
