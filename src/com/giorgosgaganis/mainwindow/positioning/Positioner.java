package com.giorgosgaganis.mainwindow.positioning;

public interface Positioner {
    int getDrawXFor(int x, int y, int width, int height);
    int getDrawYFor(int x, int y, int width, int height);
}
