package com.je_chen.droidrat_je.activity;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.je_chen.droidrat_je.R;
import com.je_chen.droidrat_je.appintent.call.Call;
import com.je_chen.droidrat_je.appintent.mail.SendMail;
import com.je_chen.droidrat_je.appintent.web.Web;
import com.je_chen.droidrat_je.appsinfo.checkpermission.PermissionsCheck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LaunchActivity extends AppCompatActivity implements View.OnClickListener {

    final String TAG = "JE-TAG";

    PackageManager packageManager;

    Call call;

    Web web;

    SendMail sendMail;

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

                //SMS
                Manifest.permission.SEND_SMS,
                Manifest.permission.READ_SMS};

        packageManager = getPackageManager();

        call = new Call();
        web = new Web();
        sendMail = new SendMail();

        permissionsCheck = new PermissionsCheck(packageManager);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            permissionsCheck.checkPermission(this, requestPermission);
        }

        testButton = findViewById(R.id.testButton);
        testButton.setOnClickListener(this);

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.testButton:
                sendMail.sendMail(this,"410877027@mail.nknu.edu.tw","Test","Test");
            break;
        }
    }

}
