package org.example.calculator;
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
