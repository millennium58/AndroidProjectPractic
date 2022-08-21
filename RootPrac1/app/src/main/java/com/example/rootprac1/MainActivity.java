package com.example.rootprac1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageView newsImageView;
    private Button logInBtn;
    private ListView listView;
    private String[] listContents;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        newsImageView=(ImageView) findViewById(R.id.newsId);
        listView=(ListView)findViewById(R.id.listView);
        listContents=getResources().getStringArray(R.array.list_content);
        ArrayAdapter<String>arrayAdapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,listContents);
        listView.setAdapter(arrayAdapter);

        newsImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId()==R.id.newsId){
                    Toast.makeText(getApplicationContext(),"news id is clicked",Toast.LENGTH_SHORT).show();
                }
            }
        });

        logInBtn=(Button)findViewById(R.id.LogInBtnId);
        logInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,LogInActivity.class);
                startActivity(intent);
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            Fragment fragment;
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){
                     fragment= new NewsFragment();
                    getFragmentManager().beginTransaction().replace(R.id.fragmentId,fragment).commit();
                }
            }
        });
    }
}