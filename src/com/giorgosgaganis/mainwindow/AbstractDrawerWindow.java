package com.giorgosgaganis.mainwindow;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JToolBar;
import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import com.giorgosgaganis.sximata.SximaType;

public abstract class AbstractDrawerWindow {
    private JComboBox sximaComboBox;

    public AbstractDrawerWindow() {
        JFrame frame = new JFrame("Drawer");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        createToolBar(frame);

        DrawingJPanel drawingPanel = new DrawingJPanel();
        setupMouseListener(drawingPanel);

        frame.getContentPane().add(drawingPanel, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    protected void setupMouseListener(final DrawingJPanel drawingPanel) {
        drawingPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                final int x = e.getX();
                final int y = e.getY();
                final Object selectedItem = sximaComboBox.getSelectedItem();

                addSximaToPanel((SximaType) selectedItem, drawingPanel, x, y);

                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        drawingPanel.repaint();
                    }
                });
            }
        });
    }

    protected abstract void addSximaToPanel(Object selectedItem, DrawingJPanel drawingPanel, int x, int y);

    protected void createToolBar(JFrame frame) {
        JToolBar toolBar = new JToolBar();

        sximaComboBox = new JComboBox();
        addTypesToComboBox(sximaComboBox);

        toolBar.add(sximaComboBox);

        frame.getContentPane().add(toolBar, BorderLayout.NORTH);
    }

    protected abstract void addTypesToComboBox(JComboBox jComboBox);
}
