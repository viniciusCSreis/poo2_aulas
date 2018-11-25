package br.ufu.poo2.decorator.concreteComponent;

import br.ufu.poo2.decorator.Armas;

public class RaioParalisante extends Armas {
    public RaioParalisante() {
        super.setDano(1000);
        super.setPorder(1000);
    }
}
