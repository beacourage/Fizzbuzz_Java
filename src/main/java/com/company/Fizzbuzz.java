package com.company;

public class Fizzbuzz {

    public String play(int number){
        if (number % 3 == 0) {
            return "fizz";
        }
        if (number % 5 == 0) {
            return "buzz";
        }
        return null;
    }

}




//If divisible by 3, return fizz
//if divisible by 5, return buzz
//if givisible by 15, return fixzbuzz