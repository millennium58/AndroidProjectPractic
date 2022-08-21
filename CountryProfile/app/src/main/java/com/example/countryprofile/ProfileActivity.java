package com.example.countryprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    private TextView nameText,desText;
    private ImageView cuntImg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        cuntImg =(ImageView)findViewById(R.id.countryMapPic);
        nameText =(TextView) findViewById(R.id.countryTextName);
        desText =(TextView) findViewById(R.id.countryTextDescription);

        Bundle bundle = getIntent().getExtras();
        if(bundle!=null){
            String countryName= bundle.getString("name");

            showDetails(countryName);

        }

    }
    void showDetails(String countryName){
        if(countryName.equals("Bangladesh")){
            nameText.setText("Bangladesh");
            cuntImg.setImageResource(R.drawable.bangladesh);
            desText.setText(R.string.BangladeshText);
        }

        else if(countryName.equals("India")){
            nameText.setText("India");
            cuntImg.setImageResource(R.drawable.india);
            desText.setText(R.string.IndiaText);
        }
        else if(countryName.equals("Pakistan")){
            nameText.setText("Pakistan");
            cuntImg.setImageResource(R.drawable.pakistan);
            desText.setText(R.string.PakistanText);
        }
    }
}