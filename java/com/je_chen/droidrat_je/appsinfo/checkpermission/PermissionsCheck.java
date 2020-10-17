package com.je_chen.droidrat_je.appsinfo.checkpermission;

import android.content.pm.PackageManager;

import java.util.List;

public class PermissionsCheck {
    private PackageManager packageManager;
    private String TAG = "DroidRat_JE";

    public PermissionsCheck(PackageManager packageManager){
        this.packageManager=packageManager;
    }

    public int check(String permissionname,String packagename){
       return this.packageManager.checkPermission(permissionname,packagename);
    }

    public List getPermissionGroup(){
        List permissionList = packageManager.getAllPermissionGroups(0);
        return permissionList;
    }

}
