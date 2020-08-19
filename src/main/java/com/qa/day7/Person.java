package com.qa.day7;

public class Person {
    public static void main(String[] args) {
        double earthWeight = Double.parseDouble("175");
        double mass = earthWeight/Planets.EARTH.surfaceGravity();
        //Planets.values = [ MERCURY("£asd","21232")), VENUS, EARTH, MARS, JUPITER, SATURN, URANUS, NEPTUNE ]
        //
        for(Planets p : Planets.values()) {
            System.out.println("Your weight on " + p + " is " + p.surfaceWeight(mass));
          //  System.out.printf("Your weight on %s is %f%n", p, p.surfaceWeight(mass));
        }
        System.out.println(mass);
        System.out.println(Planets.EARTH.surfaceGravity());
    }
}
