package com.qa.day3;

public class Flowchart3 {
    public static void main(String [] args) {
        printNumbers();
    }
    public static void printNumbers(){
        for(int A = 100; A < 200; A++) {
            System.out.println(A);
            if (A > 200) {
                break;
            }
        }
    }
}
