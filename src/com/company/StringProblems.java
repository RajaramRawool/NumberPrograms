package com.company;

public class StringProblems {
    public static void main(String[] args) {
        String name = "My name is Rajaram";
        System.out.println(numberOfCharacters(name));

    }

    private static int numberOfCharacters(String name) {
        int count = 0;
        for (int i = 0 ; i < name.length() ; i++) {
            if (name.charAt(i) != ' ') {
                count++;
            }
        }
        return count;
    }
}
