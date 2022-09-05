package org.example.tools;

import org.example.shapes.Shape;

public class ShapeDrawer extends Tool {
    private static final String NAME = "ShapeDrawer";

    @Override
    public String getName() {
        return NAME;
    }

    public void drawShape(Shape shape, int x, int y, int width, int height) {
        System.out.printf("The %s drew %s at the point (%d;%d) %dpx wide and %dpx high%n",
                NAME, shape.getName(), x, y, width, height);
    }
}
