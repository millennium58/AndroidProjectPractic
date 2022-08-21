package com.example.mycustomadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private String[] countryNames;
    private int[] flags={R.drawable.bangladesh,R.drawable.india,R.drawable.pakistan,R.drawable.srilanka,R.drawable.bhutan,R.drawable.nepal};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.lstView);
        countryNames=getResources().getStringArray(R.array.country_name);

        CustomAdapter customAdapter = new CustomAdapter(MainActivity.this,countryNames,flags);
        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String val=countryNames[i];
                Toast.makeText(MainActivity.this,val+" "+(i+1),Toast.LENGTH_SHORT).show();
            }
        });

    }
}