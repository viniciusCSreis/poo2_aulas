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
public class AtacarForte implements Atacar{
    
    int multiplicador = 5;
    
    @Override
    public void atacar(Personagens p, int dano) {
        if(Math.random() < 0.5)
        {
            dano *=multiplicador;
        }
       p.removerLife(dano);
    }
}
