package com.je_chen.websocket.module.process.receive.data.process;

import com.je_chen.websocket.module.process.receive.data.process_super.DataFather;

public class ToastData extends DataFather {

    @Override
    public void processData(String[] dataArray) {
        System.out.println(dataArray[1] + " : " + dataArray[2]);
    }
}
