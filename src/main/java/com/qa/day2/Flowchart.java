package com.qa.day2;

public class Flowchart {
    public static void main(String [] args) {
        method1(1, 2, true);
    }

        public static void method1 (int num1 , int num2 , boolean bool1 ){
        int total = num1 + num2;
        int total1 = num1 * num2;
        if(bool1) {
            System.out.println(total);
        }else {
            System.out.println(total1);
        }
    }
}
