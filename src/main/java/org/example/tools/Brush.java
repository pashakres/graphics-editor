package org.example.tools;

public class Brush extends Tool implements Drawable {
    private static final String NAME = "Brush";

    @Override
    public String getName() {
        return NAME;
    }

    public void draw(int x, int y) {
        System.out.printf("The %s drew at the point (%d;%d)%n", NAME, x, y);
    }
}
