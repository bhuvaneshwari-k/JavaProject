package org.example.list;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class StudentList implements Comparator<StudentList>{
    Logger l=Logger.getLogger("studentList.class");
    String name;
    int age;
    double gpa;
    public void setDetail(String sName,int sAge,double sGPA) {
        this.name = sName;
        this.age = sAge;
        this.gpa = sGPA;
    }
    public void getDetail() {
        l.log(Level.INFO,()-> "Student name is :"+name);
        l.log(Level.INFO,()-> "Student age is :"+age);
        l.log(Level.INFO,()-> "Student gpa is :"+gpa);
    }
    public int compare(StudentList a,StudentList b){
        return (int) ((int)b.gpa-a.gpa);
    }
    public static void studentTest() {
        Logger l = Logger.getLogger("studentList.class");
        Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        StudentList s1 = new StudentList();
        StudentList s2 = new StudentList();
        StudentList s3 = new StudentList();
        try {
            String msg = "Enter the Student Name,Age,GPA:";
            l.info(msg);
            s1.setDetail(s.nextLine(), sc.nextInt(), sc.nextDouble());
            l.info(msg);
            s2.setDetail(s.nextLine(), sc.nextInt(), sc.nextDouble());
            l.info(msg);
            s3.setDetail(s.nextLine(), sc.nextInt(), sc.nextDouble());
        }catch (InputMismatchException e){
            e.getMessage();
        }
        ArrayList<StudentList> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        int length = list.size();
        int i = 0;
        l.info("UnSorted List:");
        while (i<length) {
            list.get(i).getDetail();
            i++;
        }
        i=0;
        l.info("Sorted List:");
        while (i < length) {
            Collections.sort(list, new StudentList());
            list.get(i).getDetail();
            i++;
        }

    }
}
