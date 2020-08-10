package com.qa.day2;

public class Results {

    public static void main( String[] args) {
        results1(100, 100, 100, 300, 60);

    }
    public static int results1 (int Physics, int Chemistry, int Biology, int Total, int Percentage){

        System.out.println("Congratulations, you scored: " + Physics + "/150 in your Physics test");
        System.out.println("Congratulations, you scored: " + Chemistry + "/150 in your Chemistry test");
        System.out.println("Congratulations, you scored: " + Biology + "/150 in your Biology test");
        System.out.println("Congratulations, you scored: " + Total + "/450 in total");
        System.out.println("Congratulations, your percentage is:" + Percentage );
        return 0;
    }
}
