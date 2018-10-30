package br.ufu.poo2.factory;

import br.ufu.poo2.observer.observers.Inimigos;

import java.util.ArrayList;

public abstract class InimigoFactory {

    protected static ArrayList<int[]> posicoes = init_posicoes();

    public abstract Inimigos getInimigo();

    private static ArrayList<int[]> init_posicoes() {
        ArrayList<int[]> posicoes = new ArrayList<>();

        int[] p = new int[2];
        p[0]=0;
        p[1]=0;
        posicoes.add(p);

        p = new int[2];
        p[0]=0;
        p[1]=350;
        posicoes.add(p);

        p = new int[2];
        p[0]=0;
        p[1]=700;
        posicoes.add(p);

        p = new int[2];
        p[0]=350;
        p[1]=0;
        posicoes.add(p);

        p = new int[2];
        p[0]=350;
        p[1]=700;
        posicoes.add(p);

        p = new int[2];
        p[0]=700;
        p[1]=0;
        posicoes.add(p);

        p = new int[2];
        p[0]=700;
        p[1]=350;
        posicoes.add(p);

        p = new int[2];
        p[0]=700;
        p[1]=700;
        posicoes.add(p);

        return posicoes;
    }
}
