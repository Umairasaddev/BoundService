package com.example.boundservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.concurrent.ScheduledExecutorService;

public class MainActivity extends AppCompatActivity {

    ScheduledExecutorService myschedgule_executor;
    boolean bound;

    Button button1,button2;
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    tv1 = findViewById(R.id.tv1);
    button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);


    button1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Intent intent = new Intent(MainActivity.this,MyService.class);

            bindService(intent,connection,BIND_AUTO_CREATE);
            }
        });
    }
    private ServiceConnection connection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {

            bound = true;
        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {

            bound = false;
        }
    };
}