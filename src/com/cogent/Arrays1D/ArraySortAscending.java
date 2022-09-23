package com.cogent.Arrays1D;

public class ArraySortAscending {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 0, 100, 73, 32, 56};

        int temp = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = i+1; j < array.length; j++){
                if(array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i: array){
            System.out.print(i + " ");
        }
    }

}
