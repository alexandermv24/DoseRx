package com.example.mattalexander.dose;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.util.Log;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {

    public Button login1;
    public Button signbut2;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login1 = (Button)findViewById(R.id.button);
        signbut2 = (Button)findViewById(R.id.button2);
        //login1.setOnClickListener(this);
        login1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent myintent2 = new Intent(MainActivity.this, LogIn.class);
                startActivity(myintent2);

            }
        });
        signbut2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent myintent2 = new Intent(MainActivity.this, SignUp.class);
                startActivity(myintent2);

            }
        });




    }



}
