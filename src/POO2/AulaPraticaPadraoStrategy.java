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
public class AulaPraticaPadraoStrategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Personagens p=new Personagem1();
        p.test();
        p=new Personagem2();
        p.test();
        p=new Personagem3();
        p.test();
    }
    
}
