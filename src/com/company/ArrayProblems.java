package com.company;

import java.util.Scanner;

public class ArrayProblems {
    public static void main(String[] args) {

        int[] array = { 2, 2, 3, 8, 5, 5, 6, 5};
//        copyingArray(array);
//        repeatedElements(array);
//        leftRotateElement(array);
//        duplicateElements(array);
//        largestArrayElement(array);
//        sumOfArrayItems(array);
//        evenPositionElements(array);
//        oddPositionElements(array);
//        smallestArrayElement(array);
//        numberOfElement(array);
    }


    private static void numberOfElement(int[] array) {
        System.out.println();
    }


    private static void smallestArrayElement(int[] array) {
        int min = array[0];
        for ( int i = 1 ; i < array.length ; i++ ) {
            if ( array[i] < min )
                min = array[i];

        }
        System.out.println(min);
    }

    private static void oddPositionElements(int[] array) {
        for ( int i = 0 ; i < array.length ; i += 2 ) {
            System.out.println(array[i]);
        }

    }

    private static void evenPositionElements(int[] array) {

        for ( int i = 1 ; i < array.length ; i +=2 ){
            System.out.println(array[i]);
        }
    }

    private static void sumOfArrayItems(int[] array) {
        int sum = 0 ;
        for (int i = 0 ; i < array.length ; i++){
            sum += array[i];
        }
        System.out.println(sum);
    }

    private static void largestArrayElement(int[] array) {
        int max = array[0];
        for (int i = 0 ; i < array.length ; i++ ){
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println(max);
    }

    private static void duplicateElements(int[] array1) {

        int[] duplicateNumbers = new int[array1.length];
        System.out.print("Original Array :-  ");
        for (int ar : array1)
            System.out.print(ar + " ");
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length - 1; j++) {
                if (i == j)

                    if (array1[i] == array1[j + 1]) {
                        duplicateNumbers[count] = array1[i];
                        count++;
                        break;
                    }
            }
        }
        System.out.println("\nDuplicate Elements are :- ");
        for (int i = 0; i < duplicateNumbers.length; i++) {
            if (duplicateNumbers[i] == 0) {

            } else
                System.out.print(duplicateNumbers[i] + " ");

        }
    }

    private static void copyingArray(int[] array1) {

        for (int i = 0; i < array1.length; i++) {
            if (i == array1.length - 1)
                System.out.print(array1[i]);
            else
                System.out.print(array1[i] + ", ");
        }
        int[] array2 = new int[array1.length];
        System.out.println();

        for (int i = 0; i < array2.length; i++) {
            array2[i] = array1[i];
        }

        for (int i = 0; i < array2.length; i++) {
            if (i == array1.length - 1)
                System.out.println(array2[i]);
            else
                System.out.print(array2[i] + ", ");
        }
    }

    private static void repeatedElements(int[] array) {
        System.out.print("Original Array :- ");
        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.println();
        //Array fr will store frequencies of element
        int[] fr = new int[array.length];
        int visited = -1;
        for (int i = 0; i < array.length; i++) {
            int count = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    //To avoid counting same element again
                    fr[j] = visited;
                }
            }
            if (fr[i] != visited)
                fr[i] = count;
        }
        for (int i = 0; i < fr.length; i++) {
            if (fr[i] != visited)
                System.out.println("    " + array[i] + "    |    " + fr[i]);
        }
    }

    private static void leftRotateElement(int[] array1) {
        System.out.print("Original Array :- ");
        for (int i : array1) {
            System.out.print(i + " ");
        }
        System.out.println("\nEnter number of shift :- ");
        Scanner scan = new Scanner(System.in);
        int shift = scan.nextInt();
        System.out.print("Left shifted Array :- ");
        for (int n = shift; n > 0; n--) {

            int temp = array1[0];

            for (int j = 1; j < array1.length; j++) {
                array1[j - 1] = array1[j];
            }
            array1[array1.length - 1] = temp;
        }


        for (int k : array1)
            System.out.print(k + " ");

        System.out.println();
    }
}
