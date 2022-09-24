package com.cogent.arrays1D;

public class ArraySortDescending {
    public static void main(String[] args) {
        int[] array = {1, 4, 2, 3, 90, 45};

        int temp = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = i+1; j < array.length; j++){
                if (array[i] < array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] +" ");
        }
    }
}
