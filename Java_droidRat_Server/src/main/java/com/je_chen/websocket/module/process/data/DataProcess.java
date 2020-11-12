package com.je_chen.websocket.module.process.data;

public class DataProcess {

    public void processData(String dataString){
        String[] dataStringArray = dataString.split(":");
        switch (dataStringArray[0]){

            case "Websearch":
                System.out.println(dataStringArray[0] + " : " + dataStringArray[1]);
                break;
            case "Openweb":
                System.out.println(dataStringArray[0] + " : " + dataStringArray[1]);
                break;

            case "Vibrator":
                System.out.println(dataStringArray[0] + " : " + dataStringArray[1]);
                break;

            case "CallPhone":
                System.out.println(dataStringArray[0] + " : " + dataStringArray[1]);
                break;

            case "CallLogs":
                System.out.println(dataStringArray[0]);
                System.out.println("Phone Number :" + dataStringArray[1]);
                System.out.println("Direction :" + dataStringArray[2]);
                System.out.println("Call Duration :" + dataStringArray[3]);
                System.out.println("Call Day Times :" + dataStringArray[4]);
                break;

            case "ToastN":
                System.out.println(dataStringArray[0] + " : " + dataStringArray[1]);
                break;

            case "ToastD":
                System.out.println(dataStringArray[0] + " : " + dataStringArray[1]);
                break;

            case "ResolveInfo":
                System.out.println(dataStringArray[0] + " : " + dataStringArray[1]);

            case "InstalledPackages":
                System.out.println(dataStringArray[0] + " : " + dataStringArray[1]);
        }
    }
}
