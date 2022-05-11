package com.example.androidcalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    //
    // Объявляем поля
    //

    private TextView answer;
    private Button AC;
    private Button signChange;
    private Button divide100;
    private Button divide;
    private Button multiply;
    private Button minus;
    private Button plus;
    private Button nul;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button comma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //
        // Что-то написал, хз чего
        //

        final Button AC = (Button)findViewById(R.id.AC);
        final Button signChange = (Button)findViewById(R.id.signChange);
        final Button divide100 = (Button)findViewById(R.id.divide100);
        final Button divide = (Button)findViewById(R.id.divide);
        final Button multiply = (Button)findViewById(R.id.multiply);
        final Button minus = (Button)findViewById(R.id.minus);
        final Button plus = (Button)findViewById(R.id.plus);
        final Button nul = (Button)findViewById(R.id.nul);
        final Button one = (Button)findViewById(R.id.one);
        final Button two = (Button)findViewById(R.id.two);
        final Button three = (Button)findViewById(R.id.three);
        final Button four = (Button)findViewById(R.id.four);
        final Button five = (Button)findViewById(R.id.five);
        final Button six = (Button)findViewById(R.id.six);
        final Button seven = (Button)findViewById(R.id.seven);
        final Button eight = (Button)findViewById(R.id.eight);
        final Button nine = (Button)findViewById(R.id.nine);
        final Button comma = (Button)findViewById(R.id.comma);

        //
        // Обработчик кнопок
        //

        AC.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}