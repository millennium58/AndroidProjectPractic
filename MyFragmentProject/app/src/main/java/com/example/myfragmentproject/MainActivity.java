package com.example.myfragmentproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String []charecterNames;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=(ListView) findViewById(R.id.ListViewId);
        charecterNames=getResources().getStringArray(R.array.charecters);
        ArrayAdapter<String>arrayAdapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,charecterNames);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Fragment fragment;

                if(i==0){
                    fragment = new JackSparrow();
                    FragmentManager fragmentManager = getFragmentManager();
                    FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                     fragmentTransaction.replace(R.id.fragmentId, fragment);
                     fragmentTransaction.commit();


                }
                if(i==1){
                    fragment = new HanibalLecter();
                    getFragmentManager().beginTransaction().replace(R.id.fragmentId,fragment).commit();

                }
            }
        });
    }
}