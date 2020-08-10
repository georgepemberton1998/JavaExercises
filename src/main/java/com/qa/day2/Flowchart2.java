package com.qa.day2;

public class Flowchart2 {
    public static void main(String [] args) {
        flow(3000);
    }
        public static void flow(int num1){
        if(num1>2000){
            System.out.println("A");
            if(num1>100){
                System.out.println("2");
            }else {
                System.out.println("3");
            }
        }else {
            System.out.println("1");
        }
    }
}
