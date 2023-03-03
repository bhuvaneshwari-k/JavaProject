package org.example.game;

public class UnavailableCellException extends Exception {
    public UnavailableCellException (String str)
    {
        super(str);
    }
}