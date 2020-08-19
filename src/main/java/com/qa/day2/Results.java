package com.qa.day2;

import java.sql.SQLOutput;

public class Results {
    public static int total = 300;

    public static void main( String[] args) {
        System.out.println(results(100, 100, 100));
        System.out.println(percentage1(100, 100, 100));

    }
    public static String results(int physics, int chemistry, int biology){
        String s;
        int total = total (physics , chemistry , biology);
        s = ("Congratulations, you scored: " + physics + "/150 in your Physics test" + "\n");
        s += ("Congratulations, you scored: " + chemistry + "/150 in your Chemistry test" + "\n");
        s += ("Congratulations, you scored: " + biology + "/150 in your Biology test" + "\n");
        s += ("Congratulations, you scored: " + total + "/450 in total");
       return s;
    }
    public static double percentage1 (int Physics, int Chemistry, int Biology){

        double percentage = (total/4.5);
        System.out.println("Congratulations, your percent is: " + percentage + "%");
        return percentage;
    }
    public static int total(int X, int Y, int Z){
        return X + Y + Z;
    }


}
