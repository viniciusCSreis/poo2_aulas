package br.ufu.poo2.command;

import br.ufu.poo2.Personagens;

public abstract class Command {

    public abstract void execute();


    public void testX(Personagens personagens){
        if(personagens.getX()>700)
            personagens.setX(700);
        if(personagens.getX()<0)
            personagens.setX(0);
    }
    public void testY(Personagens personagens){
        if(personagens.getY()>700)
            personagens.setY(700);
        if(personagens.getY()<0)
            personagens.setY(0);
    }

}
