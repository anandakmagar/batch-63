package com.syllabus.casting;

/*

 */

public class PrimitiveCasting {
    public static void main(String[] args) {
        // Auto-Widening: conversion of small sized primitive data type to bigger data type
        byte b = 10;
        int i = b;

        // Explicit-Narrowing: conversion of bigger sized primitive data type to bigger data type
        int i2 = 1000;
        byte b2 = (byte) i2;

        System.out.println(b2);
    }
}
