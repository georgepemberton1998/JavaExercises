package com.qa.day6;

public class Games {
    boolean disk;
    double price;

    public Games (double price1, boolean disk1){
        this.price = price1;
        this.disk = disk1;
    }
    public double getprice(){
     return price;
    }
    public boolean getdisk(){
        return disk;
    }
    public double priceX10(){
        return price * 1.1;
    }
}

