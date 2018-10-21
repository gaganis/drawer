package com.giorgosgaganis.mainwindow.sximata;

import java.awt.*;

class SquareSxima extends Sxima {
    private static final int SIZE = 100;

    public SquareSxima(int x, int y) {
        super(x, y);
    }

    @Override
    protected int calculateArea() {
        return (int) Math.pow(SIZE, 2);
    }

    @Override
    public void draw(Graphics g) {
        super.draw(g);
        g.drawRect(x, y, SIZE, SIZE);
    }
}
