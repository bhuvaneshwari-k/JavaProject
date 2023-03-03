package org.example;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Game{
    private Game(){

    }
    public static void startGame(){
        Scanner s=new Scanner(System.in);
        Scanner s1=new Scanner(System.in);
        PrintStream l=new PrintStream((new FileOutputStream(FileDescriptor.out)));
        GameBoard b=new GameBoard();
        l.println("Enter the player1 name:");
        String name1=s.nextLine();
        l.println("Enter the player1 key:");
        char key1=s1.next().charAt(0);
        l.println("Enter the player2 name:");
        String name2=s.nextLine();
        l.println("Enter the player2 key:");
        char key2=s1.next().charAt(0);
        l.println("1.Player1\n2.Player2");
        l.println("Enter the choice that which player you want to play first:");
        int ch= s1.nextInt();
        int count1=1;
        switch (ch) {
            case 1: {
                while (count1 < 10) {
                    if(count1!=10)
                         count1=b.player1(name1,key1,count1);
                    if(count1!=10)
                        count1=b.player2(name2,key2,count1);
                }
            }
            case 2: {
                while (count1 < 10) {
                    if(count1!=10)
                        count1=b.player1(name1,key1,count1);
                    if(count1!=10)
                        count1=b.player2(name2,key2,count1);
                }
            }
        }
        }
    }
