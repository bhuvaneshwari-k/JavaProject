package org.example.student;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentGPA {
    static Logger l=Logger.getLogger("student.class");
    String sname;
    String sgrade;
    double sgpa;
    double gpoint;

    public StudentGPA(String name, String grade, double gpa) {
        sname = name;
        sgrade = grade;
        sgpa = gpa;
    }

     public void updategpa() {
        Scanner s = new Scanner(System.in);
        l.info("Enter the total credits:");
        double credit = s.nextDouble();
        switch (sgrade) {
            case "A" :
            {
                gpoint = 5.00;
                break;
            }
            case "B" :
            {
                gpoint = 4.00;
                break;
            }
            case "C" :
            {
                gpoint = 3.00;
                break;
            }
            case "D" :
            {
                gpoint = 2.00;
                break;
            }
            case "E" : {
                gpoint = 1.00;
                break;
            }
            default :{
                l.info("invalid choice");
                break;
            }
        }
        sgpa = (credit * gpoint) / credit;
        l.log(Level.INFO,()->"The gpa value of the student is:"+ sgpa);
    }
    public String display() {
        return sname + " has a " + sgpa + " GPA";
    }
}
