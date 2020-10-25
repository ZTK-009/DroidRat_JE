package com.je_chen.droidrat_je.command.process.runapp;

import android.content.pm.PackageManager;

import com.je_chen.droidrat_je.appintent.runapp.RunApp;
import com.je_chen.droidrat_je.command.process.CommandFather;
import com.je_chen.droidrat_je.command.process.CommandProcessInterface;

public class RunAppCommand extends CommandFather implements CommandProcessInterface {

    private RunApp runApp;

    public RunAppCommand(PackageManager packageManager){
        runApp = new RunApp(packageManager);
    }

    @Override
    public void send(String value) {

    }

    @Override
    public void processCommand(String command) {

    }
}
