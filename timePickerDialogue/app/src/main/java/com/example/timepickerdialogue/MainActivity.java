package com.example.timepickerdialogue;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private TextView textView;
    private Button button;
    private TimePickerDialog timePickerDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView) findViewById(R.id.text);
        button=(Button) findViewById(R.id.btn);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        TimePicker timePicker = new TimePicker(this);
        int currentHour = timePicker.getCurrentHour();
        int currentMiniute=timePicker.getCurrentMinute();
    //    String time = timePicker.getCurrentHour()+":"+timePicker.getCurrentMinute();


        timePickerDialog = new TimePickerDialog(this,
                new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int i, int i1) {
                      //  String time = timePicker.getCurrentHour()+":"+timePicker.getCurrentMinute();

                        textView.setText(i+":"+i1);
                    }
                },currentHour,currentMiniute,true);
        timePickerDialog.show();
    }
}