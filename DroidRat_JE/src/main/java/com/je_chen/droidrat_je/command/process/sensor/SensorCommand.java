package com.je_chen.droidrat_je.command.process.sensor;

import android.hardware.SensorManager;

import com.je_chen.droidrat_je.command.process.CommandFather;
import com.je_chen.droidrat_je.command.process.CommandProcessInterface;
import com.je_chen.droidrat_je.sensor.Sensors;

public class SensorCommand extends CommandFather implements CommandProcessInterface {

    private Sensors sensors;

    public SensorCommand(SensorManager sensorManager){
        sensors = new Sensors(sensorManager);
    }

    @Override
    public void send(String value) {

    }

    @Override
    public void processCommand(String command) {

    }
}
