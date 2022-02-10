package com.example.mynewapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Register extends AppCompatActivity {
EditText e1,e2,e3,e4,e5,e6,e7;
AppCompatButton b1;
string getname,getaddress,getphone,getmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        e1=(EditText) findViewById(R.id.name);
        e2=(EditText) findViewById(R.id.address);
        e3=(EditText) findViewById(R.id.phone);
        e4=(EditText) findViewById(R.id.mail);
        e5=(EditText) findViewById(R.id.user);
        e6=(EditText) findViewById(R.id.pass);
        e7=(EditText) findViewById(R.id.Cpass);
        b1=(AppCompatButton) findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}