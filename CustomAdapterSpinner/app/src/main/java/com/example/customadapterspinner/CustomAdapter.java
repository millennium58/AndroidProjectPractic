package com.example.customadapterspinner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    Context context;
    int[] flags;
    String [] countryNames;
    CustomAdapter(Context context,String[] countryNames,int[]flags){
        this.context=context;
        this.countryNames=countryNames;
        this.flags=flags;
    }
    @Override
    public int getCount() {
        return countryNames.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view==null){
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view=layoutInflater.inflate(R.layout.sample_view,null,false);
        }
        ImageView imageView1=(ImageView) view.findViewById(R.id.countryFlagId);
        TextView textView1=(TextView) view.findViewById(R.id.countryNameId);

        imageView1.setImageResource(flags[i]);
        textView1.setText(countryNames[i]);

        return view;
    }
}
