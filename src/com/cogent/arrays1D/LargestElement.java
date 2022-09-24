package com.cogent.arrays1D;

public class LargestElement {
    public static void main(String[] args) {

        int[] array = {1, 2, 4, 9, 0, 2, 300};
        int largest = array[0];
        for (int i = 0; i < array.length; i++){
                if (array[i] > largest){
                    largest = array[i];
            }
        }
        System.out.println(largest + " is the largest element in the given array");
    }
}
