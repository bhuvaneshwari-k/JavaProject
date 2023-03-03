package org.example;

public class UnavailableCellException extends Exception {
    public UnavailableCellException (String str)
    {
        super(str);
    }
}