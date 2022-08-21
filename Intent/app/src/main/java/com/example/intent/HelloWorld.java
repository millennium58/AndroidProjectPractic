package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HelloWorld extends AppCompatActivity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);

        textView=(TextView) findViewById(R.id.text);
        Bundle bundle = getIntent().getExtras();
        if(bundle!=null){
           String value= bundle.getString("tag");
           textView.setText(value);

        }

    }
}