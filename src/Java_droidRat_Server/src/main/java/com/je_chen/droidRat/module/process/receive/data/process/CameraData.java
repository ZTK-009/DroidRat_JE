package com.je_chen.droidRat.module.process.receive.data.process;

import com.je_chen.droidRat.gui.cameragui.Camera;
import com.je_chen.droidRat.gui.cameragui.CameraGui;
import com.je_chen.droidRat.module.process.receive.data.process_super.DataFather;
import com.je_chen.droidRat.module.util.Base64Image;


public class CameraData extends DataFather {

    private final Base64Image imageProcess;

    public CameraData() {
        imageProcess = new Base64Image();
    }

    @Override
    public void processData(String[] dataArray) {
        imageProcess.base64String_To_Image(dataArray[1], true);
    }

}
