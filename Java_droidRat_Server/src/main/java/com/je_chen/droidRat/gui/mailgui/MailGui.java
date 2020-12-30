package com.je_chen.droidRat.gui.mailgui;

import com.je_chen.droidRat.gui.guisuper.GuiFather;
import com.je_chen.droidRat.gui.guisuper.GuiFatherInterface;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class MailGui extends GuiFather implements GuiFatherInterface {
    private static MailGui Instance;
    private JFrame jFrame;
    private JPanel jPanel;
    private String windowName;

    public static synchronized MailGui getInstance(String windowName) {
        if (Instance == null) {
            Instance = new MailGui();
            Instance.show(windowName);
        }
        return Instance;
    }

    @Override
    protected void inCloseEvent() {
        Instance = null;
    }
}
