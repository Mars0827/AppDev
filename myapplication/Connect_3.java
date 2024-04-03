package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class Connect_3 extends AppCompatActivity {

    int row0Counter = 4;
    int row1Counter = 4;
    int row2Counter = 4;
    int row3Counter = 4;
    int row4Counter = 4;

    int player = 0;
    final int[] COLOR = {Color.BLACK, Color.RED};
    Button[][] btn = new Button[5][5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connect3);



            for(int row = 0; row < 5; row++){
                for(int col = 0; col < 5; col++){
                    String btnName = "btnconnect" + row + col;
                    btn[row][col] = findViewById(this.getResources().getIdentifier(btnName,"id", this.getPackageName()));
                }
            }




        btn[0][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(player == 0){
                    btn[row0Counter][0].setBackgroundColor(COLOR[1]);
                    row0Counter--;
                    player = 1;
                } else {
                    btn[row0Counter][0].setBackgroundColor(COLOR[player]);
                    row0Counter--;
                    player = 0;
                }
            }
        });

        btn[0][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(player == 0){
                    btn[row1Counter][1].setBackgroundColor(COLOR[1]);
                    row1Counter--;
                    player = 1;
                } else {
                    btn[row1Counter][1].setBackgroundColor(COLOR[player]);
                    row1Counter--;
                    player = 0;
                }
            }
        });

        btn[0][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(player == 0){
                    btn[row2Counter][2].setBackgroundColor(COLOR[1]);
                    row2Counter--;
                    player = 1;
                } else {
                    btn[row2Counter][2].setBackgroundColor(COLOR[player]);
                    row2Counter--;
                    player = 0;
                }
            }
        });

        btn[0][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(player == 0){
                    btn[row3Counter][3].setBackgroundColor(COLOR[1]);
                    row3Counter--;
                    player = 1;
                } else {
                    btn[row3Counter][3].setBackgroundColor(COLOR[player]);
                    row3Counter--;
                    player = 0;
                }
            }
        });

        btn[0][4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(player == 0){
                    btn[row4Counter][4].setBackgroundColor(COLOR[1]);
                    row4Counter--;
                    player = 1;
                } else {
                    btn[row4Counter][4].setBackgroundColor(COLOR[player]);
                    row4Counter--;
                    player = 0;
                }
            }
        });
    }


}