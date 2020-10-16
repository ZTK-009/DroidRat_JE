package com.je_chen.droidrat_je.appsinfo.checkpermission;

import android.content.pm.PackageManager;

public class PermissionsCheck {
    private PackageManager packageManager;

    public PermissionsCheck(PackageManager packageManager){
        this.packageManager=packageManager;
    }

    public int check(String permissionname,String packagename){
       return this.packageManager.checkPermission(permissionname,packagename);
    }

}
