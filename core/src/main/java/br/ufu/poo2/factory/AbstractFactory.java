package br.ufu.poo2.factory;

import br.ufu.poo2.observer.observers.Inimigos;

public abstract class AbstractFactory {

    public abstract Inimigos spawnDeInimigosSuperior();
    public abstract Inimigos spawnDeInimigosInferior();
}
