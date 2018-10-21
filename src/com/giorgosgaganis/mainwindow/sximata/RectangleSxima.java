package com.giorgosgaganis.mainwindow.sximata;

import java.awt.*;

class RectangleSxima extends Sxima {
    private static final int WIDTH = 200;
    private static final int HEIGHT = 50;

    public RectangleSxima(int x, int y) {
        super(x, y);
    }

    @Override
    protected int calculateArea() {
        return WIDTH * HEIGHT;
    }

    @Override
    public void draw(Graphics g) {
        super.draw(g);
        g.drawRect(x, y, WIDTH, HEIGHT);
    }
}
