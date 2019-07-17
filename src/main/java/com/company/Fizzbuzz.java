package com.company;

public class Fizzbuzz {

    int status ;

    public String play(int number){
        if (number > 200) {
            status = 1;
        }else if (number % 15 == 0) {
            status = 2;
        } else if (number % 3 == 0) {
            status = 3;
        } else if (number % 5 == 0) {
            status = 4;
        }
        switch(status){
            case 1:
                throw new IllegalArgumentException();
            case 2:
                return "fizzbuzz";
            case 3:
                return "fizz";
            case 4:
                return "buzz";
        }
        return null;
    }

}


//If divisible by 3, return fizz
//if divisible by 5, return buzz
//if givisible by 15, return fixzbuzz


//    public String play(int number){
//        if (number > 200) {
//            throw new IllegalArgumentException();
//        }else if (number % 15 == 0) {
//            return "fizzbuzz";
//        } else if (number % 3 == 0) {
//            return "fizz";
//        } else if (number % 5 == 0) {
//            return "buzz";
//        }
//        return null;
//    }