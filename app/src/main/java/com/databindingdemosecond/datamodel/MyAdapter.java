package com.databindingdemosecond.datamodel;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.databindingdemosecond.BR;
import com.databindingdemosecond.R;

import java.util.List;

/**
 * Created by Hp-pc on 03-Sep-17.
 */

public class MyAdapter extends MyBaseAdapter {
    List<TemperatureData> data;

    // Provide a suitable constructor (depends on the kind of dataset)
    public MyAdapter(List<TemperatureData> myDataset) {
        data = myDataset;
    }

    @Override
    public Object getDataAtPosition(int position) {
        return data.get(position);
    }

    @Override
    public int getLayoutIdForType(int viewType) {
        return R.layout.rowlayout;
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

}
