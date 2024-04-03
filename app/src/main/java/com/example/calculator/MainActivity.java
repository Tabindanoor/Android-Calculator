package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {

    TextView text, solution;


    Button one, two, three, four, five, six, seven, eight, nine , zero, plus, minus, multiply, divide, clear, removeOne,equal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.text);
        solution = findViewById(R.id.solution);
        one = findViewById(R.id.one);
        two  = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four= findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        zero = findViewById(R.id.zero);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.divide);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        clear = findViewById(R.id.clear);
        removeOne = findViewById(R.id.removeOne);
        equal = findViewById(R.id.equal);

    }
}