package com.school;

import java.util.Scanner;

public class SchoolManagement{
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = scnr.nextLine();

        Student s = new Student(name);

        System.out.println("Welcome! " + name);

        s.showMenu();
        

    }
}