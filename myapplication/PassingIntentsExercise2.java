package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PassingIntentsExercise2 extends AppCompatActivity {

    private EditText tfname, tlname, tgender, tbirthday, tphonenumber, temail, theight, tweight, taddress, tstatus;
    private Button btnreturn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passing_intents_exercise2);

        tfname = findViewById(R.id.tvFname1);
        tlname = findViewById(R.id.tvLname1);
        tgender = findViewById(R.id.tvGender1);
        tbirthday = findViewById(R.id.tvBirthday1);
        tphonenumber = findViewById(R.id.tvPhone1);
        temail = findViewById(R.id.tvLEmail1);
        theight = findViewById(R.id.tvHeight1);
        tweight = findViewById(R.id.tvWeight1);
        taddress = findViewById(R.id.tvAddress1);
        tstatus = findViewById(R.id.tvStatus1);

        btnreturn = (Button) findViewById(R.id.btnReturn);

        Intent intent = getIntent();

        String fname = intent.getStringExtra("fname_key");
        String lname = intent.getStringExtra("lname_key");
        String gender = intent.getStringExtra("gender_key");
        String birthday = intent.getStringExtra("birthday_key");
        String phone = intent.getStringExtra("phone_key");
        String email = intent.getStringExtra("email_key");
        String height = intent.getStringExtra("height_key");
        String weight = intent.getStringExtra("weight_key");
        String address = intent.getStringExtra("address_key");
        String status = intent.getStringExtra("status_key");

        tlname.setText(fname);
        tlname.setText(lname);
        tgender.setText(gender);
        tbirthday.setText(birthday);
        tphonenumber.setText(phone);
        temail.setText(email);
        theight.setText(height);
        tweight.setText(weight);
        taddress.setText(address);
        tstatus.setText(status);

        btnreturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });



    }
}