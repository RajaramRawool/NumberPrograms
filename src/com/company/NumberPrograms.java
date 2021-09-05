package com.company;

public class NumberPrograms {

    int reverseNumber(int number){

        int tempNumber =number, remainder = 0 , reverseNumber = 0;

        while(tempNumber > 0){
            remainder = tempNumber % 10 ;
            reverseNumber = reverseNumber*10 + remainder ;
            tempNumber /= 10 ;
        }
        return reverseNumber;

    }
}
