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
public class Inimigo3 extends Inimigos{
     public Inimigo3(int x , int y,Armas arma) {
        super(x,y,arma);
        setPular(new PuloBaixo());
        setCorrer(new CorrerRapido());
        setAtacar(new AtacarForte());
    
    }
}
