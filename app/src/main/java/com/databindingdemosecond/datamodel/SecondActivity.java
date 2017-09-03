package com.databindingdemosecond.datamodel;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.databindingdemosecond.R;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Hp-pc on 03-Sep-17.
 */

public class SecondActivity extends Activity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);

        List<TemperatureData> items =
                Arrays.asList(new TemperatureData("Hamburg", "5"), new TemperatureData("Berlin", "6"),new TemperatureData("Delhi", "6"),
                        new TemperatureData("Gurgaon", "35"),new TemperatureData("Kanpur", "30"));

        // define an adapter
        mAdapter = new MyAdapter(items);
        recyclerView.setAdapter(mAdapter);
    }
}
