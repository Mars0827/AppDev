package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    Button close;
    Button toastbtn;
    Button changeBG;
    Button changeBtnBG;
    Button disapper;
    Button connect;

    Button calculator;

    private View mainActivity;
    private int backgroundColor;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainActivity = findViewById(R.id.samting);

        close = (Button)findViewById(R.id.button6);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Na click ko");
                Intent intent = new Intent(
                        getApplicationContext(),MainActivity2.class);
                startActivity(intent);
            }
        });

        toastbtn = (Button)findViewById(R.id.button7);
        toastbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Toast", Toast.LENGTH_LONG).show();
            }
        });


        if (savedInstanceState != null) {
            backgroundColor = savedInstanceState.getInt("backgroundColor");
            mainActivity.setBackgroundColor(backgroundColor);
        }

        changeBtnBG = findViewById(R.id.button9);
        changeBtnBG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                backgroundColor = Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256));
                changeBtnBG.setBackgroundColor(backgroundColor);
            }
        });

        connect = (Button) findViewById(R.id.connectbtn);
        connect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        MainActivity.this, Connect_3.class);
                startActivity(intent);

                System.out.println("Na click ko");
            }
        });



        changeBG = (Button) findViewById(R.id.button8);
        changeBG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int color = Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256));
                mainActivity.setBackgroundColor(color);
            }
        });

        disapper = (Button) findViewById(R.id.button11);
        disapper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disapper.setVisibility(View.GONE);
            }
        });


        calculator = (Button) findViewById(R.id.button3);
        calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),Calculator.class);
                startActivity(intent);
            }
        });



    }
    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        // Save background color
        outState.putInt("backgroundColor", backgroundColor);
    }

}