package com.giorgosgaganis.mainwindow;

import com.giorgosgaganis.mainwindow.sximata.Drawable;

import javax.swing.*;
import java.awt.*;

class DrawingJPanel extends JPanel {

    Drawable drawable;

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        drawable.draw(g);
    }

    public void add(Drawable drawable) {
        this.drawable = drawable;
    }
}
