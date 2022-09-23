package com.cogent.Arrays1D;

import java.util.HashSet;
import java.util.Iterator;

public class DuplicatesRemove {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 1, 9, 9, 8};

        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                hashSet.add(array[i]);
            }
        }
        Iterator<Integer> itr = hashSet.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
    }
}
