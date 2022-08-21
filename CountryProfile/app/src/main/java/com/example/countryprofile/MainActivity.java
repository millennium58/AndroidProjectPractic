package com.example.countryprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button bdbutton,indbutton,pakbutton;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bdbutton=(Button) findViewById(R.id.bangladesh);
        indbutton=(Button) findViewById(R.id.india);
        pakbutton=(Button)findViewById(R.id.pakistan);

        bdbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId()==R.id.bangladesh){
                    intent = new Intent(MainActivity.this,ProfileActivity.class);
                    intent.putExtra("name","Bangladesh");
                    startActivity(intent);
                }


            }
        });

        indbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    if(view.getId()==R.id.india){
                    intent = new Intent(MainActivity.this,ProfileActivity.class);
                    intent.putExtra("name","India");
                    startActivity(intent);
                }
            }
        });

        pakbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    if(view.getId()==R.id.pakistan){
                    intent = new Intent(MainActivity.this,ProfileActivity.class);
                    intent.putExtra("name","Pakistan");
                    startActivity(intent);
                }
            }
        });
    }
}