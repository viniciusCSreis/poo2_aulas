/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufu.poo2.observer;

/**
 *
 * @author vinicius
 */
public interface ISubject {
    public void registerObserver(IObserver observer);
    public void removeObserver(IObserver observer);
    public void notifyObservers(String msg);
}
