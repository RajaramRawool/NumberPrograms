package com.company;

public class ArrayProblems {
    public static void main(String[] args) {
//        copyingArray();

        repeatedElements();
    }


    public static void copyingArray() {

        int[] array1 = {1, 2, 3, 4, 5};
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

    public static void repeatedElements() {
        int [] arr = new int [] {2, 2 ,1 ,2};
        System.out.print("Original Array :- ");
        for (int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
        //Array fr will store frequencies of element
        int [] fr = new int [arr.length];
        int visited = -1;
        for(int i = 0; i < arr.length; i++){
            int count = 1;
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                    //To avoid counting same element again
                    fr[j] = visited;
                }
            }
            if(fr[i] != visited)
                fr[i] = count;
        }
            for(int i = 0; i < fr.length; i++){
                if(fr[i] != visited)
                    System.out.println("    " + arr[i] + "    |    " + fr[i]);
            }
    }
}
