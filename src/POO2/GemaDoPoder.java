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
public class GemaDoPoder extends Gemas{
    public GemaDoPoder(Armas armaDecorada)
    {
        super(armaDecorada);
        super.setDano(1);
        super.setPorder(2);
    }
}