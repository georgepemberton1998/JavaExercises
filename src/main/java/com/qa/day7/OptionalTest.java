package com.qa.day7;
import java.util.Optional;

public class OptionalTest {

    public static void main(String[] args) {
        meth();
    }
    public static void meth() {
        String item;
        if (Math.random() >= 0.5) {
            item = "Hello";
        } else {
            item = null;
        }
        System.out.println(item);
        Optional.ofNullable(item);
    }
}
