package com.databindingdemosecond.datamodel;

import android.content.Context;
import android.content.Intent;

/**
 * Created by Hp-pc on 03-Sep-17.
 */

public class MainActivityPresenter implements MainActivityContract.Presenter {

    private MainActivityContract.View view;
    private Context ctx;

    public  MainActivityPresenter(MainActivityContract.View view,Context ctx){
        this.ctx=ctx;
        this.view=view;
    }
    @Override
    public void onShowData(TemperatureData temperatureData) {
        view.showData(temperatureData);

    }

    @Override
    public void showList() {
        Intent i = new Intent(ctx, SecondActivity.class);
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        ctx.startActivity(i);
    }
}
