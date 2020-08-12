package com.qa.Day4;

public class Calculator2 {

        public static void main(String[]args) {
            int number=120;
            int i=2;
            while((number%i)==0){
                if((number%i)==0) {
                    number=number/i;
                    if(number==1)break;
                    i++;
                }
            }
            System.out.println("Factorial of "+ i);
        }
    }

