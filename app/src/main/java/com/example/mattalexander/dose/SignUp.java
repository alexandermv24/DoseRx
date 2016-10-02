package com.example.mattalexander.dose;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class SignUp extends MainActivity implements View.OnClickListener {

        Button b4;
    EditText et;
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_sign_up);

            et = (EditText) findViewById(R.id.editText);
            b4 = (Button) findViewById(R.id.button4);
            b4.setOnClickListener(this);

        }

    @Override
    public void onClick(View v){
        Intent intent = new Intent(this, MainMenu.class);
        intent.putExtra("femail", et.getText().toString());
        startActivity(intent);
    }
    }

