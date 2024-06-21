package com.globalpayex;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {

    @ParameterizedTest
    @CsvSource({
            "71,A",
            "70,A",
            "62,B",
            "45,C",
            "39,F",
            "200,I",
            "-89,I"
    })
    void testGrader(int marks, char expected) {
        // test steps
        var actual = Grader.calculate(marks);

        assertEquals(expected, actual);
    }
}