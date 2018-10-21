package com.giorgosgaganis.mainwindow;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.util.ArrayList;

import com.giorgosgaganis.sximata.Sxima;

class DrawingJPanel extends JPanel {
    private final Sxima[] sximata = new Sxima[10];
    private int numberOfSximas = 0;

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (int i = 0; i < sximata.length; i++) {
            Sxima sxima = sximata[i];
            if(sxima != null) {
                sxima.draw(g);
            }
        }
    }

    public void addSxima(Sxima sxima){
        sximata[numberOfSximas] = sxima;
        numberOfSximas++;
    }
}
