package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText firstNumber = findViewById(R.id.number1);
        final EditText secondNumber = findViewById(R.id.number2);
        final Button addition = findViewById(R.id.addition);
        final Button subtraction = findViewById(R.id.subtraction);
        final TextView result = findViewById(R.id.result);
        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int firstNumberValue = Integer.parseInt(firstNumber.getText().toString());
                final int secondNumberValue = Integer.parseInt(secondNumber.getText().toString());
                Integer answer;
                answer = firstNumberValue + secondNumberValue;
                result.setText(answer.toString());
            }
        });
        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int firstNumberValue = Integer.parseInt(firstNumber.getText().toString());
                final int secondNumberValue = Integer.parseInt(secondNumber.getText().toString());
                Integer answer;
                answer = firstNumberValue - secondNumberValue;
                result.setText(answer.toString());

            }
        });
    }

}