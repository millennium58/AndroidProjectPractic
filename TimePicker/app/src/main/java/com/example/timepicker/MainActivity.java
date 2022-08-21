package com.example.timepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textView;
    private Button button;
    private TimePicker timePicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=(TextView) findViewById(R.id.text);
        button=(Button) findViewById(R.id.btn);
        timePicker=(TimePicker) findViewById(R.id.timePick);
        timePicker.setIs24HourView(true);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        String str=timePicker.getCurrentHour()+":"+timePicker.getCurrentMinute();
        textView.setText(str);
    }
}