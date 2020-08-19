package com.qa.day7;

public class Encapsulation {
    public static int number = 15;
    private int number2 = 34;

    public static void main(String[] args) {
        System.out.println(method1(5, 5 ,5));
    }

    public static int method1(int a, int b, int c){

        int ans = number + 10;
        return a + b + c;
    }
    public static void method2(){
        int five = 5;

    }

}
