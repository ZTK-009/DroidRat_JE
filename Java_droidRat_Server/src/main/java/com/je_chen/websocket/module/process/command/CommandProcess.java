package com.je_chen.websocket.module.process.command;

import com.je_chen.websocket.module.WebSocketServerEndPoint;

public class CommandProcess {

    private WebSocketServerEndPoint webSocketServerEndPoint;

    public CommandProcess() {
        webSocketServerEndPoint = new WebSocketServerEndPoint();
    }

    public void processCommand(String rawString) {
        try {
            System.out.println("Process Command : " + rawString);
            String[] rawStringArray = rawString.split("!");
            switch (rawStringArray[0]) {

                case "send":
                    webSocketServerEndPoint.sendText(rawStringArray[1]);
                    break;

                case "userTable-Length":
                    System.out.println(webSocketServerEndPoint.getUserTable().size());
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
