package com.giorgosgaganis.mainwindow.positioning;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class ScreenPositioner implements Positioner{
    private final int screenWidth;
    private final int screenHeight;

    public ScreenPositioner(int screenWidth, int screenHeight) {
        this.screenWidth = screenWidth;
        this.screenHeight = screenHeight;
    }

    @Override
    public int getDrawXFor(int x, int y, int width, int height) {
        if(x > 500){
            return 500;
        }
        return x;

    }

    @Override
    public int getDrawYFor(int x, int y, int width, int height) {
        if(y > 500){
            return 500;
        }
        return y;
    }
}
