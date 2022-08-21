package com.example.zoomcontrol;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ZoomControls;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private ZoomControls zoomControls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView=(ImageView) findViewById(R.id.img);
        zoomControls=(ZoomControls) findViewById(R.id.zoom_cntrol);

        zoomControls.setOnZoomInClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"zoom in",Toast.LENGTH_SHORT).show();
                float x=imageView.getScaleX();
                float y =imageView.getScaleY();

                imageView.setScaleX((float)x+1);
                imageView.setScaleY((float)y+1);
            }
        });

        zoomControls.setOnZoomOutClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"zoom out",Toast.LENGTH_SHORT).show();
                float x=imageView.getScaleX();
                float y =imageView.getScaleY();

                imageView.setScaleX((float) x-1);
                imageView.setScaleY((float)y-1);
            }
        });
    }
}