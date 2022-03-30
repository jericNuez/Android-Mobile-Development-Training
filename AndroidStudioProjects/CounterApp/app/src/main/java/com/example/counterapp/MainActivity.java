package com.example.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button incBtn, decBtn;

    TextView counterTxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        incBtn = findViewById(R.id.incrementBtn);

        decBtn = findViewById(R.id.decrementBtn);

        counterTxt = findViewById(R.id.counterTxt);
        incBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int temp_counter = Integer.parseInt(String.valueOf(counterTxt.getText()));
                if (temp_counter >= 10){
                    Toast.makeText(MainActivity.this, "You have reached the maximum value", Toast.LENGTH_SHORT).show();
                }
                else {
                    temp_counter += 1;
                }

                counterTxt.setText(String.valueOf(temp_counter));
            }
        });

        decBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int temp_counter = Integer.parseInt(String.valueOf(counterTxt.getText()));
                if (temp_counter <= 0){
                    Toast.makeText(MainActivity.this, "You have reached the maximum value", Toast.LENGTH_SHORT).show();
                }
                else {
                    temp_counter -= 1;
                }
                counterTxt.setText(String.valueOf(temp_counter));
            }
        });
    }
}