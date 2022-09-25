package com.school;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    String name;
    String id;
    String grade;
    String phone;

    public Student(String name){
        this.name = name;
    }

    public Student(String name, String id, String grade, String phone) {
        this.name = name;
        this.id = id;
        this.grade = grade;
        this.phone = phone;
    }

    ArrayList<Student> students = new ArrayList<>();

    public void addStudent(String name, String id, String grade, String phone) {
//        this.name = name;
//        this.id = id;
//        this.grade = grade;
//        this.phone = phone;

        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter name");
        this.name = scnr.nextLine();
        System.out.println("Enter id");
        this.id = scnr.nextLine();
        System.out.println("Enter grade");
        this.id = scnr.nextLine();
        System.out.println("Enter phone number");
        this.id = scnr.nextLine();

        Student s = new Student(name, id, grade, phone);
        students.add(s);

    }

    public void displayStudents(){
        for (int i = 0; i < students.size(); i++){
            System.out.println(students.toString());
        }
    }

    public void showMenu(){
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter your options");
        System.out.println("1. Add a student");
        System.out.println("2. View all students");

        int choice = scnr.nextInt();
        if (choice == 1){
            addStudent(name, id, grade, phone);
            showMenu();
        } else if (choice == 2) {
            displayStudents();
            showMenu();
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", grade='" + grade + '\'' +
                ", phone='" + phone + '\'' +
                ", students=" + students +
                '}';
    }
}
