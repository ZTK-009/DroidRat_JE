package com.je_chen.droidRat.module.process.receive.data.process;

import com.je_chen.droidRat.module.process.receive.data.process_super.DataFather;

public class InfoData extends DataFather {

    @Override
    public void processData(String[] dataArray) {
        switch (dataArray[1]) {

            //PackageInfo
            case "ResolveInfo":
            case "InstalledPackages":
            case "AnotherPermission":
            case "AnotherSignature":
            case "PackageInfo":
            case "ApplicationIcon":
            case "ApplicationInfo":
            case "DeviceId":

                //PhoneInfo
            case "BOARD":
            case "BOOTLOADER":
            case "BRAND":
            case "Device":
            case "Display":
            case "FINGERPRINT":
            case "HARDWARE":
            case "HOST":
            case "ID":
            case "MANUFACTURER":
            case "Model":
            case "Product":
            case "TYPE":
            case "USER":
            case "VERSION_INCREMENTAL":
            case "VERSION_RELEASE":
            case "Time":
            case "SDKVersion":
            case "SecurityVersion":
            case "CPUInfo":
                System.out.println(dataArray[1] + " : " + dataArray[2]);
                break;

        }
    }

}
