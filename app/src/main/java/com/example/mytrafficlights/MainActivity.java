package com.example.mytrafficlights;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickGreen(View view)
    {
        ConstraintLayout constraintLayout = findViewById(R.id.main);
        constraintLayout.setBackgroundColor(Color.parseColor("#25EA5D"));
    }
    public void onClickPink(View view)
    {
        ConstraintLayout constraintLayout = findViewById(R.id.main);
        constraintLayout.setBackgroundColor(Color.parseColor("#E661D5"));
    }
    public void onClickYellow(View view)
    {
        ConstraintLayout constraintLayout = findViewById(R.id.main);
        constraintLayout.setBackgroundColor(Color.parseColor("#F6E440"));
    }
}