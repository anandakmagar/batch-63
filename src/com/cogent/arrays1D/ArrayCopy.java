package com.cogent.arrays1D;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] arrayOriginal = {1, 2, 3, 4, 2, 1};
        int[] arrayCopy = new int[arrayOriginal.length];

        for (int i = 0; i < arrayOriginal.length; i++){
            arrayCopy[i] = arrayOriginal[i];
        }

        for (int i: arrayCopy){
            System.out.print(i + " ");
        }
    }
}
