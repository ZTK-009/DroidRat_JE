package com.je_chen.droidRat.gui.toastgui;

import com.je_chen.droidRat.gui.guisuper.GuiFather;
import com.je_chen.droidRat.gui.guisuper.GuiFatherInterface;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ToastGui extends GuiFather implements GuiFatherInterface {
    private static ToastGui Instance;
    private JFrame jFrame;
    private JPanel jPanel;
    private String windowName;

    public static synchronized ToastGui getInstance(String windowName) {
        if (Instance == null) {
            Instance = new ToastGui();
            Instance.show(windowName);
        }
        return Instance;
    }

    @Override
    protected void afterCloseEvent() {
        Instance = null;
    }
}
