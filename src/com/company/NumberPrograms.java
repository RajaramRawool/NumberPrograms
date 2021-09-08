package com.company;

public class NumberPrograms {
    int number;
    int reverseNumber(int number){

        int tempNumber =number, remainder = 0 , reverseNumber = 0;

        while(tempNumber > 0){
            remainder = tempNumber % 10 ;
            reverseNumber = reverseNumber*10 + remainder ;
            tempNumber /= 10 ;
        }
        System.out.println("Reverse Number :- " + reverseNumber);
        return reverseNumber;
    }

    boolean isAutoMorphic(int number){
        this.number = number ;
        int count = digitCount(number);

        int squareNumber = number * number;
        squareNumber = squareNumber % (int) Math.pow(10,count) ;

        if (number == squareNumber){
            System.out.println("Given Number is an AutoMorphic");
            return true;
        }
        else{
            System.out.println("Given Number is not an   AutoMorphic");
            return false ;
        }
    }

    int digitCount(int number){
        int count = 0 ;

        while(number > 0){
            number /= 10 ;
            count++;
        }
        return count ;
    }

    boolean isPeterson(int number){
        int tempNumber = number, sum = 0 ;

        while(tempNumber > 0){
            int remainder = tempNumber % 10 ;
            sum += factorial(remainder);
            tempNumber /= 10 ;
        }
        if ( sum == number){
            System.out.println("Given Number is Peterson Number");
            return true ;
        }else{
            System.out.println("Given Number is not Peterson Number");
            return false ;
        }

    }

    int factorial(int number) {
        int factorialNumber = 1;
        for(int i = number ; i > 0 ; i--){
            factorialNumber *= i ;
        }
        return factorialNumber ;
    }



}
