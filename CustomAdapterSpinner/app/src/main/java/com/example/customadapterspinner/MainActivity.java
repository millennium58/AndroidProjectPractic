package com.example.customadapterspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {


    private Spinner spinner;
    private TextView textView;
    private Button button;
    String val;

    String []countryNames;

    int []flags={R.drawable.bangladesh,R.drawable.india,R.drawable.pakistan,R.drawable.srilanka,R.drawable.bhutan,R.drawable.nepal};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner=(Spinner) findViewById(R.id.spinnerId);
        textView=(TextView) findViewById(R.id.textViewId);
        button=(Button) findViewById(R.id.buttonId);

        countryNames=getResources().getStringArray(R.array.country_name);
        CustomAdapter customAdapter = new CustomAdapter(MainActivity.this,countryNames,flags);

        spinner.setAdapter(customAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),countryNames[i],Toast.LENGTH_SHORT).show();
                val=countryNames[i];
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             //   String l=spinner.getSelectedItem().toString();
                textView.setText(val);
            }
        });
    }
}