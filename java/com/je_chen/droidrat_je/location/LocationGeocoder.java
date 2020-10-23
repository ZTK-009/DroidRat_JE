package com.je_chen.droidrat_je.location;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

public class LocationGeocoder {
    //TODO Geocoder
    private Geocoder geocoder;

    public LocationGeocoder(Context context){
        Locale locale = Locale.getDefault();
        this.geocoder = new Geocoder(context,locale);
    }
    // getAddressLine
    public List<Address> getAddressList(double latitude,double longitude,int dataCount) throws IOException {
        return this.geocoder.getFromLocation(latitude,longitude,dataCount);
    }


}
