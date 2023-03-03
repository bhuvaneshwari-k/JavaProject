package org.example;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Player extends GameBoard{

    static PrintStream l=new PrintStream((new FileOutputStream(FileDescriptor.out)));
    static int count=0;
    public static void placeKey(int row, int col){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++) {
                if(i==row && j==col) {
                    board[i][j] = key;
                    count++;
                    displayBoard();
                }
            }
        }
    }
    public static void displayBoard() {
        String bar = "_|___|___|___|_";
        String bar1 = " | ";
        for (int i = 0; i < 3; i++) {
            l.println(bar);
            l.print(bar1);
            for (int j = 0; j < 3; j++) {
                l.print(board[i][j] + " | ");
            }
            l.println();
        }
        l.println(bar);
    }
    public static boolean displayResult(boolean choice) {
        String msg = " Won the match!";
        for(int i=0;i<3;i++) {
            if (board[i][0]!=' ' && board[i][0] == board[i][1] &&  board[i][0]== board[i][2]) {
                l.println(name + msg);
                choice=false;
            }
            if (board[0][i]!=' ' && board[0][i] == board[1][i] &&  board[0][i]== board[2][i]) {
                l.println(name + msg);
                choice=false;
            }
        }
        if(board[0][0]!=' ' && board[0][0] == board[1][1] &&  board[0][0]== board[2][2]) {
            l.println(name + msg);
            choice=false;
        }
        if(board[0][2]!=' ' && board[0][2] == board[1][1] &&  board[0][2]== board[2][0]) {
            l.println(name + msg);
            choice=false;
        }
        if(count==9){
            l.println("Draw the match!");
            choice=false;
        }
        return choice;
    }
}