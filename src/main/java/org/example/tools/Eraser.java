package org.example.tools;

public class Eraser extends Tool implements Drawable {
    private static final String NAME = "Eraser";

    @Override
    public String getName() {
        return NAME;
    }

    public void draw(int x, int y) {
        System.out.printf("The %s drew at the point (%d;%d)%n", NAME, x, y);
    }
}
