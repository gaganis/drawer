package com.giorgosgaganis.sximata;

import java.awt.Graphics;

public class RectangleSxima extends Sxima {


    private static final int SIZE = 100;

    public RectangleSxima(int x, int y) {
        super(x, y);
    }

    @Override
    protected int calculateArea() {
        return SIZE * SIZE;
    }

    @Override
    public void draw(Graphics graphics) {
        super.draw(graphics);

        graphics.drawRect(x,y, SIZE, SIZE);
    }
}
