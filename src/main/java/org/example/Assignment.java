package org.example;

import org.example.bank.BankAccount;
import org.example.calculator.SimpleCalculator;
import org.example.collections.Hashmap;
import org.example.collections.Hashset;
import org.example.collections.Treeset;
import org.example.contactlist.ContactList;
import org.example.creditcard.CreditCard;
import org.example.database.Database;
import org.example.frequency.Frequency;
import org.example.game.Game;
import org.example.list.LinkedList;
import org.example.list.Queue;
import org.example.list.Stack;
import org.example.list.StudentList;
import org.example.point.Space;
import org.example.shape.BasicShape;
import org.example.student.Student;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Logger;


public class Assignment {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        Logger logger= Logger.getLogger("Assignment");
        int ch;
        do {
            logger.info("1.BankAccount\n2.BasicShape\n3.Student\n4.Database\n5.Space\n6.CreditCard\n7.StudentList\n8.Hashmap\n9.Hashset\n10.Treeset\n11.Calculator\n12.Contactlist\n13.Frequency\n14.TictactoeGame\n15.LinkedList\n16.Queue\n17.Stack\n18.Exit");
            logger.info("Enter your choice:");
             ch = scanner.nextInt();
            switch (ch) {
                case 1:
                    BankAccount bankaccount = new BankAccount();
                    bankaccount.bankProcess();
                    break;
                case 2:
                    BasicShape basicshape=new BasicShape();
                    basicshape.getType();
                    break;
                case 3:
                    Student student=new Student();
                    student.getGPA();
                    break;
                case 4:
                    Database database=new Database();
                    database.getDatabase();
                    break;
                case 5:
                     Space.point();
                     break;
                case 6:
                    CreditCard.getCard();
                    break;
                case 7:
                    StudentList.studentTest();
                    break;
                case 8:
                    Hashmap.employeeList();
                    break;
                case 9:
                    Hashset.employeeSet();
                    break;
                case 10:
                    Treeset.numberSet();
                    break;
                case 11:
                    SimpleCalculator.calculator();
                    break;
                case 12:
                    ContactList.getContact();
                    break;
                case 13:
                        Frequency.countFrequency();
                        break;
                case 14:
                    Game.startGame();
                    break;
                case 15:
                    LinkedList.startList();
                    break;
                case 16:
                    Queue.startQueue();
                    break;
                case 17:
                    Stack.getStack();
                    break;
                case 18:
                    System.exit(0);
                    break;
                default:
                    logger.info("Invalid choice");
                    break;
            }
        } while (ch!=18);
    }
}
