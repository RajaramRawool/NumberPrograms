package com.company;

import java.util.Arrays;

public class SortingAlgorithms {

    public void bubbleSortAscending(int[] numbers) {
        boolean isSorted = true;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < numbers.length - i; j++) {
                int temp = numbers[j];
                if (numbers[j] < numbers[j - 1]) {
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = temp;
                    isSorted = false;
                }
                if (isSorted) {
                    return;
                }
            }
        }
    }

    public void bubbleSortDescending(int[] numbers) {
        boolean isSorted = true;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < numbers.length - i; j++) {
                int temp = numbers[j];
                if (numbers[j] > numbers[j - 1]) {
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = temp;
                    isSorted = false;
                }
            }
            if (isSorted) {
                return;
            }
        }
    }

    public void insertionSortAscending(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            int temp = numbers[i];
            int j = i - 1;
            while (j >= 0 && numbers[j] > temp) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j + 1] = temp;
        }

    }

    public void insertionSortDescending(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            int temp = numbers[i];
            int j = i - 1;
            while (j >= 0 && numbers[j] < temp) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j + 1] = temp;

        }
    }

    public void selectionSortAscending(int[] numbers) {
        for (int j = 0; j < numbers.length; j++) {
            int temp = numbers[j];
            for (int i = j + 1; i < numbers.length; i++) {
                if (numbers[i] < temp) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }

        }


    }

    public void selectionSortDescending(int[] numbers) {
        for (int j = 0; j < numbers.length; j++) {
            int temp = numbers[j];
            for (int i = j + 1; i < numbers.length; i++) {
                if (numbers[i] > temp) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }


    }
}
