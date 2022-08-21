package com.example.searchview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView listView;
    private SearchView searchView;
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=(ListView) findViewById(R.id.listview);
        searchView=(SearchView)findViewById(R.id.searchView);
        String[] country_Names=listView.getResources().getStringArray(R.array.countryNames);
        arrayAdapter = new ArrayAdapter<String>(MainActivity.this,R.layout.sample_view,R.id.text,country_Names);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(this);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                arrayAdapter.getFilter().filter(s);
                return false;
            }
        });

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String value=arrayAdapter.getItem(i);
        Toast.makeText(this,value,Toast.LENGTH_SHORT).show();
    }
}