package com.je_chen.droidrat_je;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PermissionGroupInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    final String TAG = "JE-TAG";
    PackageManager pm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pm = getPackageManager();
        @SuppressLint("QueryPermissionsNeeded") List<PackageInfo> packList = getPackageManager().getInstalledPackages(0);
        for (int i = 0; i < packList.size(); i++) {
            PackageInfo packInfo = packList.get(i);
            if ((packInfo.applicationInfo.flags & ApplicationInfo.FLAG_SYSTEM) == 0) {
                String appName = packInfo.applicationInfo.loadLabel(getPackageManager()).toString();
                Log.e(TAG + i, appName);
            }
        }
        /*
        Intent launchApp = getPackageManager().getLaunchIntentForPackage("JE_OCR");
        startActivity(launchApp);
         */
        Intent mainIntent = new Intent(Intent.ACTION_MAIN, null);
        mainIntent.addCategory(Intent.CATEGORY_LAUNCHER);
        @SuppressLint("QueryPermissionsNeeded") List<ResolveInfo> pkgAppsList = this.getPackageManager().queryIntentActivities( mainIntent, 0);
        for(ResolveInfo info: pkgAppsList){
            Log.e(TAG, String.valueOf(info));
        }

        /*
        Intent intent = new Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
        Uri uri = Uri.fromParts("package", "com.je_chen.je_ocr", null);
        intent.setData(uri);
        startActivity(intent);
        */

        /*
        Intent launchApp = getPackageManager().getLaunchIntentForPackage("com.je_chen.je_ocr");
        startActivity(launchApp);
         */

    }
}