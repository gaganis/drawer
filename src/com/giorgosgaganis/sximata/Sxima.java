package com.giorgosgaganis.sximata;

import java.awt.Graphics;
import java.awt.Graphics2D;

public abstract class Sxima {
    protected final int x;
    protected final int y;


    protected final int area;

    public Sxima(int x, int y) {
        this.x = x;
        this.y = y;

        area = calculateArea();
    }


    protected abstract int calculateArea();

    public void draw(Graphics graphics) {
        Graphics2D g  = (Graphics2D) graphics;

        g.drawString(Integer.toString(area), x, y - 20);
    }
}
