package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class ColorMatching extends AppCompatActivity {

    Button[][] btn;

    final int[] color = {Color.BLUE, Color.RED, Color.YELLOW};

    private int num;

    Button reset;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_batch1);


        btn = new Button[][]{
                {findViewById(R.id.btn11), findViewById(R.id.btn12), findViewById(R.id.btn13)},
                {findViewById(R.id.btn21), findViewById(R.id.btn22), findViewById(R.id.btn23)},
                {findViewById(R.id.btn31), findViewById(R.id.btn32), findViewById(R.id.btn33)}
        };

        final int[] click = {0};


        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                int row = i;
                int col = j;

                btn[row][col].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Random random = new Random();
                        //num[0] = random.nextInt(2);

                        btn[row][col].setBackgroundColor(color [click[0]]);
                        System.out.println("Na click ko");
                        click[0]++;
                    }
                });
            }
        }





    }
}