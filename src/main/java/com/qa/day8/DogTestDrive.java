package com.qa.day8;

import java.util.ArrayList;

class DogTestDrive {
    public static void main (String[] args) {
        Dog pepsi = new Dog();
        ArrayList <Dog> kennel = new ArrayList<>();
        System.out.println(pepsi.size);
        pepsi.sound = "ruff";
        pepsi.bark();
        for(int i = 0 ; i < 1000 ; i++){
            Dog one = new Dog ();
            kennel.add(one);
        }
        Spaniel layla = new Spaniel();
        layla.bark();
        layla.sit();
        System.out.println(layla.size);
        //System.out.println(kennel);
    }
}
