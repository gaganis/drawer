package com.giorgosgaganis.mainwindow;

import com.giorgosgaganis.mainwindow.sximata.Sxima;

import javax.swing.JPanel;
import java.awt.Graphics;

class DrawingJPanel extends JPanel {
    private final Sxima[] sximas = new Sxima[10];
    private int numberOfSximas = 0;

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        for (int i = 0; i < sximas.length; i++) {
            Sxima sxima = sximas[i];
            if(sxima != null) {
                sxima.draw(g);
            }
        }

    }

    public void addSxima(Sxima sxima) {
        sximas[numberOfSximas] = sxima;
        numberOfSximas++;
    }
}
