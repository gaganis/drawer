package com.giorgosgaganis.sximata;

public class SximaFactory {
    public Sxima getSximaWithXYAndType(int x, int y, SximaType sximaType) {
        Sxima newSxima;

        switch (sximaType) {
            case CIRCLE:
                newSxima = new CircleSxima(x, y);
                break;
            case RECTANGLE:
                newSxima = new RectangleSxima(x, y);
                break;
            default:
                newSxima = null;
        }

        return newSxima;
    }
}
