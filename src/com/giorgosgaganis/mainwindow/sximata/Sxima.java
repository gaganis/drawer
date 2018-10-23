package com.giorgosgaganis.mainwindow.sximata;

import com.giorgosgaganis.mainwindow.positioning.Positioner;

import java.awt.*;

public abstract class Sxima implements Drawable{
    private int area;

    protected int x;
    protected int y;
    protected Positioner positioner;

    public Sxima(int x, int y, Positioner positioner) {
        this.x = x;
        this.y = y;
        this.positioner = positioner;
    }

    protected abstract int calculateArea();

    public void draw(Graphics g){
        area = calculateArea();
        g.drawString(String.valueOf(area), x, y - 20);
    }
}
