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

    @Override
    public void atacar(Personagens p) {
       p.removerLife(3);
    }
}
