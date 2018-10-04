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
    private int mortes = 0;
    public PersonagemPrincipal(int x , int y , Armas arma) {
        super(x,y,arma);
        setPular(new PuloMedio());
        setCorrer(new CorrerMedio());
        setAtacar(new AtaqueDeAr());        
        setLife(100);
        observers.add(this);
    }

    public int getMortes() {
        return mortes;
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
            if(o==this)continue;
            o.update(this,tipo);
        }
    }

    public ArrayList<IObserver> getObservers() {
        ArrayList<IObserver> observer=new ArrayList<IObserver> ();
        
        for(IObserver o  : this.observers)
        {
            Personagens p = (Personagens)o;
            if(p.isAlife())
                observer.add(o);
            else
            {
                mortes++;
            }
                
        }
        this.observers=observer;
        return observer;
    }
    
    
    @Override
    public void update(ISubject p, String Tipo) {
        this.notifyObservers(null);
    }
    
}
