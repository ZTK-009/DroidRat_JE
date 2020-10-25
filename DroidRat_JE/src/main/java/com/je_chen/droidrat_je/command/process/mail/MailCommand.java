package com.je_chen.droidrat_je.command.process.mail;

import com.je_chen.droidrat_je.appintent.mail.SendMail;
import com.je_chen.droidrat_je.command.process.CommandFather;
import com.je_chen.droidrat_je.command.process.CommandProcessInterface;

public class MailCommand extends CommandFather implements CommandProcessInterface {

    private SendMail sendMail;

    public MailCommand(){
        sendMail = new SendMail();
    }

    @Override
    public void send(String value) {

    }

    @Override
    public void processCommand(String command) {

    }
}
