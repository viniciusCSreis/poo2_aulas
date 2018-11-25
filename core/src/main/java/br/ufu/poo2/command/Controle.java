package br.ufu.poo2.command;

import java.util.ArrayList;

public class Controle
{
    private Command[] commands = new Command[9];
    private ArrayList<Command> log = new ArrayList<>();

    public void setCommand(Command c, int i){
        this.commands[i] = c;
    }

    public void pressionar(int i){
        this.commands[i].execute();
        log.add(commands[i]);
    }

    public Command[] getCommands() {
        return commands;
    }
}