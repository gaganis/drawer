package com.giorgosgaganis.mainwindow.drawables;

import java.awt.*;

class GreeingWorldSxima implements Drawable {
    private static final String GREETING_MESSAGE = "Hello World! I am not a Shape!";
    private final int x;
    private final int y;

    public GreeingWorldSxima(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw(Graphics g) {
        g.drawString(GREETING_MESSAGE, x, y);
    }
}
