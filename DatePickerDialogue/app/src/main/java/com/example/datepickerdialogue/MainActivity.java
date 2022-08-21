package com.example.datepickerdialogue;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button;
    private TextView textView;
    private DatePickerDialog datePickerDialog;

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

        DatePickerDialog datePickerDialog =new DatePickerDialog(this);

        int currentYear=datePickerDialog.getDatePicker().getYear();
        int currentMonth=datePickerDialog.getDatePicker().getMonth();
        int currentDate=datePickerDialog.getDatePicker().getDayOfMonth();

        datePickerDialog = new DatePickerDialog(this,

                new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                            textView.setText(i2+"/"+(i1+1)+"/"+i);
                    }
                },currentYear,currentMonth,currentDate);

        datePickerDialog.show();


    }
}