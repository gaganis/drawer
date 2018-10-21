package com.giorgosgaganis.mainwindow;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JToolBar;
import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import com.giorgosgaganis.sximata.SximaFactory;
import com.giorgosgaganis.sximata.SximaType;

public class MainDrawerWindow {

    private JComboBox sximaComboBox;
    private DrawingJPanel drawingPanel;

    public MainDrawerWindow() {
        JFrame frame = new JFrame("Drawer");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        createToolBar(frame);

        drawingPanel = new DrawingJPanel();
        drawingPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                final int x = e.getX();
                final int y = e.getY();
                final Object selectedItem = sximaComboBox.getSelectedItem();

                addSximaTypeAtXY(x, y, (SximaType) selectedItem);

                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        drawingPanel.repaint();
                    }
                });
            }
        });
        frame.getContentPane().add(drawingPanel, BorderLayout.CENTER);

        drawingPanel.addSxima(new SximaFactory().getSximaWithXYAndType(100, 100, SximaType.CIRCLE));

        frame.setVisible(true);
    }

    private void addSximaTypeAtXY(int x, int y, SximaType selectedItem) {
        drawingPanel.addSxima(new SximaFactory().getSximaWithXYAndType(x, y, selectedItem));
    }

    private void createToolBar(JFrame frame) {
        JToolBar toolBar = new JToolBar();

        sximaComboBox = new JComboBox();
        sximaComboBox.addItem(SximaType.RECTANGLE);
        sximaComboBox.addItem(SximaType.CIRCLE);

        toolBar.add(sximaComboBox);

        frame.getContentPane().add(toolBar, BorderLayout.NORTH);
    }

    public static void main(String[] args) {

        new MainDrawerWindow();
    }
}
