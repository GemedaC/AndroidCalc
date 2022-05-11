package com.example.androidcalculator;

import android.app.Activity;

public class CalculatorLogic {

    private float firstArgument;
    private float secondArgument;
    private State state;

    private enum State {
        firstArgument,
        secondArgument,
        resultShow
    }

    StringBuilder inputStr = new StringBuilder();

    //
    // Конструктор инициализации полей
    //

    public CalculatorLogic() {
        state = State.firstArgument;
    }

    //
    // Реакция на нажатие кнопок с цифрами
    //

    public void onNumberPressed (int buttonId) {

    }

    //
    // Реакция на нажатие кнопок равно и арифм. действий
    //

    public void onActionPressed (int actionId) {

    }

}
