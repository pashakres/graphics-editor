package org.example.shapes;

public class ShapeUtils {
    private ShapeUtils() {
        throw new IllegalStateException("Utility class");
    }
    public static void printName(Shape shape) {
        System.out.println(shape.getName());
    }
}
