package com.je_chen.droidrat_je.command.process.info;

import android.content.pm.PackageManager;

import com.je_chen.droidrat_je.appsinfo.getinfo.GetPackagesInfo;
import com.je_chen.droidrat_je.command.process.CommandFather;
import com.je_chen.droidrat_je.command.process.CommandProcessInterface;

public class InfoCommand extends CommandFather implements CommandProcessInterface {

    private GetPackagesInfo getPackagesInfo;

    public InfoCommand(PackageManager packageManager){
        getPackagesInfo = new GetPackagesInfo(packageManager);
    }

    @Override
    public void send(String value) {

    }

    @Override
    public void processCommand(String command) {

    }
}
