package org.example.calculator;

public abstract class CalculatorOperation{
    protected double result;
    protected double num1;
    CalculatorOperation(double x,double y){
        result=x;
        num1=y;
    }
    public abstract double calculate();
}