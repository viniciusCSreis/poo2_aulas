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
public class Personagem1 extends Personagens{

    public Personagem1() {
        setPular(new PuloMedio());
        setCorrer(new CorrerMedio());
        setAtacar(new AtacarForte());
    
    }
    
}