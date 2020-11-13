package com.je_chen.websocket.module.process.send.command.process;

import com.je_chen.websocket.module.WebSocketServerEndPoint;
import com.je_chen.websocket.module.process.send.command.process_super.CommandFather;

public class SendCommand extends CommandFather {

    private WebSocketServerEndPoint webSocketServerEndPoint;

    public SendCommand(WebSocketServerEndPoint webSocketServerEndPoint){
        this.webSocketServerEndPoint = webSocketServerEndPoint;
    }

    @Override
    public void processCommand(String command) {
        this.webSocketServerEndPoint.sendText(command);
    }
}
