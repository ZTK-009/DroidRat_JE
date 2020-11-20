package com.je_chen.droidRat.gui.maingui;

import com.je_chen.droidRat.gui.guisuper.GuiFatherAbstract;
import com.je_chen.droidRat.gui.guisuper.GuiFatherInterface;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainGui extends GuiFatherAbstract implements GuiFatherInterface<MainGui> {

    private static MainGui Instance;
    private String windowName;
    private JFrame jFrame;
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

    private void show(String windowName) {
        this.windowName = windowName;
        menuBar.setFloatable(false);
        jFrame = new JFrame(windowName);
        jFrame.setContentPane(getInstance(windowName).jPanel);
        jFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        closeEvent();
        jFrame.setVisible(true);
    }

    private void closeEvent() {
        jFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                Instance = null;
                System.out.println(windowName + " Frame Closed");
                System.exit(0);
            }
        });
    }
}
