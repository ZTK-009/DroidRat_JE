package com.je_chen.droidRat.gui.cameragui;

import com.je_chen.droidRat.gui.guisuper.GuiFather;
import com.je_chen.droidRat.gui.guisuper.GuiFatherInterface;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CameraGui extends GuiFather implements GuiFatherInterface {
    private static CameraGui Instance;
    private JPanel jPanel;

    public static synchronized CameraGui getInstance(String windowName) {
        if (Instance == null) {
            Instance = new CameraGui();
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
