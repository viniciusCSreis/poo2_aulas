/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO2;

/**
 *
 * @author vinic
 */
public class AtaqueDeFogo extends Atacar{
    private int multiplicador = 5;
    private float ChanceDeAcerto = (float) 0.3;
    public AtaqueDeFogo()
    {
        super.setTipoAtaque("Fogo");
        super.setMultiplicador(multiplicador);
        super.setChanceDeAcerto(ChanceDeAcerto);
    }
}