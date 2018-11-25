package br.ufu.poo2.command;

import br.ufu.poo2.Personagens;
import br.ufu.poo2.observer.IObserver;
import br.ufu.poo2.observer.ISubject;
import br.ufu.poo2.observer.subjects.PersonagemPrincipal;
import br.ufu.poo2.view.Game;

public class Attack extends Command implements IObserver {

    private Game game;
    private PersonagemPrincipal personagemPrincipal;
    private int contRelogio = 0;
    private int contUltimoAtaque=0;

    public Attack(Game game, PersonagemPrincipal personagemPrincipal) {
        this.game = game;
        this.personagemPrincipal = personagemPrincipal;
    }


    @Override
    public void execute() {
        if(contRelogio-contUltimoAtaque > 250)
        {
            this.contUltimoAtaque=this.contRelogio;
            personagemPrincipal.notifyObservers("ataque");
            game.estamina=0;
        }
    }

    @Override
    public void update(ISubject p, String Tipo) {

        this.contRelogio= Integer.valueOf(Tipo);
    }
}
