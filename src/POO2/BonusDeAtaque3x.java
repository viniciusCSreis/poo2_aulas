/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO2;

/**
 *
 * @author vinicius
 */
public class BonusDeAtaque3x extends BonusDeAtaque{
    
    public BonusDeAtaque3x(Atacar ataqueDecorado) {
        super(ataqueDecorado);
        super.setTipoAtaque(ataqueDecorado.getTipoAtaque());
        super.setMultiplicador(3);
    }
    
}
