package com.qa.Day4;

public class Goldielocks {
    public static void main(String[] args) {
        int[] weightTemp = {70, 120, 70};
        // Goldilocks available seats
        goldilocks(weightTemp);
    }
    public static void goldilocks(int[] goldilocks){

    // goldilocks 0 = weight
    // goldilocks 1 = Max TEmp
    // Multi dimensional array for the weight of goldilocks and temp of porridge
    int[] maxWeightTable = {90, 110, 113, 191, 129, 163, 193, 153, 107, 137, 40, 127, 146, 197, 59, 124, 59, 54, 119, 121, 189, 108, 21, 18, 90, 52, 129, 181, 123, 132};
    int[] tempTable = {297, 66, 257, 276, 280, 163, 193, 153, 107, 137, 40, 127, 146, 197, 59, 124, 59, 54, 119, 121, 189, 108, 21, 18, 90, 52, 129, 181, 123, 132};
    int[] luminosityTable = {78, 98, 12, 22, 12, 45, 65, 71, 87, 98, 45, 98, 10, 100, 12, 54, 98, 87, 32, 65, 97, 64, 31, 54, 65, 87, 98, 65, 21};
    // increments a table number
    int tableNumber = 0;
    // initializes the array for the available tables goldilocks can sit in
    int[] avlTables = new int[0];
    // loops through each value of the first part of the table[][]
    for(int j = 0; j < maxWeightTable.length; j++){
        // print the value of j for debug purpose
        System.out.println("Max Weight: " + maxWeightTable[j]);
        // check if weight is smaller than or equals to the weight capacity of the table
        if(goldilocks[0] <= maxWeightTable[j]){
            // check if porridge temp is smaller than or equals to the max temp of the porridge
            if(tempTable[j] <= goldilocks[1]){
                // checks if luminosity is good
                if(luminosityTable[j] >= goldilocks[2]) {
                    // reinitialise the array to add a slot to add a new seat
                    avlTables = new int[avlTables.length + 1];
                    // print the seat number for debug purpose
                    System.out.println("Correct seat is : " + tableNumber);
                }
            }
        }
        // increment table number for each loop the for loop does
        tableNumber++;
    }
    System.out.println("Number of available seats : " + avlTables.length);
}
}
