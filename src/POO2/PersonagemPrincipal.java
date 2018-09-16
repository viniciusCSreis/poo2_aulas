/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO2;

import java.util.ArrayList;

/**
 *
 * @author vinicius
 */
public class PersonagemPrincipal extends Personagens implements ISubject{

    ArrayList <IObserver> observers = new ArrayList<IObserver> ();
    
    
    public PersonagemPrincipal(int x , int y , Armas arma) {
        super(x,y,arma);
        setPular(new PuloMedio());
        setCorrer(new CorrerMedio());
        setAtacar(new AtacarMedio());        
        setLife(100);
    }

        
    @Override
    public void registerObserver(IObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
         this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        Personagens p = this;
        for(IObserver o  : this.observers)
        {
            
            o.update(p);
        }
    }
    public void show()
    {
        this.notifyObservers();
        System.out.println("Posicao do Personagem Principal: ("+this.getX()+","+this.getY()+")");
        System.out.println("Life do Personagem Principal: ("+this.getLife()+")");
    }
    
}
