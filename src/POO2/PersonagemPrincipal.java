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
public class PersonagemPrincipal extends Personagens implements ISubject,IObserver{

    ArrayList <IObserver> observers = new ArrayList<IObserver> ();
    
    public PersonagemPrincipal(int x , int y , Armas arma) {
        super(x,y,arma);
        setPular(new PuloMedio());
        setCorrer(new CorrerMedio());
        setAtacar(new AtaqueDeAr());        
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
    public void notifyObservers(String msg) {
        String tipo = msg;
        if(this.observers.size()>0);
        for(IObserver o  : this.observers)
        {
           o.update(this,tipo);
        }
    }

    public ArrayList<IObserver> getObservers() {
        ArrayList<IObserver> observer=new ArrayList<IObserver> ();
        
        for(IObserver o  : this.observers)
        {
           observer.add(o);
        }
        observer.add(0,this);
        return observer;
    }
    
    
    @Override
    public void update(ISubject p, String Tipo) {
        this.notifyObservers(null);
    }
    
}
