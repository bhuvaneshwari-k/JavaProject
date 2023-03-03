package org.example.calculator;

import org.example.calculator.CalculatorOperation;

public class Subtraction extends CalculatorOperation {
    Subtraction(double x,double y){
        super(x,y);
    }
    @Override
    public double calculate(){
        result=result-num1;
        return result;
    }
}