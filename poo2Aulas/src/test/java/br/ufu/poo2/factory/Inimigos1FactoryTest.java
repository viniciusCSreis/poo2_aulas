package br.ufu.poo2.factory;

import br.ufu.poo2.decorator.concreteComponent.Espada;
import br.ufu.poo2.factory.Inimigos1Factory;
import br.ufu.poo2.observer.observers.Inimigo1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Inimigos1FactoryTest {

    @Test
    public void inimigos1FactoryTestReturnInimigo1(){
        assertTrue( Inimigos1Factory.getInstace().getInimigo() instanceof Inimigo1);
    }

    @Test
    public void inimigos1FactoryTestX(){
        int x = Inimigos1Factory.getInstace().getInimigo().getX();
        assertTrue( x>= 0 && x<=700);
    }

    @Test
    public void inimigos1FactoryTestY(){
        int y = Inimigos1Factory.getInstace().getInimigo().getY();
        assertTrue( y>= 0 && y<=700);
    }

    @Test
    public void inimigos1FactoryArma(){
        assertTrue(Inimigos1Factory.getInstace().getInimigo().getArma() instanceof Espada);
    }
}