package br.ufu.poo2.ChainOfResponsibility.concreteEscudos;

import br.ufu.poo2.ChainOfResponsibility.Escudos;

public class CampoMagnetico extends Escudos {
    @Override
    public boolean defende(String tipo) {
        if (tipo.equals("Magnetico"))
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
