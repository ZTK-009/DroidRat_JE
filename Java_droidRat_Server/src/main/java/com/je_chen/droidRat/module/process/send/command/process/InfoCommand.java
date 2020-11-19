package com.je_chen.droidRat.module.process.send.command.process;

import com.je_chen.droidRat.module.WebSocketServerEndPoint;
import com.je_chen.droidRat.module.process.send.command.process_super.CommandFather;

public class InfoCommand extends CommandFather {

    private final WebSocketServerEndPoint webSocketServerEndPoint;

    public InfoCommand(WebSocketServerEndPoint webSocketServerEndPoint) {
        this.webSocketServerEndPoint = webSocketServerEndPoint;
    }

    @Override
    public void processCommand(String command) {
        switch (command) {
            case "userTable-Length":
                System.out.println(webSocketServerEndPoint.getUserTable().size());
                break;
        }
    }
}
