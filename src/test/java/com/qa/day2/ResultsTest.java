package com.qa.day2;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ResultsTest {

    @Test
    public void results() {
        assertEquals("Congratulations, you scored: 100/150 in your Physics test" + "\n" +
        "Congratulations, you scored: 100/150 in your Chemistry test" + "\n" +
        "Congratulations, you scored: 100/150 in your Biology test" + "\n" +
        "Congratulations, you scored: 300/450 in total"
, Results.results(100, 100, 100));
    }

    @Test
    public void percentage1() {
        assertEquals(66.66, Results.percentage1(100, 100, 100), 2 );
    }
}