package com.je_chen.droidrat_je.command.process.camera;

import android.content.Context;

import com.je_chen.droidrat_je.command.process.CommandFather;
import com.je_chen.droidrat_je.command.process.CommandProcessInterface;

public class CameraCommand extends CommandFather implements CommandProcessInterface {

    private Context context;

    public CameraCommand(Context context){
        this.context = context;
    }

    @Override
    public void send(String value) {

    }

    @Override
    public void processCommand(String command) {

    }
}
