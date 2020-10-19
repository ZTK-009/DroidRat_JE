package com.je_chen.droidrat_je.sensor;

import android.hardware.Sensor;
import android.hardware.SensorManager;

public class RotationVectorSensor  implements SensorInterface{
    private SensorManager sensorManager;
    private boolean canUse;

    public RotationVectorSensor(SensorManager sensorManager) {
        this.sensorManager = sensorManager;
        canUse = sensorManager.getDefaultSensor(Sensor.TYPE_GAME_ROTATION_VECTOR) != null;
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
