package com.qa.day2;

public class Fizzbuzz {

    public static void main( String[] args) {
        addition(2, 5);
        subtraction(10, 5);
        multiplication(3, 7);
        division(10,4);
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
    public static double division(double num1 , double num2){

        double result = num1 / num2;
            if (num1 < num2){
                System.out.println(result);
                return result;
            }
            else{
            System.out.println("Impossible to execute");
            return 0;
        }
    }
}
