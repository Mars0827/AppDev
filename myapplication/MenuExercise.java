package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class MenuExercise extends AppCompatActivity {

    private Button btnmagic;

    @SuppressLint({"ResourceType", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_exercise);

        btnmagic = findViewById(R.id.btnMagic);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_menuexercise, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        Random random = new Random();
        if(item.getItemId() == R.id.change){
            Toast.makeText(this, "Edit Item is Clicked", Toast.LENGTH_SHORT).show();
        } else if(item.getItemId() == R.id.mchangeColor){
            int color = Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256));
            btnmagic.setBackgroundColor(color);
        } else if(item.getItemId() == R.id.menlarge){
            ViewGroup.LayoutParams params = btnmagic.getLayoutParams();

            params.width = (int)(btnmagic.getWidth() * 1.5);
            params.height = (int)(btnmagic.getHeight() * 1.5);

            btnmagic.setLayoutParams(params);
        } else if(item.getItemId() == R.id.mshrink){
            ViewGroup.LayoutParams params = btnmagic.getLayoutParams();

            params.width = (int)(btnmagic.getWidth() * 0.75);
            params.height = (int)(btnmagic.getHeight() * 0.75);

            btnmagic.setLayoutParams(params);
        } else if(item.getItemId() == R.id.mchangeTColor){
            int color = Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256));
            btnmagic.setTextColor(color);
        } else if(item.getItemId() == R.id.mreset){
            ViewGroup.LayoutParams params = btnmagic.getLayoutParams();

            int desiredWidthInDp = 143;
            int desiredHeightInDp = 143;

            float scale = getResources().getDisplayMetrics().density;
            int desiredWidthInPixels = (int) (desiredWidthInDp * scale + 0.5f);
            int desiredHeightInPixels = (int) (desiredHeightInDp * scale + 0.5f);

            params.width = desiredWidthInPixels;
            params.height = desiredHeightInPixels;

            btnmagic.setLayoutParams(params);

            btnmagic.setBackgroundColor(Color.WHITE);
            btnmagic.setTextColor(Color.BLACK);
        } else if(item.getItemId() == R.id.mexit){
            finish();
        }

        return true;
    }

}