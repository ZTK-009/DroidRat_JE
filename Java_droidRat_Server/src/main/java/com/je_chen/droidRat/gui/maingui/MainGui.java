package com.je_chen.droidRat.gui.maingui;

import com.je_chen.droidRat.gui.guisuper.GuiFather;
import com.je_chen.droidRat.gui.guisuper.GuiFatherInterface;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGui extends GuiFather implements GuiFatherInterface {

    private static MainGui Instance;
    private JPanel jPanel;
    private JButton Connect;
    private JButton Close;
    private JButton File;
    private JButton SettingButton;
    private JButton Feature;
    private JTextField textField1;
    private JToolBar menuBar;

    private MainGui() {
        Connect.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hello");
            }
        });
    }

    public static synchronized MainGui getInstance(String windowName) {
        if (Instance == null) {
            Instance = new MainGui();
            Instance.show(windowName);
        }
        return Instance;
    }

    @Override
    protected void beforeShow() {
        menuBar.setFloatable(false);
        jFrame.setContentPane(getInstance(windowName).jPanel);
    }

    @Override
    protected void inCloseEvent() {
        Instance = null;
    }


}
