package com.example.myexpendablelistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

public class CustomAdapter extends BaseExpandableListAdapter {

    private Context context;
    private List <String> ListDataHeader;
    private HashMap<String, List<String>> ListViewChildHashMap;

    CustomAdapter(Context context, List <String>ListDataHeader, HashMap<String, List<String>> ListDataChildHashMap){

        this.context=context;
        this.ListDataHeader=ListDataHeader;
        this.ListViewChildHashMap=ListDataChildHashMap;

    }


    @Override
    public int getGroupCount() {
        return ListDataHeader.size();
    }

    @Override
    public int getChildrenCount(int i) {
        return ListViewChildHashMap.get(ListDataHeader.get(i)).size();
    }

    @Override
    public Object getGroup(int i) {
        return ListDataHeader.get(i);
    }

    @Override
    public Object getChild(int i, int i1) {
        return ListViewChildHashMap.get(ListDataHeader.get(i)).get(i1);
    }

    @Override
    public long getGroupId(int i) {
        return i;
    }

    @Override
    public long getChildId(int i, int i1) {
        return i1;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {

        String header=(String) getGroup(i);
        if(view==null){
            LayoutInflater layoutInflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view=layoutInflater.inflate(R.layout.group_layout,null);
        }
        TextView textView =(TextView) view.findViewById(R.id.group_layout_TextViewId);
        textView.setText(header);
        return view;
    }

    @Override
    public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
        String child=(String) getChild(i,i1);

        if(view==null){
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view=layoutInflater.inflate(R.layout.child_layout,null);

        }
        TextView ctextView=(TextView) view.findViewById(R.id.childTextView);
        ctextView.setText(child);

        return view;
    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return true;
    }
}
