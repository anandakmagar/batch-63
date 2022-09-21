package com.cognizant.shapes;

import java.util.Scanner;

class Circle{
    int radius;

    void calculateArea() {
        double area =  3.14 * radius * radius;
        System.out.println("The Area of the Circle is " + area);
    }
}

class Triangle{
    int sides;

    void calculateArea() {
        double area = 0.433 * sides * sides;
        System.out.println("The Area of the Triangle is " + area);
    }
}

class Square{
    int sides;
    void calculateArea() {
        int area = sides * sides;
        System.out.println("The Area of the Square is " + area);
    }
}
public class Shapes{
    int numberOfSides;

    void calculateShapeArea(int numberOfSides, int sideLengthOrRadius) {
        Circle c = new Circle();
        Triangle t = new Triangle();
        Square s = new Square();


        if(numberOfSides == 1) {
            c.radius = sideLengthOrRadius;
            c.calculateArea();
        }

        else if(numberOfSides == 3) {
            t.sides = sideLengthOrRadius;
            t.calculateArea();
        }

        else if(numberOfSides == 4) {
            s.sides = sideLengthOrRadius;
            s.calculateArea();
        }
        else {
            System.out.println("No Shapes Present");
        }

    }

    public static void main (String[] args) {
        Shapes sp = new Shapes();

        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter the number of sides");
        int a = scnr.nextInt();
        System.out.println("Enter the length or radius of the shape");
        int b = scnr.nextInt();

        sp.calculateShapeArea(a, b);
    }
}
