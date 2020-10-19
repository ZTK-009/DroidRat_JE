package com.je_chen.droidrat_je.sensor;

import android.hardware.Sensor;
import android.hardware.SensorManager;

public class LinearAcceleRationSensor implements SensorInterface {

    private SensorManager sensorManager;
    private boolean canUse;

    public LinearAcceleRationSensor(SensorManager sensorManager) {
        this.sensorManager = sensorManager;
        canUse = sensorManager.getDefaultSensor(Sensor.TYPE_LINEAR_ACCELERATION) != null;
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
