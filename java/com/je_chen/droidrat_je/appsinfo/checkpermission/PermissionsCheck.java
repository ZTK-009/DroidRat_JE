package com.je_chen.droidrat_je.appsinfo.checkpermission;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;

import androidx.core.app.ActivityCompat;

import java.util.Arrays;
import java.util.List;

public class PermissionsCheck {
    private final PackageManager packageManager;
    private final String TAG = "DroidRat_JE";

    public PermissionsCheck(PackageManager packageManager) {
        this.packageManager = packageManager;
    }

    public void checkPermission(Activity activity, String[] permission) {
        ActivityCompat.requestPermissions(activity, permission, 0);
    }

    public void checkPermission(Activity activity, String permission) {
        ActivityCompat.requestPermissions(activity, new String[]{permission}, 0);
    }

    public List getPermissionGroup() {
        List permissionList = packageManager.getAllPermissionGroups(0);
        return permissionList;
    }

}
