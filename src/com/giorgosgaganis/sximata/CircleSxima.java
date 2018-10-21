package com.giorgosgaganis.sximata;

import java.awt.Graphics;

public class CircleSxima extends Sxima {

    private static final int SIZE = 100;

    public CircleSxima(int x, int y) {
        super(x, y);
    }

    @Override
    protected int calculateArea() {
        return (int) (Math.PI * Math.pow(SIZE, 2));
    }

    @Override
    public void draw(Graphics graphics) {
        super.draw(graphics);

        graphics.drawOval(x, y, SIZE, SIZE);
    }
}
