package com.cogent.Arrays1D;

import java.util.HashSet;

public class ArrayCommonElements {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 2, 3, 5, 5, 3, 4, 4};

        HashSet hashSet = new HashSet<>();
        for (int i = 0; i < array.length; i++){
            for (int j = i+1; j < array.length; j++){
                if (array[i] == array[j]){
                    hashSet.add(array[i]);
                }
            }
        }
//        Iterator<Integer> itr = hashSet.iterator();
//        while (itr.hasNext()){
//            System.out.print(itr.next() + " ");
//        }
        for (Object i: hashSet){
            System.out.print(i + " ");
        }

    }
}
