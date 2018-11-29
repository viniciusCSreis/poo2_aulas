/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufu.poo2.observer.observers;

import br.ufu.poo2.decorator.Armas;
import br.ufu.poo2.strategies.concreteStrategies.atacar.AtaqueDeFogo;
import br.ufu.poo2.strategies.concreteStrategies.correr.CorrerMedio;
import br.ufu.poo2.strategies.concreteStrategies.pular.PuloMedio;

/**
 *
 * @author vinic
 */
public class Inimigo1 extends Inimigos {

    public Inimigo1(int x , int y, Armas arma) {
        super(x,y,arma);
        setPular(new PuloMedio());
        setCorrer(new CorrerMedio());
        setAtacar(new AtaqueDeFogo());
    }



}
