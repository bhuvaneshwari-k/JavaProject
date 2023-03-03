package org.example;

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
            case "A" -> gpoint = 5.00;
            case "B" -> gpoint = 4.00;
            case "C" -> gpoint = 3.00;
            case "D" -> gpoint = 2.00;
            case "E" -> gpoint = 1.00;
            default -> l.info("invalid choice");
        }
        sgpa = (credit * gpoint) / credit;
        l.log(Level.INFO,()->"The gpa value of the student is:"+ sgpa);
    }
    public String display() {
        return sname + " has a " + sgpa + " GPA";
    }
}
