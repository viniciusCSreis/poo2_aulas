/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufu.poo2.decorator.decorator;

import br.ufu.poo2.strategies.Atacar;

/**
 *
 * @author vinicius
 */
public abstract class BonusDeAtaque extends Atacar {
    private Atacar ataqueDecorado;
    public BonusDeAtaque(Atacar ataqueDecorado)
    {
        this.ataqueDecorado = ataqueDecorado;
    }
    public int atacar(int dano)
    {
        return ataqueDecorado.atacar(dano) * super.getMultiplicador();
    } 
}
