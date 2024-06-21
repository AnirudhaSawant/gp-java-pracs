package com.globalpayex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeriesTest {

    @Test
    void testEvenSeries() {
        var n = 11;
        var expected = "0,2,4,6,8,10";

        var actual = Series.evenSeries(n);
        assertEquals(expected, actual);

        n = 8;
        expected = "0,2,4,6,8";

        actual = Series.evenSeries(n);
        assertEquals(expected, actual);
    }
}