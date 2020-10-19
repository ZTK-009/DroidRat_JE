package com.je_chen.droidrat_je.sensor;

import android.hardware.Sensor;
import android.hardware.SensorManager;

public class GravitySensor implements SensorInterface{

    private SensorManager sensorManager;
    private boolean canUse;

    public GravitySensor(SensorManager sensorManager) {
        this.sensorManager = sensorManager;
        canUse = sensorManager.getDefaultSensor(Sensor.TYPE_GRAVITY) != null;
    }

    @Override
    public Object returnValue() {
        return null;
    }

    @Override
    public boolean canUse() {
        return canUse;
    }
}
