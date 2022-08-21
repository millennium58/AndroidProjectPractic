package com.example.edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText jnum1,jnum2;
    private Button jadd,jsub,jmul,jdiv;
    private TextView jresult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jnum1=(EditText) findViewById(R.id.num1);
        jnum2=(EditText) findViewById(R.id.num2);

        jadd=(Button) findViewById(R.id.addBtn);
        jsub=(Button) findViewById(R.id.subBtn);
        jmul=(Button) findViewById(R.id.mulBtn);
        jdiv=(Button) findViewById(R.id.divBtn);

        jresult=(TextView) findViewById(R.id.result);

        jadd.setOnClickListener(this);
        jsub.setOnClickListener(this);

        jmul.setOnClickListener(this);
        jdiv.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
     try {
         String str1,str2;
         str1=jnum1.getText().toString();
         str2=jnum2.getText().toString();
         double sum=0,val1,val2;
         val1=Double.parseDouble(str1);
         val2=Double.parseDouble(str2);
         if(view.getId()==R.id.addBtn){
             sum=val1+val2;
             jresult.setText("answer is: "+sum);
         }
         else if(view.getId()==R.id.subBtn){
             sum=val1-val2;
             jresult.setText("answer is: "+sum);
         }
         else if(view.getId()==R.id.mulBtn){
             sum=val1*val2;
             jresult.setText("answer is: "+sum);
         }
         else if(view.getId()==R.id.divBtn){
             if(val2==0){
                 jresult.setText("error!");
             }
             else{
                 sum=val1/val2;
                 jresult.setText("answer is: "+sum);
             }
         }
     }catch (Exception e){
         Toast.makeText(MainActivity.this,"enter a number please",Toast.LENGTH_SHORT).show();
     }
    }
}