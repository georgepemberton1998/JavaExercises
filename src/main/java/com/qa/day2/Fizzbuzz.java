package com.qa.day2;

public class Fizzbuzz {

    public static void main( String[] args) {
        addition(2, 5);
        subtraction(10, 5);
        multiplication(3, 7);
    }

    public static int addition (int num1 , int num2){

       int result = num1 + num2;
       System.out.println(result);
       return result;
    }
    public static int subtraction (int num1 , int num2){

        int result = num1 - num2;
        System.out.println(result);
        return result;
    }
    public static int multiplication(int num1 , int num2){

        int result = num1 * num2;
        System.out.println(result);
        return result;
    }
}
