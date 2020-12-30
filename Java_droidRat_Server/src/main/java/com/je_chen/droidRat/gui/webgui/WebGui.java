package com.je_chen.droidRat.gui.webgui;

import com.je_chen.droidRat.gui.guisuper.GuiFather;
import com.je_chen.droidRat.gui.guisuper.GuiFatherInterface;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WebGui extends GuiFather implements GuiFatherInterface {
    private static WebGui Instance;
    private JPanel jPanel;

    public static synchronized WebGui getInstance(String windowName) {
        if (Instance == null) {
            Instance = new WebGui();
            Instance.show(windowName);
        }
        return Instance;
    }

    @Override
    protected void closeEvent() {
        super.closeEvent();
        instance = null;
    }
}
