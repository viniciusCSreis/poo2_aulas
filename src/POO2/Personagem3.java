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
public class Personagem3 extends Personagens{
     public Personagem3() {
        setPular(new PuloBaixo());
        setCorrer(new CorrerRapido());
        setAtacar(new AtacarForte());
    
    }
}
