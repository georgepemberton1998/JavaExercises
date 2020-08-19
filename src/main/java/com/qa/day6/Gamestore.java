package com.qa.day6;

public class Gamestore {

    public static void main(String[] args) {
        Games Rocketleague = new Games(30, true);
        Games TW3 = new Games(40, false);
        Games Civ = new Games (40, false);
        Games Cod = new Games (60, true);
        System.out.println(Civ.getdisk());
        System.out.println(Civ.getprice());
        System.out.println(Cod.priceX10());
        System.out.println(Cod.getdisk());
     }
}
