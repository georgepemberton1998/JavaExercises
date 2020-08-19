package com.qa.day2;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest{

    @Test
    public void additionTest(){
        assertEquals(12 ,(int) Calculator.addition(5,7));
    }
    @Test
    public void subtractionTest() {
        assertEquals(-2, (int) Calculator.subtraction(5, 7));
    }
    @Test
    public void multiplicationTest() {
        assertEquals(35, (int) Calculator.multiplication(5, 7));
    }
    @Test
    public void divisionTest() {
        assertEquals( Calculator.division(35, 7), 5.0, 0);
    }
}

