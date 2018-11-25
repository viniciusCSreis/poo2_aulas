package br.ufu.poo2.factory;

import br.ufu.poo2.ChainOfResponsibility.Escudos;
import br.ufu.poo2.Personagens;
import br.ufu.poo2.decorator.Armas;

public class PersonagemFactory {


    static Personagens getPersonagem(AbstractFactory f){

        Personagens p = f.getPersonagem();
        Armas a = f.getArma();
        Escudos e = f.getEscudo();

        p.setArma(a);
        p.setEscudo(e);

        return p;

    }
}
