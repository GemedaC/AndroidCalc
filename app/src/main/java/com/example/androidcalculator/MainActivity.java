package com.example.androidcalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //
        // Подключили логику
        //

        CalculatorLogic calculator;

        //
        // Создание массивов с id чисел и арифм. операций (кроме равно)
        //

        int[] numberId = new int[]{
                R.id.zero,
                R.id.one,
                R.id.two,
                R.id.three,
                R.id.four,
                R.id.five,
                R.id.six,
                R.id.seven,
                R.id.eight,
                R.id.nine,
                R.id.comma
        };

        int[] actionId = new int[]{
                R.id.division100,
                R.id.division,
                R.id.multiply,
                R.id.minus,
                R.id.plus,
        };

        //
        // Объявили новый объект класса логики
        //

        calculator = new CalculatorLogic();

        //
        // Обработчики событий для кнопок
        //

        View.OnClickListener numberButtonClickListener = new View.OnClickListener() { // для цифр

            @Override
            public void onClick(View v) {
                calculator.onNumberPressed(v.getId());
            }
        };

        View.OnClickListener actionButtonOnClick = new OnClickListener() { // для арифм. операций
            @Override
            public void onClick(View v) {
                calculator.onActionPressed(v.getId());
            }
        };

        //
        // Цикл для получения id цифр и установки им обработчика
        //

        for (int i = 0; i < numberId.length; i++) {
            findViewById(numberId[i]).setOnClickListener(numberButtonClickListener);
        }

        //
        // Цикл для получения id арифм. операций и установки им обработчика
        //

        for (int i = 0; i < actionId.length; i++) {
            findViewById(actionId[i]).setOnClickListener(actionButtonOnClick);
        }

    }

}
