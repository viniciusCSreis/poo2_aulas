package br.ufu.poo2.factory;

import br.ufu.poo2.decorator.concreteComponent.Espada;
import br.ufu.poo2.observer.observers.Inimigo1;
import br.ufu.poo2.observer.observers.Inimigo3;
import br.ufu.poo2.observer.observers.Inimigos;

public class inimigos3AbstractFactoryImp extends AbstractFactory {
    @Override
    public Inimigos spawnDeInimigosSuperior() {
        return new Inimigo3(0,0, new Espada());
    }

    @Override
    public Inimigos spawnDeInimigosInferior() {
        return new Inimigo3(700,700, new Espada());
    }
}
