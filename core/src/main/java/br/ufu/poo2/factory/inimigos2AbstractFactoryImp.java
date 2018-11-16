package br.ufu.poo2.factory;

import br.ufu.poo2.decorator.concreteComponent.Espada;
import br.ufu.poo2.observer.observers.Inimigo1;
import br.ufu.poo2.observer.observers.Inimigo2;
import br.ufu.poo2.observer.observers.Inimigos;

public class inimigos2AbstractFactoryImp extends AbstractFactory {
    @Override
    public Inimigos spawnDeInimigosSuperior() {
        return new Inimigo2(0,0, new Espada());
    }

    @Override
    public Inimigos spawnDeInimigosInferior() {
        return new Inimigo2(700,700, new Espada());
    }
}
