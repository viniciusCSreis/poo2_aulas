package br.ufu.poo2.factory;

import br.ufu.poo2.ChainOfResponsibility.concreteEscudos.CampoMagnetico;
import br.ufu.poo2.Robo;
import br.ufu.poo2.decorator.concreteComponent.RaioParalisante;
import org.junit.Test;

import static org.junit.Assert.*;

public class FutureFactoryTest {

    @Test
    public void getInstance() {
        FutureFactory futureFactory= FutureFactory.getInstance();
        assertTrue(futureFactory instanceof FutureFactory);
    }

    @Test
    public void getArma() {
        FutureFactory futureFactory= FutureFactory.getInstance();
        assertTrue(futureFactory.getArma() instanceof RaioParalisante);
    }

    @Test
    public void getEscudo() {
        FutureFactory futureFactory= FutureFactory.getInstance();
        assertTrue(futureFactory.getEscudo() instanceof CampoMagnetico);
    }

    @Test
    public void getPersonagem() {
        FutureFactory futureFactory= FutureFactory.getInstance();
        assertTrue(futureFactory.getPersonagem() instanceof Robo);
    }
}