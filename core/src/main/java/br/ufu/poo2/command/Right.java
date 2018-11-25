package br.ufu.poo2.command;

import br.ufu.poo2.Personagens;

public class Right extends Command {
    private Personagens personagens;

    public Right(Personagens personagens) {
        this.personagens = personagens;
    }

    @Override
    public void execute() {
        personagens.setX(personagens.getX()+10);
        testX(personagens);
    }
}
