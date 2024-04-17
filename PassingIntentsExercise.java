package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class PassingIntentsExercise extends AppCompatActivity {

    private EditText fname, lname, bdate, phone, email, height, weight;
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



        //RadioButtons
        pole = findViewById(R.id.rMale);
        npole = findViewById(R.id.rFemale);
        wpole = findViewById(R.id.rOther);


        clear = findViewById(R.id.clearbtn);

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fname.setText("");
                lname.setText("");
                bdate.setText("");
                phone.setText("");
                email.setText("");

            }
        });

        submit = findViewById(R.id.submitbtn);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String Fname = fname.getText().toString();
                String Lname = lname.getText().toString();

                String Gender;

                if(pole.isChecked()){
                    Gender = "Male";
                } else if (npole.isChecked()){
                    Gender ="Female";
                }

            }
        });


    }


}