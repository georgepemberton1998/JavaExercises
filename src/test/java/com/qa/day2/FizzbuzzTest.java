package com.qa.day2;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class FizzbuzzTest{

    @Test
    public void additionTest(){
        assertEquals(12 , (int) Fizzbuzz.number1(5,7));
    }
}
