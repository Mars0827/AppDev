package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class PassingIntentsExercise extends AppCompatActivity {

    private EditText fname, lname, bdate, phone, email, height, weight, address;
    private Button clear, submit;
    private RadioButton pole, npole, wpole, married, single;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passing_intent);

        //TextFields

        fname = (EditText) findViewById(R.id.fname);
        lname = findViewById(R.id.lname);
        bdate = findViewById(R.id.bdate);
        phone = findViewById(R.id.phone);
        email = findViewById(R.id.email);
        height = findViewById(R.id.height);
        weight = findViewById(R.id.weight);
        address = findViewById(R.id.address);



        //RadioButtons
        pole = findViewById(R.id.rMale);
        npole = findViewById(R.id.rFemale);
        wpole = findViewById(R.id.rOther);

        married = findViewById(R.id.rMarried);
        single = findViewById(R.id.rSingle);



        clear = findViewById(R.id.clearbtn);

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fname.setText("");
                lname.setText("");
                bdate.setText("");
                phone.setText("");
                email.setText("");
                bdate.setText("");
                height.setText("");
                weight.setText("");
                address.setText("");

            }
        });

        submit = findViewById(R.id.submitbtn);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String Fname = fname.getText().toString();
                String Lname = lname.getText().toString();

                String Gender = "";

                if(pole.isChecked()){
                    Gender = "Male";
                } else if (npole.isChecked()){
                    Gender ="Female";
                } else if(wpole.isChecked()){
                    Gender = "LGBTQ";
                }
                String Birthday = bdate.getText().toString();
                String Phone = phone.getText().toString();
                String Email = email.getText().toString();
                String Height = height.getText().toString();
                String Weight = weight.getText().toString();
                String Address = address.getText().toString();


                String Status = "";

                if(married.isChecked()){
                    Status = "Married";
                } else if(single.isChecked()){
                    Status = "Single";
                }


                Intent intent = new Intent(PassingIntentsExercise.this, PassingIntentsExercise2.class);
                intent.putExtra("fname_key", Fname);
                intent.putExtra("lname_key", Lname);
                intent.putExtra("gender_key", Gender);
                intent.putExtra("birthday_key", Birthday);
                intent.putExtra("phone_key", Phone);
                intent.putExtra("email_key", Email);
                intent.putExtra("height_key", Height);
                intent.putExtra("weight_key", Weight);
                intent.putExtra("address_key", Address);
                intent.putExtra("status_key", Status);

                startActivity(intent);





            }
        });


    }


}