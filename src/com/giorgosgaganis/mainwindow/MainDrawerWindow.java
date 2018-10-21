package com.giorgosgaganis.mainwindow;

import com.giorgosgaganis.mainwindow.drawables.Drawable;
import com.giorgosgaganis.mainwindow.drawables.DrawableType;
import com.giorgosgaganis.mainwindow.drawables.Sxima;
import com.giorgosgaganis.mainwindow.drawables.DrawableFactory;

import javax.swing.*;

/*
Our client wants us to draw shapes. To do this he has has given
us this class where we are give 2 methods where we can register
the types of shapes that we can draw and a second function that
will be called when the mouse is clicked with the coordinates
and the selected type.

We are also given a DrawingJPanel that we can use to draw our shapes.

* We need to make all the necessary changes so we can draw circles
  and a square. The size of the square is 100px and the radius of the
  circle is 80 pixes. We are also asked to display the area of the
  shape.

* Next we are asked to also draw a rectangle with width 200 and
  height 50.
*/

public class MainDrawerWindow extends AbstractDrawerWindow {

    public MainDrawerWindow() {
        super();
    }

    @Override
    protected void addSximaToPanel(Object selectedItem,
                                   DrawingJPanel drawingPanel,
                                   int x, int y) {
        System.out.println("Mouse has been clicked");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("selectedItem = " + selectedItem);
        if (selectedItem instanceof DrawableType) {
            DrawableFactory factory = new DrawableFactory();
            Drawable sxima = factory.
                    getSximaForTypeAndLocation((DrawableType) selectedItem,
                            x, y);

            drawingPanel.addSxima(sxima);
        }
    }

    @Override
    protected void addTypesToComboBox(JComboBox jComboBox) {

        jComboBox.addItem(DrawableType.SQUARE);
        jComboBox.addItem(DrawableType.CIRCLE);
        jComboBox.addItem(DrawableType.RECTANGLE);
        jComboBox.addItem(DrawableType.GREETING_WORLD);
    }


    public static void main(String[] args) {

        new MainDrawerWindow();
    }
}
