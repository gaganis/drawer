package com.giorgosgaganis.mainwindow;

import javax.swing.JComboBox;

import com.giorgosgaganis.sximata.SximaFactory;
import com.giorgosgaganis.sximata.SximaType;

public class MainDrawerWindow extends AbstractDrawerWindow {

    public MainDrawerWindow() {
        super();
    }

    @Override
    protected void addSximaToPanel(Object selectedItem, DrawingJPanel drawingPanel, int x, int y) {
        SximaFactory sximaFactory = new SximaFactory();

        drawingPanel.addSxima(sximaFactory.getSximaWithXYAndType(x, y, (SximaType) selectedItem));
    }

    @Override
    protected void addTypesToComboBox(JComboBox jComboBox) {

        jComboBox.addItem(SximaType.RECTANGLE);
        jComboBox.addItem(SximaType.CIRCLE);
    }


    public static void main(String[] args) {

        new MainDrawerWindow();
    }
}
