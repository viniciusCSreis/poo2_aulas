package br.ufu.poo2.factory;

import br.ufu.poo2.decorator.concreteComponent.Espada;
import br.ufu.poo2.observer.observers.Inimigo1;
import br.ufu.poo2.observer.observers.Inimigos;

public class inimigos1AbstractFactoryImp extends AbstractFactory {
    @Override
    public Inimigos spawnDeInimigosSuperior() {
        return new Inimigo1(0,0, new Espada());
    }

    @Override
    public Inimigos spawnDeInimigosInferior() {
        return new Inimigo1(700,700, new Espada());
    }
}
