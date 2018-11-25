package br.ufu.poo2.factory;

import br.ufu.poo2.Personagens;
import br.ufu.poo2.command.*;
import br.ufu.poo2.observer.subjects.PersonagemPrincipal;
import br.ufu.poo2.view.Game;

public class SimpleControleFactory {

    public static Controle getInstance(PersonagemPrincipal personagemPrincipal, Game game){
        Controle controle = new Controle();
        controle.setCommand(new Left(personagemPrincipal),0);
        controle.setCommand(new Right(personagemPrincipal),1);
        controle.setCommand(new Up(personagemPrincipal),2);
        controle.setCommand(new Down(personagemPrincipal),3);
        controle.setCommand(new Attack(game,personagemPrincipal),4);
        Macro macro7 = new Macro();
        macro7.addCommand(new Up(personagemPrincipal));
        macro7.addCommand(new Left(personagemPrincipal));
        controle.setCommand(macro7,5);
        Macro macro9 = new Macro();
        macro9.addCommand(new Up(personagemPrincipal));
        macro9.addCommand(new Right(personagemPrincipal));
        controle.setCommand(macro9,6);
        Macro macro1 = new Macro();
        macro1.addCommand(new Down(personagemPrincipal));
        macro1.addCommand(new Left(personagemPrincipal));
        controle.setCommand(macro1,7);
        Macro macro3 = new Macro();
        macro3.addCommand(new Down(personagemPrincipal));
        macro3.addCommand(new Right(personagemPrincipal));
        controle.setCommand(macro3,8);



        return controle;

    }


}
