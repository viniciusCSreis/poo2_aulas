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
public abstract class  Gemas extends Armas{
    private Armas armaDecorada;
    public Gemas(Armas armaDecorado)
    {
        this.armaDecorada=armaDecorado;
    }
    public int getDano()
    {
        return armaDecorada.getDano()+super.getDano();
    }
    public int getPoder()
    {
        return armaDecorada.getPoder()+ super.getPoder();
    }
}
