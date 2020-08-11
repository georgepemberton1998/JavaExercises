package com.qa.day3;

public class Flowchart4 {
    public static void main(String [] args) {
        printNumbers();
    }
    public static void printNumbers(){
        for(int A = 100; A <= 200; A++) {
            if (A%2 == 0) {
                System.out.println("-");
            }else {
                System.out.println("*");
            }if (A >= 200){
                break;
            }
        }
    }
}
