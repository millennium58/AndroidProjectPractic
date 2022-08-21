package com.example.menubar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId()==R.id.setting){
            Toast.makeText(this,"settings",Toast.LENGTH_SHORT).show();
            return true;
        }
        if(item.getItemId()==R.id.about_us){
            Toast.makeText(this,"about us",Toast.LENGTH_SHORT).show();
            return true;
        }
        if(item.getItemId()==R.id.shareIt){
            Toast.makeText(this,"share it",Toast.LENGTH_SHORT).show();
            return true;
        }
        if(item.getItemId()==R.id.resource){
            Toast.makeText(this,"resourse",Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}