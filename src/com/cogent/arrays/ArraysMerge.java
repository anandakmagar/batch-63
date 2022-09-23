package com.cogent.arrays;

public class ArraysMerge {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};

        int[] mergedArray = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++){
            mergedArray[i] = array1[i];
        }
        for (int j = 0; j < array2.length; j++){
            mergedArray[array1.length + j] = array2[j];
        }

        for (int i: mergedArray){
            System.out.print(i + " ");
        }
    }
}
