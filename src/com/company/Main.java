package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//	    NumberPrograms numberPrograms = new NumberPrograms();
//        numberPrograms.reverseNumber(123456789);
//        numberPrograms.isAutoMorphic(625);
//        numberPrograms.isPeterson(145);
//        ---------------------------------------
        SortingAlgorithms sortingAlgorithms = new SortingAlgorithms();
        int[] array1 = {4, 1, 3, 45, 1};
        int[] array2 = {10, 9, 8, 7, 6};
        int[] array3 = {15, 19, 28, 17, 6};

        sortingAlgorithms.bubbleSortAscending(array1);
        System.out.println(Arrays.toString(array1));
        sortingAlgorithms.bubbleSortDescending(array2);
        System.out.println(Arrays.toString(array2));

        sortingAlgorithms.insertionSortAscending(array2);
        System.out.println(Arrays.toString(array2));
        sortingAlgorithms.insertionSortDescending(array2);
        System.out.println(Arrays.toString(array2));

        sortingAlgorithms.selectionSortAscending(array3);
        System.out.println(Arrays.toString(array3));
        sortingAlgorithms.selectionSortDescending(array3);
        System.out.println(Arrays.toString(array3));


    }
}
