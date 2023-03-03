package org.example;

public class Shape {
    int shapeType;
    double a;
    double p;
    double l;
    double b;
    double s1;
    double s2;
    double r;
   final double PI = 3.14;
     Shape(int type, double length, double breadth, double side1, double side2, double radius) {
        shapeType = type;
        l = length;
        b = breadth;
        s1 = side1;
        s2 = side2;
        r = radius;
    }

    public double perimeter() {
        if (shapeType == 1) {
            p = 2 * (l + b);
        }
        if (shapeType == 2) {
            p = b + s1 + s2;
        }
        if (shapeType == 3) {
            p = 2 * PI * r;
        }
        return p;
    }

    public double area() {
        if (shapeType == 1) {
            a = l * b;
        }
        if (shapeType == 2) {
            a = (b * l) / 2;
        }
        if (shapeType == 3) {
            a = PI * r * r;
        }
        return a;
    }
}