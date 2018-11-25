package br.ufu.poo2.command;

import br.ufu.poo2.Personagens;

public class Up extends Command {
    private Personagens personagens;

    public Up(Personagens personagens) {
        this.personagens = personagens;
    }

    @Override
    public void execute() {
        personagens.setY(personagens.getY()-10);
        testY(personagens);
    }
}
