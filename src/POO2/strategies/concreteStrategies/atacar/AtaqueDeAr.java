/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO2.strategies.concreteStrategies.atacar;

import POO2.strategies.Atacar;

/**
 *
 * @author vinic
 */
public class AtaqueDeAr extends Atacar {
    private int multiplicador = 3;
    private float ChanceDeAcerto = (float) 0.7;
    public AtaqueDeAr()
    {
        super.setTipoAtaque("Ar");
        super.setMultiplicador(multiplicador);
        super.setChanceDeAcerto(ChanceDeAcerto);
    }
}
