package com.je_chen.droidRat.gui.playgui;

import com.je_chen.droidRat.gui.guisuper.GuiFather;
import com.je_chen.droidRat.gui.guisuper.GuiFatherInterface;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PlayGui extends GuiFather implements GuiFatherInterface {
    private static PlayGui Instance;
    private JFrame jFrame;
    private JPanel jPanel;
    private String windowName;

    public static synchronized PlayGui getInstance(String windowName) {
        if (Instance == null) {
            Instance = new PlayGui();
            Instance.show(windowName);
        }
        return Instance;
    }

    @Override
    protected void afterCloseEvent() {
        Instance = null;
    }
}
