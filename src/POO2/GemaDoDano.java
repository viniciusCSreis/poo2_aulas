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
public class GemaDoDano extends Gemas{
    public GemaDoDano(Armas armaDecorada)
    {
        super(armaDecorada);
        super.setDano(2);
        super.setPorder(1);
    }
}
