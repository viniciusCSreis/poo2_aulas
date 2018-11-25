package br.ufu.poo2.factory;

import br.ufu.poo2.Arqueiro;
import br.ufu.poo2.ChainOfResponsibility.Escudos;
import br.ufu.poo2.ChainOfResponsibility.concreteEscudos.Escudo_de_Fogo;
import br.ufu.poo2.Personagens;
import br.ufu.poo2.decorator.Armas;
import br.ufu.poo2.decorator.concreteComponent.Arco;

public class MedievalFactory extends AbstractFactory {
    private static MedievalFactory medievalFactory = new MedievalFactory();


    private MedievalFactory(){}


    public static MedievalFactory getInstance(){
        return medievalFactory;
    }

    @Override
    Armas getArma() {
        return new Arco();
    }

    @Override
    Escudos getEscudo() {
        return new Escudo_de_Fogo();
    }

    @Override
    Personagens getPersonagem() {
        return new Arqueiro(0,0,null);
    }
}
