package com.je_chen.droidRat.gui.guisuper;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GuiFather {

    protected static GuiFather instance;
    protected String windowName;
    protected JFrame jFrame;

    protected void show(String windowName) {
        this.windowName = windowName;
        jFrame = new JFrame(windowName);
        beforeShow();
        jFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        jFrame.setSize(500, 500);
        closeEvent();
        jFrame.setVisible(true);
    }

    protected void beforeShow(){}

    private void closeEvent() {
        jFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                inCloseEvent();
                System.out.println(windowName + " Frame Closed");
                System.exit(0);
            }
        });
    }

    protected void inCloseEvent(){}
}
