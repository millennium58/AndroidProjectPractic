package com.example.mygridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private GridView gridView;
    int []flags={R.drawable.bangladesh,R.drawable.india,R.drawable.pakistan,R.drawable.srilanka,R.drawable.bhutan,R.drawable.nepal};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String[] countryNames=getResources().getStringArray(R.array.country_name);
        gridView = (GridView) findViewById(R.id.gridViewId);
        CustomAdapter adapter = new CustomAdapter(this,flags,countryNames);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String str=countryNames[i];
                Toast.makeText(MainActivity.this,str+" "+i+" "+l,Toast.LENGTH_SHORT).show();
            }
        });
    }

}