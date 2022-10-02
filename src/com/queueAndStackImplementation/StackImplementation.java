package com.queueAndStackImplementation;

public class StackImplementation {
    public static void main(String[] args) {
        try{
            System.out.println(3/0);
            System.out.println("Hi");
        }
        catch (ArithmeticException ae){
            ae.printStackTrace();
            System.out.println("j");
        }
        finally {
            System.out.println("I'm printed");
        }
    }
}