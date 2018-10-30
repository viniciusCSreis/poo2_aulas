/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufu.poo2.decorator.decorator.concreteDecorator.bonusDeAtaque;

import br.ufu.poo2.decorator.decorator.BonusDeAtaque;
import br.ufu.poo2.strategies.Atacar;

/**
 *
 * @author vinicius
 */
public class BonusDeAtaque2x extends BonusDeAtaque {
    
    public BonusDeAtaque2x(Atacar ataqueDecorado) {
        super(ataqueDecorado);
        super.setTipoAtaque(ataqueDecorado.getTipoAtaque());
        super.setMultiplicador(2);
    }
    
}
