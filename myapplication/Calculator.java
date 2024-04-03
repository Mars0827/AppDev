package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class Calculator extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        Button num0 = findViewById(R.id.num0);
        Button num1 = findViewById(R.id.num1);
        Button num2 = findViewById(R.id.num2);
        Button num3 = findViewById(R.id.num3);
        Button num4 = findViewById(R.id.num4);
        Button num5 = findViewById(R.id.num5);
        Button num6 = findViewById(R.id.num6);
        Button num7 = findViewById(R.id.num7);
        Button num8 = findViewById(R.id.num8);
        Button num9 = findViewById(R.id.num9);

        Button addition = findViewById(R.id.additionBtn);
        Button subtraction = findViewById(R.id.subtractionBtn);
        Button division = findViewById(R.id.divisionButton);
        Button multiplication = findViewById(R.id.multiplyBtn);
        Button dot = findViewById(R.id.decimalBtn);
        Button clear = findViewById(R.id.clear);
        Button percent = findViewById(R.id.percent);
        Button close = findViewById(R.id.close);
        Button equals = findViewById(R.id.equalsBtn);
        Button delete = findViewById(R.id.delete);


        TextView screen = findViewById(R.id.screen);
        TextView screen2 = findViewById(R.id.result);

        ArrayList<Button> nums = new ArrayList<>();

        nums.add(num0);
        nums.add(num1);
        nums.add(num2);
        nums.add(num3);
        nums.add(num4);
        nums.add(num5);
        nums.add(num6);
        nums.add(num7);
        nums.add(num8);
        nums.add(num9);

        for(Button b: nums){
            b.setOnClickListener(view -> {
                if(!screen.getText().toString().equals("0")){
                    screen.setText(screen.getText().toString() + b.getText().toString());
                } else {
                    screen.setText(b.getText().toString());
                }
            });
        }

        ArrayList<Button> opperations = new ArrayList<>();
        opperations.add(addition);
        opperations.add(subtraction);
        opperations.add(division);
        opperations.add(multiplication);
        opperations.add(addition);
        //opperations.add(equals);


        for(Button op: opperations){
            op.setOnClickListener(view -> {
                CharSequence text = screen.getText();
                int length = text.length();

                if(length > 0) {
                    if (Character.isDigit(text.charAt(length - 1))){
                        screen.setText(screen.getText().toString() + op.getText().toString());
                    } else {
                        screen.setText(text.subSequence(0, length-1)+ op.getText().toString());
                    }
                }
            });
        }

        clear.setOnClickListener(view -> {
            screen.setText("0");
            screen2.setText("0");
        });
        delete.setOnClickListener(view -> {
            CharSequence currentText = screen.getText();
            if (currentText.length() > 0) {
                CharSequence newText = currentText.subSequence(0, currentText.length() - 1);
                screen.setText(newText);
            }
        });



        equals.setOnClickListener(view -> screen2.setText("Hello World!"));
        dot.setOnClickListener(view ->{
            CharSequence text = screen.getText();
            int length = text.length();
            if (length > 0 && text.charAt(length - 1) != '.') {
                screen.setText(screen.getText().toString() + dot.getText().toString());
            }
            return;
        });


        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });


    }


}