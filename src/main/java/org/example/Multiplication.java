package org.example;

public class Multiplication extends CalculatorOperation{
    Multiplication(double x,double y){
        super(x,y);
    }
    @Override
    public double calculate(){
        result=result*num1;
        return result;
    }
}