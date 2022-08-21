package com.example.alertdialogue;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button;
    private AlertDialog.Builder alertDialogBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=(Button) findViewById(R.id.btn);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        alertDialogBuilder=new AlertDialog.Builder(MainActivity.this);
        //ALERT TITLE TEXT
        alertDialogBuilder.setTitle(R.string.alert_text);
        //ALERT MSG
        alertDialogBuilder.setMessage(R.string.msg_text);
        //SET ALERT ICON
        alertDialogBuilder.setIcon(R.drawable.alert);

        alertDialogBuilder.setCancelable(false);
        //SET POSITIVE BUTTON
        alertDialogBuilder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        //SET NEGATIVE BUTTON
        alertDialogBuilder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
                Toast.makeText(MainActivity.this,"you have clicked on NO!",Toast.LENGTH_SHORT).show();
            }
        });
        //SET NEUTRAL BUTTON
        alertDialogBuilder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this,"you have clicked on Cancel!",Toast.LENGTH_SHORT).show();
            }
        });

        AlertDialog alertDialog =  alertDialogBuilder.create();
        alertDialog.show();
    }
}