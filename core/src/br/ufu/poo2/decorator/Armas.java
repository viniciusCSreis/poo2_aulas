/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufu.poo2.decorator;

/**
 *
 * @author vinicius
 */
public abstract class Armas {
    private int dano;
    private int porder;

    public int getDano() {
        return dano;
    }

    public int getPoder() {
        return porder;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public void setPorder(int porder) {
        this.porder = porder;
    }
    
    
}
