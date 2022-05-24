package com.anne.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private Button register;
    private EditText firstnamein;
    private EditText lastnamein;
    private EditText email;
    private TextView firstname;
    private TextView lastname;
    private TextView emailadd;
    private TextView regc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Registration");
        firstnamein=findViewById(R.id.firstname);
       // firstnamein.getText().toString();
        lastnamein=findViewById(R.id.lastname);
       // lastnamein.getText().toString();
        email=findViewById(R.id.editTextTextEmailAddress);
       // email.getText().toString();
        firstname=findViewById(R.id.textViewfirstname);
        lastname=findViewById(R.id.textViewLastname);
        emailadd=findViewById(R.id.textViewemail);
        register=findViewById(R.id.register);
        regc=findViewById(R.id.regconfirm);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstname.setText("Firstname:"+firstnamein.getText().toString());
                lastname.setText("Lastname:"+lastnamein.getText().toString());
                emailadd.setText("Email:"+email.getText().toString());
                regc.setText("Registration Confirmed!");
            }
        });


    }
}