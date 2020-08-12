package com.qa.Day4;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your age: ");

        int user = scan.nextInt();
        System.out.println(user);
    }
}
