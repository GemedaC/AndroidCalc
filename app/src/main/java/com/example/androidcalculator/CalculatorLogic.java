package com.example.androidcalculator;

import android.app.Activity;

public class CalculatorLogic {

    private float firstArgument;
    private float secondArgument;
    private int actionSelected;
    private State state;
    private StringBuilder inputStr = new StringBuilder();

    private enum State {
        firstArgumentInput,
        secondArgumentInput,
        resultShow
    }


    //
    // Конструктор инициализации полей
    //

    public CalculatorLogic() {
        state = State.firstArgumentInput;
    }

    //
    // Логика работы при нажатии цифр
    //

    public void onNumberPressed (int buttonId) {

        if (state == State.resultShow) {
            state = State.firstArgumentInput;
            inputStr.setLength(0);
        }

        if (inputStr.length() < 9) {
            switch (buttonId) {
                case R.id.zero:
                    if (inputStr.length() != 0) {
                        inputStr.append("0");
                    }
                    break;
                case R.id.one:
                    inputStr.append("1");
                    break;
                case R.id.two:
                    inputStr.append("2");
                    break;
                case R.id.three:
                    inputStr.append("3");
                    break;
                case R.id.four:
                    inputStr.append("4");
                    break;
                case R.id.five:
                    inputStr.append("5");
                    break;
                case R.id.six:
                    inputStr.append("6");
                    break;
                case R.id.seven:
                    inputStr.append("7");
                    break;
                case R.id.eight:
                    inputStr.append("8");
                    break;
                case R.id.nine:
                    inputStr.append("9");
                    break;
            }
        }
    }

    //
    // Логика работы при арифм. операциях и нажатии равно
    //

    public void onActionPressed (int actionId) {

        if (actionId == R.id.equals && state == State.secondArgumentInput) {
            secondArgument = Integer.parseInt(inputStr.toString());
            state = State.resultShow;
            inputStr.setLength(0);
            switch (actionSelected) {
                case R.id.AC:
                    inputStr.setLength(0);
                    break;
                case R.id.division:
                    inputStr.append(firstArgument / secondArgument);
                    break;
                case R.id.multiply:
                    inputStr.append(firstArgument * secondArgument);
                    break;
                case R.id.plus:
                    inputStr.append(firstArgument + secondArgument);
                    break;
                case R.id.minus:
                    inputStr.append(firstArgument - secondArgument);
                    break;
            }
        }

        /*

        else if (actionId == R.id.division100 && state == State.secondArgumentInput) {
            switch (actionSelected) {
                case R.id.division100:
                    inputStr.append(secondArgument = Integer.parseInt(inputStr.toString()) / 100);
                    break;
            }
        }

        else if (actionId == R.id.signChange && state == State.secondArgumentInput) {
            switch (actionSelected) {
                case R.id.signChange:
                    inputStr.append(secondArgument = Integer.parseInt(inputStr.toString()) * -1);
                    break;
            }
        }

         */

        else if (inputStr.length() > 0 && state == State.firstArgumentInput) {
            firstArgument = Integer.parseInt(inputStr.toString());
            state = State.secondArgumentInput;
            inputStr.setLength(0);
            switch (actionId) {
                case R.id.AC:
                    actionSelected = R.id.AC;
                    break;
                case R.id.signChange:
                    actionSelected = R.id.signChange;
                    break;
                case R.id.division100:
                    actionSelected = R.id.division100;
                    break;
                case R.id.division:
                    actionSelected = R.id.division;
                    break;
                case R.id.multiply:
                    actionSelected = R.id.multiply;
                    break;
                case R.id.plus:
                    actionSelected = R.id.plus;
                    break;
                case R.id.minus:
                    actionSelected = R.id.minus;
                    break;
            }
        }
    }

    //
    // Метод для вывода вводимых чисел и ответа
    //

    public String getText() {
        return inputStr.toString();
    }

}
