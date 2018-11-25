package br.ufu.poo2.factory;

import br.ufu.poo2.Arqueiro;
import br.ufu.poo2.ChainOfResponsibility.concreteEscudos.Escudo_de_Fogo;
import br.ufu.poo2.decorator.concreteComponent.Arco;
import org.junit.Test;

import static org.junit.Assert.*;

public class MedievalFactoryTest {

    @Test
    public void getInstance() {

        MedievalFactory medievalFactory = MedievalFactory.getInstance();
        assertTrue(medievalFactory instanceof MedievalFactory);

    }

    @Test
    public void getArma() {
        MedievalFactory medievalFactory = MedievalFactory.getInstance();
        assertTrue(medievalFactory.getArma() instanceof Arco);
    }

    @Test
    public void getEscudo() {
        MedievalFactory medievalFactory = MedievalFactory.getInstance();
        assertTrue(medievalFactory.getEscudo() instanceof Escudo_de_Fogo);
    }

    @Test
    public void getPersonagem() {
        MedievalFactory medievalFactory = MedievalFactory.getInstance();
        assertTrue(medievalFactory.getPersonagem() instanceof Arqueiro);
    }
}