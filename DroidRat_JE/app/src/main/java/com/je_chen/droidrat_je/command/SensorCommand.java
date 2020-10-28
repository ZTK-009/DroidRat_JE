package com.je_chen.droidrat_je.command;

import android.hardware.SensorManager;

import com.je_chen.droidrat_je.command.process_super.CommandFather;
import com.je_chen.droidrat_je.command.process_super.CommandProcessInterface;

public class SensorCommand extends CommandFather implements CommandProcessInterface {

    public SensorCommand(SensorManager sensorManager){
    }

    @Override
    public void send(String value) {

    }

    @Override
    public void processCommand(String command) {

    }
}
