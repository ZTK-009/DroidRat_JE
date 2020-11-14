package com.je_chen.websocket.module.process.receive.data.process_super;

import com.je_chen.websocket.module.process.receive.data.process.*;

public class DataProcess {

    private DataFather dataFather;

    private CallData callData;

    private CameraData cameraData;

    private InfoData infoData;

    private InstallData installData;

    private LocationData locationData;

    private MailData mailData;

    private PlayData playData;

    private RunAppData runAppData;

    private SensorData sensorData;

    private SMSData smsData;

    private ToastData toastData;

    private VibratorData vibratorData;

    private WebData webData;

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

        }
    }
}
