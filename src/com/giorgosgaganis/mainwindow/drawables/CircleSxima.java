package com.giorgosgaganis.mainwindow.drawables;

import java.awt.*;

class CircleSxima extends Sxima {
    private static final int RADIUS = 80;

    public CircleSxima(int x, int y) {
        super(x, y);
    }

    @Override
    protected int calculateArea() {
        return (int) (Math.PI * Math.pow(RADIUS, 2));
    }

    @Override
    public void draw(Graphics g) {
        super.draw(g);
        g.drawOval(x, y, RADIUS, RADIUS);
    }
}
