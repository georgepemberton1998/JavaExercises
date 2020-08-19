package com.qa.day2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Fizzbuzz {
    public static Logger LOGGER = LogManager.getLogger();

    public static void main(String[] args) {
        number2(6.0, 3.0);
        number1(5, 7);
    }

    public static Integer number1(int a, int b) {
        int number2 = a + b;
        System.out.println(number2);
        return number2;
    }

    public static Double number2(Double a, Double b) {
        LOGGER.info("Dividing");
        return a / b;
    }
}

