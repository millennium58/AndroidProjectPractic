package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private TextView textView;
    private Button button;

    String[] countryNames;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner=(Spinner) findViewById(R.id.SpinnerId);
        button=(Button) findViewById(R.id.ButtonId);
        textView=(TextView) findViewById(R.id.TextViewId);

        countryNames=getResources().getStringArray(R.array.country_name);

        ArrayAdapter<String>arrayAdapter=new ArrayAdapter<>(MainActivity.this,R.layout.sample_view,R.id.textViewSampleId,countryNames);
        spinner.setAdapter(arrayAdapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=spinner.getSelectedItem().toString();
                textView.setText(str);
            }
        });



    }
}