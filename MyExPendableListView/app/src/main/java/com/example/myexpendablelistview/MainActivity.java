package com.example.myexpendablelistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ExpandableListView expandableListView;
    List <String> ListDataHeader;
   // List<String>Child;
    HashMap<String,List<String>>ListDataChildHashMap;
    private CustomAdapter customAdapter;
    private int lastExpendablePos=-1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        prepareListData();

        expandableListView=(ExpandableListView) findViewById(R.id.expandableListViewId);
        customAdapter = new CustomAdapter(this,ListDataHeader,ListDataChildHashMap);
        expandableListView.setAdapter(customAdapter);

        expandableListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {
            @Override
            public boolean onGroupClick(ExpandableListView expandableListView, View view, int i, long l) {
                String groupName=ListDataHeader.get(i);
                Toast.makeText(getApplicationContext(),groupName,Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        expandableListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {
            @Override
            public void onGroupCollapse(int i) {
                String groupName=ListDataHeader.get(i);
                Toast.makeText(getApplicationContext(),groupName+"is collapse",Toast.LENGTH_SHORT).show();
            }
        });

        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i1, long l) {
                String childString=ListDataChildHashMap.get(ListDataHeader.get(i)).get(i1);
                Toast.makeText(getApplicationContext(),childString,Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int i) {
                if(lastExpendablePos!=-1 && lastExpendablePos!=i){
                    expandableListView.collapseGroup(lastExpendablePos);
                }
                lastExpendablePos=i;
            }
        });


    }
    void prepareListData(){
        String[] header=getResources().getStringArray(R.array.country_Names_Header);
        String[]child=getResources().getStringArray(R.array.Desdcription_child);

        ListDataHeader=new ArrayList<>();
        ListDataChildHashMap=new HashMap<>();

        for(int i=0;i<header.length;i++){
            ListDataHeader.add(header[i]);
            List<String>Child=new ArrayList<>();
            Child.add(child[i]);

            ListDataChildHashMap.put(ListDataHeader.get(i),Child);
        }

    }
}