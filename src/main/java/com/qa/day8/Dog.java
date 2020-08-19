package com.qa.day8;


class Dog {
    int size = 35;
    String breed;
    String name;
    String sound = "ruff ruff";
    void bark() {
        System.out.println(sound);
    }
    void sit(){
        System.out.println("sitting");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "size=" + size +
                ", breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
