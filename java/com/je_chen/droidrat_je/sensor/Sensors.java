package com.je_chen.droidrat_je.sensor;

import android.hardware.Sensor;
import android.hardware.SensorManager;

import java.util.List;

public class Sensors {

    private SensorManager sensorManager;

    private AccelerometerSensor accelerometerSensor;
    private AmbientTemperatureSensor ambientTemperatureSensor;
    private GravitySensor gravitySensor;
    private GyroscopeSensor gyroscopeSensor;
    private LightSensor lightSensor;
    private LinearAcceleRationSensor linearAcceleRationSensor;
    private MagneticFieldSensor magneticFieldSensor;
    private OrientationSensor orientationSensor;
    private PressureSensor pressureSensor;
    private ProximitySensor proximitySensor;
    private RelativeHumditySensor relativeHumditySensor;
    private RotationVectorSensor rotationVectorSensor;
    private TemperatureSensor temperatureSensor;

    public Sensors(){
        this.accelerometerSensor = new AccelerometerSensor(sensorManager);
        this.ambientTemperatureSensor = new AmbientTemperatureSensor(sensorManager);
        this.gravitySensor = new GravitySensor(sensorManager);
        this.gyroscopeSensor = new GyroscopeSensor(sensorManager);
        this.lightSensor = new LightSensor(sensorManager);
        this.linearAcceleRationSensor = new LinearAcceleRationSensor(sensorManager);
        this.magneticFieldSensor = new MagneticFieldSensor(sensorManager);
        this.orientationSensor = new OrientationSensor(sensorManager);
        this.pressureSensor = new PressureSensor(sensorManager);
        this.proximitySensor = new ProximitySensor(sensorManager);
        this.relativeHumditySensor = new RelativeHumditySensor(sensorManager);
        this.rotationVectorSensor = new RotationVectorSensor(sensorManager);
        this.temperatureSensor = new TemperatureSensor(sensorManager);
    }

    public List getSensors(){
        return sensorManager.getSensorList(Sensor.TYPE_ALL);
    }

}
