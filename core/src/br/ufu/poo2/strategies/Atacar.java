/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufu.poo2.strategies;

/**
 *
 * @author vinic
 */
public abstract class Atacar {
    
    private String tipoAtaque;
    private int multiplicador=1;
    private float chanceDeAcerto;

    public void setChanceDeAcerto(float chanceDeAcerto) {
        this.chanceDeAcerto = chanceDeAcerto;
    }

    public int getMultiplicador() {
        return multiplicador;
    }
    
    
    public int atacar(int dano) {
        if(Math.random() < chanceDeAcerto)
            return dano*this.multiplicador;
        else
            return dano;
    }

    public void setMultiplicador(int multiplicador) {
        this.multiplicador = multiplicador;
    }
    
    
    
    public String getTipoAtaque() {
        return tipoAtaque;
    }

    public void setTipoAtaque(String tipoAtaque) {
        this.tipoAtaque = tipoAtaque;
    } 
}
