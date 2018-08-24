/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapraticapadraostrategy;

/**
 *
 * @author vinic
 */
public abstract class Personagens {
    private Atacar atacar;
    private Pular pular;
    private Correr correr;

    public void setAtacar(Atacar atacar) {
        this.atacar = atacar;
    }

    public void setPular(Pular pular) {
        this.pular = pular;
    }

    public void setCorrer(Correr correr) {
        this.correr = correr;
    }
    
    public void atacar()
    {
        atacar.atacar();
    }
    
    public void pular()
    {
        pular.pular();
    }
    
    public void correr()
    {
        correr.correr();
    }
    public void test()
    {
        
        pular();
        correr();
        atacar();
    }
}
