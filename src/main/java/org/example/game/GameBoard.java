package org.example.game;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class GameBoard {
    static char[][] board = new char[3][3];
    static String name;
    static char key;
    static Scanner s = new Scanner(System.in);
    static PrintStream l = new PrintStream((new FileOutputStream(FileDescriptor.out)));

    GameBoard() {

    }
    public static int player1(String name1,char key1,int count1){
        position(name1,key1);
        boolean result= Player.displayResult(true);
        if(!result)
            count1=10;
        return count1;
    }
    public static int player2(String name2,char key2,int count1){
        position(name2,key2);
        boolean result=Player.displayResult(true);
        if(!result)
            count1=10;
        return count1;
    }
    public static void position(String name,char key){
        GameBoard.name =name;
        GameBoard.key =key;
        int row = 0;
        int col=0;
        do {
            try {
                l.println("Enter the row:");
                row = s.nextInt();
                l.println("Enter the column:");
                col = s.nextInt();
                if(board[row][col]!=' ')
                    throw new UnavailableCellException("That spot is taken!!");
            }
            catch(UnavailableCellException e){
                l.println(e);
            }
        }while(board[row][col]!=' ');
        Player.placeKey(row, col);

    }


}
