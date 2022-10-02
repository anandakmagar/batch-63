package com.practice;

// Checking if there exists a duplicate element in an array

public class Challenge010 {
    public void isDuplicates(int[] arr){

        boolean result = false;
        for (int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++){
                if (arr[i] == arr[j]) {
                    result = true;
                }
            }
        }
        if (result == true){
            System.out.println("There is duplicates");
        }
        if (result != true){
            System.out.println("There is no duplicates");
        }
    }
    public static void main(String[] args) {
        Challenge010 c = new Challenge010();
        int[] array2 = {1, 1, 0, 3, 2, 4};
        c.isDuplicates(array2);
    }
}
