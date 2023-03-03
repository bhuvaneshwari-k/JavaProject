package org.example;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class GameBoard {
    char[][] board = new char[3][3];
    String name;
    char key;
    static Scanner s = new Scanner(System.in);
    static PrintStream l = new PrintStream((new FileOutputStream(FileDescriptor.out)));

    GameBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }
    public void position(String name,char key){
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
