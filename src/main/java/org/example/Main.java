package org.example;

import org.example.shapes.*;
import org.example.tools.*;

public class Main {
    public static void main(String[] args) {
        ShapeUtils.printName(new Circle());
        ShapeUtils.printName(new Quad());
        ShapeUtils.printName(new Cube());

        ToolUtils.printName(new Brush());
        ToolUtils.printName(new Eraser());

        Drawable pen = new Pen();
        pen.draw(10, 5);

        Drawable brush = new Brush();
        brush.draw(5, 1);

        ShapeDrawer shapeDrawer = new ShapeDrawer();
        shapeDrawer.drawShape(new Circle(), 0, 0, 100, 100);

    }
}