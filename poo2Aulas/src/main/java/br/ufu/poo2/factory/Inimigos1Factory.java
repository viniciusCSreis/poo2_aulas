package br.ufu.poo2.factory;

import br.ufu.poo2.decorator.concreteComponent.Espada;
import br.ufu.poo2.observer.observers.*;

public class Inimigos1Factory extends InimigoFactory{

    private static Inimigos1Factory instace = new Inimigos1Factory();

    private Inimigos1Factory(){}

    public static Inimigos1Factory getInstace(){
        return  instace;
    }

    public Inimigos getInimigo(){
        double r = Math.random();
        int i = -1;

        if( r <= 0.2)               i = 0;
        if( r >  0.2 && r <= 0.4)   i = 1;
        if( r >  0.4 && r <= 0.6)   i = 2;
        if( r >  0.6 && r <= 0.8)   i = 3;
        if( r >  0.8 && r <= 1.0)   i = 4;

        int[] p = posicoes.get( i % posicoes.size() );

        return new Inimigo1(p[0], p[1], new Espada());

    }

}
