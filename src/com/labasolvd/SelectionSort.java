package com.labasolvd;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] array = {1, 25, 178, 1065, 24523523, 0, 34, 7546, 248, 64, 32, 8};
        System.out.println(Arrays.toString(array));
        // find min unsorted number in array
        for (int i = 0; i < array.length; i++) {
            int minInd = i;
            // change it with the first unsorted number in array
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minInd]) {
                    minInd = j;
                }
            }
            swap(array, i, minInd);
        }
        System.out.println(Arrays.toString(array));
    }


    private static void swap(int[] array, int ind1, int ind2) {

        // swap numbers in array
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
}