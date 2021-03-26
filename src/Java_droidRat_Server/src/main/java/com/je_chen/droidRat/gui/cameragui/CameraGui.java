package com.je_chen.droidRat.gui.cameragui;

import com.je_chen.droidRat.gui.guisuper.GuiFather;
import com.je_chen.droidRat.gui.guisuper.GuiFatherInterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CameraGui extends GuiFather implements GuiFatherInterface {
    private static CameraGui Instance;
    private JPanel jPanel;

    public static synchronized CameraGui getInstance(String windowName) {
        if (Instance == null) {
            Instance = new CameraGui();
            Instance.show(windowName);
            Camera camera = Camera.getInstance();
            Instance.add(camera);
            new Thread(camera).start();
            Instance.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        return Instance;
    }



    @Override
    protected void closeEvent() {
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.out.println(windowName + " Frame Closed");
                System.exit(0);
            }
        });
        instance = null;
    }

}
