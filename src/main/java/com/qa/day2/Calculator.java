package com.qa.day2;

public class Calculator {

    public static void main( String[] args) {
        addition(2, 5);
        subtraction(10, 5);
        multiplication(3, 7);
        division(10,4);
    }

    public static Integer addition (int num1 , int num2){
       int result = num1 + num2;
       System.out.println(result);
       return result;
    }
    public static Integer subtraction (int num1 , int num2){

        int result = num1 - num2;
        System.out.println(result);
        return result;
    }
    public static Integer multiplication(int num1 , int num2){

        int result = num1 * num2;
        System.out.println(result);
        return result;
    }
    public static Double division(double num1 , double num2){
            return num1 / num2;
    }
}
