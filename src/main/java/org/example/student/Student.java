package org.example.student;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Student {
    Logger l=Logger.getLogger("student.class");
    Scanner s = new Scanner(System.in);
    String grade;
    String name;
    int marks;
    public Student() {
        try {
            l.info("Enter the student name:");
            name = s.nextLine();
            l.info("Enter the student total mark:");
            marks = s.nextInt();
        }catch (InputMismatchException e){
            e.getMessage();
        }
    }
public void getGPA(){
        if (marks > 400) {
        grade = "A";
    } else if (marks > 300) {
        grade = "B";
    } else if (marks > 200) {
        grade = "C";
    } else if (marks > 100) {
        grade = "D";
    } else {
        grade = "E";
    }
        l.log(Level.INFO,()->"The grade of the student is:"+grade);
         StudentGPA st = new StudentGPA(name, grade, 0.0);
        st.updategpa();
        l.log(Level.INFO,()-> st.display());
}
}
