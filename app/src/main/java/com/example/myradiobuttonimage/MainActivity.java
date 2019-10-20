package com.example.myradiobuttonimage;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radiogroup);
        imageView = findViewById(R.id.viewimage);


        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {
                if (i == R.id.birdone){
                    imageView.setImageResource(R.drawable.bird);
                    Toast.makeText(MainActivity.this, "Agent Angry Bird: Activated", Toast.LENGTH_SHORT).show();
                }
                else if(i == R.id.birdtwo){
                    imageView.setImageResource(R.drawable.bird2);
                    Toast.makeText(MainActivity.this, "Agent Goofy: Activated", Toast.LENGTH_SHORT).show();
                }
                else if(i == R.id.birdthree){
                    imageView.setImageResource(R.drawable.bird3);
                    Toast.makeText(MainActivity.this, "Agent has no idea what's going on: Activated", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}




