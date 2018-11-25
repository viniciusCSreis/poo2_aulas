package br.ufu.poo2.factory;

import br.ufu.poo2.ChainOfResponsibility.Escudos;
import br.ufu.poo2.ChainOfResponsibility.concreteEscudos.CampoMagnetico;
import br.ufu.poo2.Personagens;
import br.ufu.poo2.Robo;
import br.ufu.poo2.decorator.Armas;
import br.ufu.poo2.decorator.concreteComponent.RaioParalisante;

public abstract class AbstractFactory {

    abstract Armas getArma();
    abstract Escudos getEscudo();
    abstract Personagens getPersonagem();

}
