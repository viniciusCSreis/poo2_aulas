/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO2.observer.subjects;

import POO2.observer.IObserver;
import POO2.observer.ISubject;

import java.util.ArrayList;

/**
 *
 * @author vinicius
 */
public class ContadorDoRelogio implements ISubject {
    ArrayList<IObserver> observers = new ArrayList<IObserver>();
    private int fps=30;
    private boolean ativo=true;
    private int contador=0;

    public void relogioLoop() throws InterruptedException
    {
        
        while(ativo)
        {
            notifyObservers(String.valueOf(contador));
            Thread.sleep(50);
            contador+=50;
        }
        
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
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
        for(IObserver obs:this.observers)
        {
            
            
            obs.update(this, msg);
        }
    }
    
}
