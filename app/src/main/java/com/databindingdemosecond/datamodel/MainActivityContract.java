package com.databindingdemosecond.datamodel;

import com.databindingdemosecond.datamodel.TemperatureData;

/**
 * Created by Hp-pc on 03-Sep-17.
 */

public interface MainActivityContract {
    public interface  Presenter{
        void onShowData(TemperatureData temperatureData);
        void showList();
    }

    public interface  View{
        void showData(TemperatureData temperatureData);
    }
}
