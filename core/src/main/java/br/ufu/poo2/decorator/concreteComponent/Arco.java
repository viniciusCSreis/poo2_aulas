/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufu.poo2.decorator.concreteComponent;

import br.ufu.poo2.decorator.Armas;

/**
 *
 * @author vinicius
 */
public class Arco extends Armas {
    public Arco()
    {
        setDano(3);
        setPorder(5);
    }
}
