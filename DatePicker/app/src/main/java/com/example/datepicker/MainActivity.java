package com.example.datepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textView;
    private Button button;
    private DatePicker datePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.text);
        button = (Button) findViewById(R.id.btn);
        datePicker = (DatePicker) findViewById(R.id.dateP);

        textView.setText(currentDate());
      //  Handler h = new Handler();
        button.setOnClickListener(this);
    }
    String currentDate(){
        StringBuilder str = new StringBuilder();
        str.append(datePicker.getDayOfMonth()+"/"+((datePicker.getMonth())+1)+"/"+datePicker.getYear());
        return str.toString();
    }


    @Override
    public void onClick(View view) {
            textView.setText(currentDate());
    }
}