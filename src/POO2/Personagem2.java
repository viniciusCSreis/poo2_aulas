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
public class Personagem2 extends Personagens{
     public Personagem2() {
        setPular(new PuloAlto());
        setCorrer(new CorrerRapido());
        setAtacar(new AtacarMedio());
    
    }
}