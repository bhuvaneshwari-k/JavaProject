package org.example;
public class Addition extends CalculatorOperation{
    Addition(double x,double y){
        super(x,y);
    }
    @Override
    public double calculate(){
        result=result+num1;
        return result;
    }
}