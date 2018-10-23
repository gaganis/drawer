package com.giorgosgaganis.mainwindow.sximata;

import com.giorgosgaganis.mainwindow.positioning.Positioner;

import java.awt.*;

class WorldGreeter implements Drawable {

    private int x;
    private int y;

    private Positioner positioner;

    public WorldGreeter(int x, int y, Positioner positioner) {
        this.x = x;
        this.y = y;
        this.positioner = positioner;
    }

    @Override
    public void draw(Graphics g) {
        g.drawString("Hello World! I am not a Shape!", x , y);
    }
}
