package com.databindingdemosecond.datamodel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.databindingdemosecond.BR;

/**
 * Created by Hp-pc on 03-Sep-17.
 */

public class TemperatureData extends BaseObservable {
    private String location;
    private String celsius;

    public TemperatureData(String location,String celsius){
        this.location=location;
        this.celsius=celsius;
    }

    @Bindable
    public String getLocation() {
        return location;
    }
    @Bindable
    public String getCelsius() {
        return celsius;
    }

    public void setCelsius(String celsius) {
        this.celsius = celsius;
        notifyPropertyChanged(BR.celsius);
    }

    public void setLocation(String location) {
        this.location = location;
        notifyPropertyChanged(BR.location);
    }
}
