package com.je_chen.droidrat_je.command.process.sms;

import com.je_chen.droidrat_je.appintent.sms.SMS;
import com.je_chen.droidrat_je.command.process.CommandFather;
import com.je_chen.droidrat_je.command.process.CommandProcessInterface;

public class SMSCommand extends CommandFather implements CommandProcessInterface {

    private SMS sms;

    public SMSCommand(){
        sms = new SMS();
    }

    @Override
    public void send(String value) {

    }

    @Override
    public void processCommand(String command) {

    }
}
