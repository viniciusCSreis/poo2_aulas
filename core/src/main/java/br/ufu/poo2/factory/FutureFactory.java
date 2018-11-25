package br.ufu.poo2.factory;

import br.ufu.poo2.ChainOfResponsibility.Escudos;
import br.ufu.poo2.ChainOfResponsibility.concreteEscudos.CampoMagnetico;
import br.ufu.poo2.Personagens;
import br.ufu.poo2.Robo;
import br.ufu.poo2.decorator.Armas;
import br.ufu.poo2.decorator.concreteComponent.RaioParalisante;

public class FutureFactory extends AbstractFactory {

    private static FutureFactory futureFactory = new FutureFactory();


    private FutureFactory(){}


    public static FutureFactory getInstance(){
        return futureFactory;
    }


    @Override
    public Armas getArma(){
        return new RaioParalisante();
    }

    @Override
    public Escudos getEscudo(){
        return new CampoMagnetico();
    }

    @Override
    public Personagens getPersonagem(){
        return new Robo(0,0,null);
    }
}



