/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO2;

/**
 *
 * @author vinicius
 */
public abstract class Escudos {
    private Escudos sucessor;

    public void setSucessor(Escudos sucessor) {
        this.sucessor = sucessor;
    }

    public Escudos getSucessor() {
        return sucessor;
    }
    public abstract boolean defende(String tipo);
            
}
