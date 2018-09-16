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
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        PersonagemPrincipal pp = new PersonagemPrincipal(0,0);
        pp.show();
        Inimigos i1 = new Inimigo1(15,20);
        Inimigos i2 = new Inimigo2(20,20);
        Inimigos i3 = new Inimigo3(5,5);
        Inimigos i4 = new Inimigo1(10,20);
        Inimigos i5 = new Inimigo2(1,5);
        Inimigos i6 = new Inimigo3(20,10);
        Inimigos i7 = new Inimigo1(2,15);
        
        pp.registerObserver(i1);
        pp.registerObserver(i2);
        pp.registerObserver(i3);        
        pp.registerObserver(i4);        
        pp.registerObserver(i5);        
        pp.registerObserver(i6);        
        pp.registerObserver(i7);     
        
        while(pp.getLife()>0)
        {
            pp.show();
            Thread.sleep(200);
 
        }
        
        
    }
    
}
