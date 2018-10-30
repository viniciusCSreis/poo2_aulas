/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufu.poo2.strategies.concreteStrategies.atacar;

import br.ufu.poo2.strategies.Atacar;

/**
 *
 * @author vinic
 */
public class AtaqueDeTerra extends Atacar {
    private int multiplicador = 2;
    private float ChanceDeAcerto = (float) 0.9;
    public AtaqueDeTerra()
    {
        super.setTipoAtaque("Terra");
        super.setMultiplicador(multiplicador);
        super.setChanceDeAcerto(ChanceDeAcerto);
    }
}
