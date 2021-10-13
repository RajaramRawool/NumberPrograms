package com.company;

import java.util.Scanner;

public class ArrayProblems {
    public static void main(String[] args) {

        int[] array = { 1, 2, 2, 3, 5, 7, 6, 5, 9 };
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
//        rightRotateElements(array ,3);
//        sortElementsAscending(array);
//        sortElementsDescending(array);
//        thirdAndSecondLargestNumber(array);
//        removingDuplicateNumber(array);
//        printingOddAndEvenNumbers(array);
    }

    private static void printingOddAndEvenNumbers(int[] array) {
        int[] odd = new int[array.length];
        int[] even = new int[array.length];
        int j = 0;
        int k = 0;
        for (int i = 0 ; i < array.length ; i++) {
            if (array[i] == 0){

            } else if (array[i]%2 == 0) {
                even[j++] = array[i];
            }else {
                odd[k++] = array[i];
            }
        }
        for (int o : odd)
            System.out.print(o + " ");
        System.out.println();
        for (int e : even)
            System.out.print(e + " ");
    }

    private static void removingDuplicateNumber(int[] array) {
        int[] temp = new int[array.length];
        int j = 0;
        boolean notDuplicate = false;
        for (int i = 0 ; i < array.length ; i++) {
            for (int k = 0 ; k < array.length ; k++) {
                if ((array[i] != array[k]) && (i != k)) {
                    notDuplicate = true;
                }else if(i == k) {
                }else {
                    notDuplicate = false;
                    break;
                }
            }
                if (notDuplicate) {
                    temp[j++] = array[i];
                }
        }
        for (int l : temp) {
            if (l != 0)
            System.out.print(l + " ");
        }
    }

    private static void thirdAndSecondLargestNumber(int[] array) {
        for (int i = 0 ; i < array.length ; i++) {
            for (int j = 0 ; j < (array.length - 1) ; j++) {
                if (array[j] < array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println("Third Largest Number :- " + array[2]);
        System.out.println("Second Largest Number :- " + array[1]);
    }

    private static void sortElementsDescending(int[] array) {
        for (int j = 0 ; j < array.length ; j++){
            for (int i = 0; i < (array.length - 1); i++) {
                if (array[i] < array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        for (int i : array)
            System.out.print(i + " ");
     }

    private static void sortElementsAscending(int[] array) {
        for (int i = 0 ; i < array.length -1  ; i++ ) {
            if (array[i] > array[i+1]){
                int temp = array[i+1];
                array[i+1] = array[i];
                array[i] = temp;
            }
        }
        for ( int i : array)
            System.out.print(i + " ");
    }

    private static void rightRotateElements(int[] array, int n) {
        for (int count = 0 ; count < n ; count++ ){
            int temp = array[array.length - 1];
            for (int i = array.length - 1; i > 0; i--) {
                array[i] = array[i - 1];
            }
            array[0] = temp;
        }
            for (int j : array) {
                System.out.print(j + " ");
            }
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
