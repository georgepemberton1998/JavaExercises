package com.qa.day2;

import java.sql.SQLOutput;

public class Results {

    public static void main( String[] args) {
        results(100, 100, 100);
        percentage1(60);

    }
    public static void results (int Physics, int Chemistry, int Biology){
        int total = Physics + Chemistry + Biology;
        System.out.println("Congratulations, you scored: " + Physics + "/150 in your Physics test");
        System.out.println("Congratulations, you scored: " + Chemistry + "/150 in your Chemistry test");
        System.out.println("Congratulations, you scored: " + Biology + "/150 in your Biology test");
        System.out.println("Congratulations, you scored: " + total + "/450 in total");
       //return 0;
    }
    public static int percentage1 (int percentage){
        System.out.println("Congratulations, your percent is: " + percentage + "%");
        return 0;
    }
}
