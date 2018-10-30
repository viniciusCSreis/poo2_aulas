package br.ufu.poo2.factory;

import br.ufu.poo2.decorator.concreteComponent.Espada;
import br.ufu.poo2.factory.Inimigos1Factory;
import br.ufu.poo2.observer.observers.Inimigos;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InimigosAdvancedFactoryTest {
    @Test
    public void inimigosFactoryTestReturnInimigo(){
        assertTrue( Inimigos1Factory.getInstace().getInimigo() instanceof Inimigos);
    }

    @Test
    public void inimigosFactoryTestX(){
        int x = Inimigos1Factory.getInstace().getInimigo().getX();
        assertTrue( x>= 0 && x<=700);
    }

    @Test
    public void inimigosFactoryTestY(){
        int y = Inimigos1Factory.getInstace().getInimigo().getY();
        assertTrue( y>= 0 && y<=700);
    }

    @Test
    public void inimigosFactoryArma(){
        assertTrue(Inimigos1Factory.getInstace().getInimigo().getArma() instanceof Espada);
    }
}