package com.example.imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView jaimg,jtimg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jaimg=(ImageView) findViewById(R.id.animg);
        jtimg=(ImageView) findViewById(R.id.timg);
        jaimg.setOnClickListener(this);
        jtimg.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.animg){
            Toast.makeText(MainActivity.this,"anime-img",Toast.LENGTH_SHORT).show();
        }
        if(view.getId()==R.id.timg){
            Toast.makeText(MainActivity.this,"tree-img",Toast.LENGTH_SHORT).show();
        }
    }
}