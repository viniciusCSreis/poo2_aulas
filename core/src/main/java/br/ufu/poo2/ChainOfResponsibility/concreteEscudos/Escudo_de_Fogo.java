/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufu.poo2.ChainOfResponsibility.concreteEscudos;

import br.ufu.poo2.ChainOfResponsibility.Escudos;

/**
 *
 * @author vinicius
 */
public class Escudo_de_Fogo extends Escudos {

    @Override
    public boolean defende(String tipo) {
        if (tipo.equals("Fogo"))
        {
            return true;
        }
        if(getSucessor() != null)
        {
            return getSucessor().defende(tipo);
        }
        else
            return false;
    }
    
}
