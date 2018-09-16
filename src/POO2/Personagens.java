/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO2;

/**
 *
 * @author vinic
 */
public abstract class Personagens {
    private Atacar atacar;
    private Pular pular;
    private Correr correr;
    private int x;
    private int y;
    private int life;
    private Armas arma;

    public Armas getArma() {
        return arma;
    }

    public void setArma(Armas arma) {
        this.arma = arma;
    }
    
    
    
    public Personagens(int x , int y , Armas arma )
    {
        this.x = x;
        this.y = y;
        this.arma= arma;
    }
    
    public void setLife(int life)
    {
        this.life = life;
    }

    public int getLife() {
        return life;
    }
    
    public void removerLife(int damage)
    {
        this.life -= damage;
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }        
    
    public void setAtacar(Atacar atacar) {
        this.atacar = atacar;
    }

    public void setPular(Pular pular) {
        this.pular = pular;
    }

    public void setCorrer(Correr correr) {
        this.correr = correr;
    }
    
    public void atacar(Personagens p)
    {
        int dano = this.arma.getDano();
        atacar.atacar(p,dano);
    }
    
    public void pular()
    {
        pular.pular();
    }
    
    public void correr()
    {
        correr.correr();
    }
}
