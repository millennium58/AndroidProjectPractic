package com.example.activitywithcarryingvalue;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
//
//        textView = (TextView) findViewById(R.id.text);
//
//        Bundle bundle = getIntent().getExtras();
//        if(bundle!=null){
//            String value=bundle.getString("tag");
//            textView.setText(value);
//        }
    }
}