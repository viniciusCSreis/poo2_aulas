/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufu.poo2.decorator.decorator.concreteDecorator.gemas;

import br.ufu.poo2.decorator.Armas;
import br.ufu.poo2.decorator.decorator.Gemas;

/**
 *
 * @author vinicius
 */
public class GemaDoPoder extends Gemas {
    public GemaDoPoder(Armas armaDecorada)
    {
        super(armaDecorada);
        super.setDano(1);
        super.setPorder(2);
    }
}
