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
public interface IObserver {
    //Update tem que receber Personagens pq se receber Subject como consegiarmos atacar um Subject ?
    public void update(ISubject p,String Tipo);
}
