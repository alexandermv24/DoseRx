package com.example.mattalexander.dose;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainMenu extends LogIn {

    public Button calendar1;
    public Button doctalk1;
    public Button druginfo1;
    public Button addmed1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        TextView t = (TextView) findViewById(R.id.textView4);
        Intent intent = getIntent();
        t.setText("Welcome "+ intent.getStringExtra("femail"));
        calendar1 = (Button)findViewById(R.id.button8);
        doctalk1 = (Button)findViewById(R.id.button7);
        druginfo1 = (Button)findViewById(R.id.button6);
        addmed1 = (Button)findViewById(R.id.button5);

        calendar1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent myintent2 = new Intent(MainMenu.this, Calendar.class);
                startActivity(myintent2);

            }
        });
        doctalk1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent myintent2 = new Intent(MainMenu.this, DocTalk.class);
                startActivity(myintent2);

            }
        });
        druginfo1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent myintent2 = new Intent(MainMenu.this, DrugInfo.class);
                startActivity(myintent2);

            }
        });
        addmed1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent myintent2 = new Intent(MainMenu.this, AddMed.class);
                startActivity(myintent2);

            }
        });
    }
}
