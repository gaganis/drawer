package com.giorgosgaganis.mainwindow;

import com.giorgosgaganis.mainwindow.drawables.Drawable;

import javax.swing.JPanel;
import java.awt.Graphics;

class DrawingJPanel extends JPanel {
    private final Drawable[] drawables = new Drawable[10];
    private int numberOfDrawables = 0;

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        for (int i = 0; i < drawables.length; i++) {
            Drawable drawable = drawables[i];
            if(drawable != null) {
                drawable.draw(g);
            }
        }

    }

    public void addSxima(Drawable drawable) {
        drawables[numberOfDrawables] = drawable;
        numberOfDrawables++;
    }
}
