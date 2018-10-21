package com.giorgosgaganis.mainwindow.drawables;

import java.awt.*;

public abstract class Sxima implements Drawable {
    protected final int x;
    protected final int y;

    private final int area;

    public Sxima(int x, int y) {
        this.x = x;
        this.y = y;

        this.area = calculateArea();
    }

    protected abstract int calculateArea();

    public void draw(Graphics g) {
        g.drawString(Integer.toString(area), x, y - 20);
    }
}
