package com.globalpayex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayAvgAndMaxTest {

    @Test
    void testAverage() {
        int[] arr = {0,5,7,3,1,10};
        var expected = 4;

        var actual = ArrayOps.calculateAverage(arr);
        assertEquals(expected,actual);

    }

    @Test
    void testMax() {
        int[] arr = {0,5,10,7,2,1,10};
        var expected = 10;

        var actual = ArrayOps.calculateMax(arr);
        assertEquals(expected, actual);
    }

    @Test
    void testNextGenSum() {

        var actual = ArrayOps.nextGenSum(5,2,4,8);
        assertEquals(19,actual);

        actual = ArrayOps.nextGenSum(5,2);
        assertEquals(7,actual);

        actual = ArrayOps.nextGenSum();
        assertEquals(0,actual);
    }

}