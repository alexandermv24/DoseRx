package com.example.mattalexander.dose;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.EditText;

public class LogIn extends MainActivity implements View.OnClickListener {

    Button logInSubmit;
    EditText et5;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        et5 = (EditText) findViewById(R.id.editText5);
        logInSubmit = (Button) findViewById(R.id.button3);
        logInSubmit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        Intent intent = new Intent(LogIn.this, Notifications.class);
        intent.putExtra("femail", et5.getText().toString());
        startActivity(intent);
    }
}
