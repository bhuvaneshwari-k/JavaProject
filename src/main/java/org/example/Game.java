package org.example;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Game{
    public static void startGame(){
        Scanner s=new Scanner(System.in);
        Scanner s1=new Scanner(System.in);
        PrintStream l=new PrintStream((new FileOutputStream(FileDescriptor.out)));
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                GameBoard.board[i][j] = ' ';
            }
        }
        l.println("Enter the player1 name:");
        String name1=s.nextLine();
        l.println("Enter the player1 key:");
        char key1=s1.next().charAt(0);
        l.println("Enter the player2 name:");
        String name2=s.nextLine();
        l.println("Enter the player2 key:");
        char key2=s1.next().charAt(0);
        int count1=1;
            while(count1<10) {
                if(count1%2!=0) {
                    count1 = GameBoard.player1(name1, key1, count1);
                    count1++;
                }
                if(count1%2==0) {
                    count1 = GameBoard.player2(name2, key2, count1);
                    count1++;
                }
            }
        }
    }
