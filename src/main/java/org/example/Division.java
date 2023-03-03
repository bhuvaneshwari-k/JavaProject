package org.example;


import java.util.logging.Level;
import java.util.logging.Logger;

public class Division extends CalculatorOperation{
    Logger log=Logger.getLogger("calculator");
    Division(double x,double y){
        super(x,y);
    }
    @Override
    public double calculate(){
        try {
            result = result / num1;
            if(num1==0)
                throw new ArithmeticException("Divide by zero occur");
        }
        catch (ArithmeticException e){
            log.log(Level.INFO,()->""+e.getMessage());
            System.exit(0);
        }
        return result;
    }
}