package com.example.licznik;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void zwieksz(View viev){

        counter++;
        TextView text = findViewById(R.id.counter);
        String newNumber;
        newNumber = String.valueOf(counter);
        text.setText(newNumber);


    }
    public void zmniejsz(View viev){

        counter--;
        TextView text = findViewById(R.id.counter);
        String newNumber;
        newNumber = String.valueOf(counter);
        text.setText(newNumber);


    }
    public void wyzeruj(View viev){

        counter=0;
        TextView text = findViewById(R.id.counter);
        String newNumber;
        newNumber = String.valueOf(counter);
        text.setText(newNumber);


    }
}
