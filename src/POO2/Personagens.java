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
    private Atacar atacar = null;
    private Pular pular = null;
    private Correr correr = null;
    private int x = 0;
    private int y = 0;
    private int life=100;
    private Armas arma = null;
    private Escudos escudo = null;
    private int lifeMinima=0;

    public void setEscudo(Escudos escudo) {
        this.escudo = escudo;
    }   
    public String getAtacarType()
    {
        return this.atacar.getTipoAtaque();
    }
    public boolean isAlife()
    {
        if(this.life > lifeMinima)
            return true;
        return false;
    }

    public Armas getArma() {
        return arma;
    }

    public void setArma(Armas arma) {
        this.arma = arma;
    }

    public Escudos getEscudo() {
        return escudo;
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
         if(!this.isAlife())
             return;
        int dano = this.arma.getDano();
        System.out.println("Dano:"+dano);
        int dano_real=atacar.atacar(dano);
        System.out.println("Dano_Real:"+dano_real);
        String tipo_ataque = atacar.getTipoAtaque();
        System.out.println("Tipo_ataque"+tipo_ataque);
        boolean defendeu=false;
        if(p.getEscudo()!= null)
            defendeu=p.getEscudo().defende(tipo_ataque);
        if(!defendeu)p.removerLife(dano_real);


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
