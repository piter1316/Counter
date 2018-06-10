package com.example.licznik;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void updateNumber() {
        TextView text = findViewById(R.id.counter);
        String newNumber;
        newNumber = String.valueOf(counter);
        text.setText(newNumber);
    }

    public void zwieksz(View viev){

        counter++;
        updateNumber();
    }

    public void zmniejsz(View viev){

        counter--;
        updateNumber();
    }
    public void wyzeruj(View viev){

        counter=0;
        updateNumber();
    }

    public void wlasnaLiczba(View view){

        EditText editText = (EditText) findViewById(R.id.editNumber);
        Editable text1= editText.getText();
        String newNumber = String.valueOf(text1);
        TextView text = findViewById(R.id.counter);

        text.setText(newNumber);
        counter = Integer.parseInt(editText.getText().toString());


    }
}
