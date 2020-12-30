package com.je_chen.droidRat.gui.guisuper;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GuiFather extends JFrame{

    protected static GuiFather instance;
    protected String windowName;

    protected void show(String windowName) {
        this.windowName = windowName;
        setTitle(windowName);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setSize(500, 500);
        closeEvent();
        setVisible(true);
    }

    protected void closeEvent() {
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.out.println(windowName + " Frame Closed");
                System.exit(0);
            }
        });
    }

}
