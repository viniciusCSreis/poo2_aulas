package test.factory;

import POO2.decorator.concreteComponent.Espada;
import POO2.factory.Inimigos1Factory;
import POO2.observer.observers.Inimigo1;
import POO2.observer.observers.Inimigos;
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