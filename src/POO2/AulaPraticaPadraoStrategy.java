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
        Armas espadaLv1 = new Espada();
        System.out.println("espadaLv1 Dano:"+espadaLv1.getDano());
        System.out.println("espadaLv1 Poder:"+espadaLv1.getPoder());
        Armas espadaLv2 = new GemaDoDano(espadaLv1);
        System.out.println("espadaLv2 Dano:"+espadaLv2.getDano());
        System.out.println("espadaLv2 Poder:"+espadaLv2.getPoder());
        Armas espadaLv3 = new GemaDoPoder(espadaLv2);
        System.out.println("espadaLv3 Dano:"+espadaLv3.getDano());
        System.out.println("espadaLv3 Poder:"+espadaLv3.getPoder());
        Armas espadaLv4 = new GemaRara(espadaLv3);
        System.out.println("espadaLv4 Dano:"+espadaLv4.getDano());
        System.out.println("espadaLv4 Poder:"+espadaLv4.getPoder());
        
        Armas arcoLv1 = new Espada();
        System.out.println("arcoLv1 Dano:"+arcoLv1.getDano());
        System.out.println("arcoLv1 Poder:"+arcoLv1.getPoder());
        Armas arcoLv2 = new GemaDoDano(arcoLv1);
        System.out.println("arcoLv2 Dano:"+arcoLv2.getDano());
        System.out.println("arcoLv2 Poder:"+arcoLv2.getPoder());
        Armas arcoLv3 = new GemaDoPoder(arcoLv2);
        System.out.println("arcoLv3 Dano:"+arcoLv3.getDano());
        System.out.println("arcoLv3 Poder:"+arcoLv3.getPoder());
        Armas arcoLv4 = new GemaRara(arcoLv3);
        System.out.println("arcoLv4 Dano:"+arcoLv3.getDano());
        System.out.println("arcoLv4 Poder:"+arcoLv3.getPoder());       
        
        
        
        PersonagemPrincipal pp = new PersonagemPrincipal(0,0,espadaLv1);
        pp.show();
        Inimigos i1 = new Inimigo1(15,20,espadaLv1);
        Inimigos i2 = new Inimigo2(20,20,espadaLv2);
        Inimigos i3 = new Inimigo3(5,5,espadaLv3);
        Inimigos i4 = new Inimigo1(10,20,espadaLv4);
        Inimigos i5 = new Inimigo2(1,5,arcoLv1);
        Inimigos i6 = new Inimigo3(20,10,arcoLv2);
        Inimigos i7 = new Inimigo1(2,15,arcoLv3);
        Inimigos i8 = new Inimigo1(2,15,arcoLv4);
        
        pp.registerObserver(i1);
        pp.registerObserver(i2);
        pp.registerObserver(i3);        
        pp.registerObserver(i4);        
        pp.registerObserver(i5);        
        pp.registerObserver(i6);        
        pp.registerObserver(i7);     
        pp.registerObserver(i8);     
        
        while(pp.getLife()>0)
        {
            pp.show();
            Thread.sleep(200);
 
        }
        
        
    }
    
}
