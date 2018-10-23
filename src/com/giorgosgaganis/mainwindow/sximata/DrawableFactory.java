package com.giorgosgaganis.mainwindow.sximata;

import com.giorgosgaganis.mainwindow.positioning.Positioner;
import com.giorgosgaganis.mainwindow.positioning.StupidPositioner;

public class DrawableFactory {
    public Drawable getSximaForTypeAndXy(DrawableType type, int x, int y, Positioner positioner) {
        Drawable result = null;

        switch (type) {
            case SQUARE:
                result = new Square(x, y, positioner);
                break;
            case CIRCLE:
                result = new Circle(x, y, positioner);
                break;
            case RECTANGLE:
                //Do whatever needed for a rectangle
                break;
            case WORLDGREETER:
                result = new WorldGreeter(x, y, positioner);
                break;
            default:
                result = null;
        }

        return result;
    }
}
