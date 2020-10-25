package com.je_chen.websocket.module.process.command;

import com.je_chen.websocket.module.WebSocketServerEndPoint;

import javax.websocket.Session;
import java.util.Iterator;

public class CommandProcess {

    private WebSocketServerEndPoint webSocketServerEndPoint;

    public CommandProcess(){
        webSocketServerEndPoint = new WebSocketServerEndPoint();
    }

    public void processCommand(String rawString){
        try {
            if(!rawString.startsWith("userTable"))
                webSocketServerEndPoint.sendText(rawString);
            if(rawString.equals("userTable")) {
               System.out.println(webSocketServerEndPoint.getUserTable().size());
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
