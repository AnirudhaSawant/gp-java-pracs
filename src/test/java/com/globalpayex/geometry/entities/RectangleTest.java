package com.globalpayex.geometry.entities;

import com.abc.geometry.ShapeStatistics;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void testCalculateArea() {
        var r = new Rectangle(4,10);
        var expected = 40;
        var actual = r.area();

        assertEquals(expected, actual);
    }

    @Test
    void testCalculatePerimeter() {
        var r = new Rectangle(4,10);
        var expected = 28;
        var actual = r.perimeter();

        assertEquals(expected, actual);
    }

    @Test
    void testCalculateShapeStatistics() {
        var r = new Rectangle(4,10);
        var area = r.area();
        var perimeter = r.perimeter();

        var expected = "* * *\nArea is 40\nPerimeter is 28\n* * *";
        var actual = ShapeStatistics.calculate(r);

        assertEquals(expected,actual);

        var s = new Square(4);
        area = s.area();
        perimeter = s.perimeter();

        expected = "* * *\nArea is 16\nPerimeter is 16\n* * *";
        actual = ShapeStatistics.calculate(s);

        assertEquals(expected,actual);
    }


}