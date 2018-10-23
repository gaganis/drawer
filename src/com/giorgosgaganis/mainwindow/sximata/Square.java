package com.giorgosgaganis.mainwindow.sximata;

import com.giorgosgaganis.mainwindow.positioning.Positioner;

import java.awt.*;

class Square extends Sxima {



    private static final int SIZE = 100;

    public Square(int x, int y, Positioner positioner) {
        super(x, y, positioner);
    }

    @Override
    protected int calculateArea() {
        return SIZE * SIZE;
    }

    @Override
    public void draw(Graphics g) {
        super.draw(g);
        g.drawRect(x, y, SIZE, SIZE);
    }
}
