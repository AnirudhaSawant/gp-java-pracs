package com.abc.geometry;

import com.globalpayex.geometry.entities.Rectangle;

public class ShapeStatistics {

    public static String calculate(Shape shape) {
        int area = shape.area();
        int perimeter = shape.perimeter();

        return String.format("* * *\nArea is %s\nPerimeter is %s\n* * *",area,perimeter);
    }
}
