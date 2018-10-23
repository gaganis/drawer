package com.giorgosgaganis.mainwindow.sximata;

import com.giorgosgaganis.mainwindow.positioning.Positioner;

import java.awt.*;

class Circle extends Sxima {

    private static final int RADIUS = 80;

    public Circle(int x, int y, Positioner positioner) {
        super(x, y, positioner);
    }

    @Override
    protected int calculateArea() {
        return (int) (Math.PI * Math.pow(RADIUS, 2));
    }

    @Override
    public void draw(Graphics g) {
        super.draw(g);
        g.drawOval(positioner.getDrawXFor(x, -1, -1, -1), positioner.getDrawYFor(-1, y, -1, -1), RADIUS, RADIUS);
    }
}
