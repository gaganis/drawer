package com.giorgosgaganis.mainwindow.drawables;

public class DrawableFactory {
    public Drawable getSximaForTypeAndLocation(DrawableType drawableType,
                                               int x, int y) {
        switch (drawableType) {
            case SQUARE:
                return new SquareSxima(x, y);
            case CIRCLE:
                return new CircleSxima(x, y);
            case RECTANGLE:
                return new RectangleSxima(x, y);
            case GREETING_WORLD:
                return new GreeingWorldSxima(x, y);
        }
        throw new IllegalArgumentException("Unknown drawableType: " + drawableType);
    }
}
