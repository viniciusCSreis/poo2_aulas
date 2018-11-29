/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufu.poo2.observer.subjects;

import br.ufu.poo2.Personagens;
import br.ufu.poo2.decorator.Armas;
import br.ufu.poo2.observer.IObserver;
import br.ufu.poo2.observer.ISubject;
import br.ufu.poo2.strategies.concreteStrategies.atacar.AtaqueDeAr;
import br.ufu.poo2.strategies.concreteStrategies.correr.CorrerMedio;
import br.ufu.poo2.strategies.concreteStrategies.pular.PuloMedio;

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
        setLife(69);
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
