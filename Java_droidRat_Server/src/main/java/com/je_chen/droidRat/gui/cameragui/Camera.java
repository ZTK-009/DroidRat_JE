package com.je_chen.droidRat.gui.cameragui;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Camera extends JPanel implements Runnable {

    private Boolean running = true;
    private static Camera Instance;

    public static synchronized Camera getInstance() {
        if (Instance == null) {
            Instance = new Camera();
        }
        return Instance;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Image image = Toolkit.getDefaultToolkit().getImage(new File("").getAbsolutePath() + "CameraImage.png");
        g.drawImage(image, 0, 0, this);
    }


    @Override
    public void run() {
        Image image = Toolkit.getDefaultToolkit().getImage(new File("").getAbsolutePath() + "CameraImage.png");
        getGraphics().drawImage(image, 0, 0, this);
        while (running) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            repaint();
        }
    }

    public void setRunning(boolean running) {
        this.running = running;
    }
}
