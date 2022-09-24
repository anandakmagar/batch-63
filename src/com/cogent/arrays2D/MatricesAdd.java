package com.cogent.arrays2D;

public class MatricesAdd {
    public static void main(String[] args) {
        int[][] array2D1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] array2D2 = {{1, 2, 4}, {2, 3, 4}};

        int[][] arraySum = new int[array2D1.length][array2D1[0].length];
        for (int i = 0; i < array2D1.length; i++){
            for (int j = 0; j < array2D2[0].length; j++){
                arraySum[i][j] = array2D1[i][j] + array2D2[i][j];
                System.out.print(arraySum[i][j] + "  " );
            }
            System.out.println();
        }

    }
}
