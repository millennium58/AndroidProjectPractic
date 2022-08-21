package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{


    private TextView nameTextView,ageTextView,logInTextView,logOutTextView;
    private Button logInBtn,logOutBtn;
    int cnt=0,mnt=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameTextView= (TextView)findViewById(R.id.nameTextViewId);
        nameTextView.setText("appel");

        ageTextView=(TextView)findViewById((R.id.ageTextView));
        ageTextView.setText("22");

        logInTextView=(TextView)findViewById((R.id.logInBtnText));
        logOutTextView=(TextView)findViewById((R.id.logOutBtnText));

        logInBtn=(Button) findViewById(R.id.logInBtn);
        logOutBtn=(Button) findViewById(R.id.logOutBtn);






        // Handeler h = new Handeler();

//        logInBtn.setOnClickListener(h);
//        logOutBtn.setOnClickListener(h);



    }

    public void showMsg(View view) {
        if(view.getId()==R.id.logInBtn){
            //logInTextView.setText("log in is clicked");
            //Toast.makeText(MainActivity.this,"log in is clicked!",Toast.LENGTH_SHORT).show();


            //make in center toast
//            Toast toast=Toast.makeText(MainActivity.this,"log in is clicked",Toast.LENGTH_SHORT);
//            toast.setGravity(Gravity.CENTER,0,0);
//            toast.show();
            Log.d("key","log out button is clicked!");
        }

        else if(view.getId()==R.id.logOutBtn){
            //logOutTextView.setText("log out is clicked");
          //  Toast.makeText(MainActivity.this,"log out is cliced!",Toast.LENGTH_SHORT).show();

            //make in center toast
//            Toast toast=Toast.makeText(MainActivity.this,"log out is clicked",Toast.LENGTH_SHORT);
//            toast.setGravity(Gravity.CENTER,0,0);
//            toast.show();

            Log.d("key","log out button is clicked!");
        }
    }


    //    class Handeler implements View.OnClickListener{
//
//        @Override
//        public void onClick(View view) {
//
//            if(view.getId()==R.id.logInBtn){
//                logInTextView.setText(("log in button is clicked!"));
//            }
//            else if(view.getId()==R.id.logOutBtn){
//                logOutTextView.setText("log out button is clicked!");
//            }
//
//        }
//    }


//    public void onClick(View view) {
//        if(view.getId()==R.id.logInBtn){
//            cnt++;
//            logInTextView.setText("log in btn clicked!"+cnt);
//        }
//        else if(view.getId()==R.id.logOutBtn){
//            mnt++;
//            logOutTextView.setText("log out button is clicked!"+mnt);
//        }
//    }
}