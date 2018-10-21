package com.giorgosgaganis.mainwindow.sximata;

public class SximaFactory {
    public Sxima getSximaForTypeAndLocation(SximaType sximaType,
                                            int x, int y) {
        switch (sximaType) {
            case SQUARE:
                return new SquareSxima(x, y);
            case CIRCLE:
                return new CircleSxima(x, y);
            case RECTANGLE:
                return new RectangleSxima(x, y);
        }
        throw new IllegalArgumentException("Unknown sximaType: " + sximaType);
    }
}
