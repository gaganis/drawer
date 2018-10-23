package com.giorgosgaganis.mainwindow.positioning;

public class StupidPositioner implements Positioner {
    @Override
    public int getDrawXFor(int x, int y, int width, int height) {
        return x;
    }

    @Override
    public int getDrawYFor(int x, int y, int width, int height) {
        return y;
    }
}
