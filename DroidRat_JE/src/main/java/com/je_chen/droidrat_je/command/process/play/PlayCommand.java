package com.je_chen.droidrat_je.command.process.play;

import com.je_chen.droidrat_je.appintent.play.Play;
import com.je_chen.droidrat_je.command.process.CommandFather;
import com.je_chen.droidrat_je.command.process.CommandProcessInterface;

public class PlayCommand extends CommandFather implements CommandProcessInterface {

    //TODO play sound
    private Play play;

    public PlayCommand(){
        play = new Play();
    }

    @Override
    public void send(String value) {

    }

    @Override
    public void processCommand(String command) {

    }
}
