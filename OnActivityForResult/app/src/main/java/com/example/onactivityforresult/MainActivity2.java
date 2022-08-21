package com.example.onactivityforresult;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private Button button1;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button1=(Button) findViewById(R.id.btn1);
        editText=(EditText) findViewById(R.id.text1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value=editText.getText().toString();
                Intent intent = new Intent(MainActivity2.this,MainActivity.class);
                intent.putExtra("tag",value);
              //  startActivity(intent);
                setResult(1,intent);
                finish();
            }
        });
    }
}