package com.example.chakebox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CheckBox chake1,chake2;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chake1=(CheckBox) findViewById(R.id.chake1);
        chake2=(CheckBox) findViewById(R.id.chake2);

        text=(TextView) findViewById(R.id.textBox1);

        chake1.setOnClickListener(this);
        chake2.setOnClickListener(this);

    }
    int cnt=0,mnt=0;

    @Override
    public void onClick(View view) {
        int cnt=0;
        StringBuilder strBuilder=new StringBuilder();
        if(chake1.isChecked()){
            String str=chake1.getText().toString();
            strBuilder.append(str+" is chaked ");
            cnt++;

        }
        else if(chake2.isChecked()){
            String str=chake2.getText().toString();
            strBuilder.append(str+" is chaked ");
            cnt++;
            if(cnt==1){
            }
            else{
                cnt=0;
            }
        }
        if(cnt==1){
            text.setText(strBuilder);

        }
        else{
            Toast.makeText(MainActivity.this,"only one can select",Toast.LENGTH_SHORT).show();
        }



    }
}