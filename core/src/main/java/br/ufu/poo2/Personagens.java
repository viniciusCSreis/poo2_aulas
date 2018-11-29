/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufu.poo2;

import br.ufu.poo2.ChainOfResponsibility.Escudos;
import br.ufu.poo2.decorator.Armas;
import br.ufu.poo2.state.Normal;
import br.ufu.poo2.state.PersonagemState;
import br.ufu.poo2.strategies.Atacar;
import br.ufu.poo2.strategies.Correr;
import br.ufu.poo2.strategies.Pular;

/**
 *
 * @author vinic
 */
public abstract class Personagens {
    private Atacar atacar = null;
    private PersonagemState personagemState;
    private Pular pular = null;
    private Correr correr = null;
    private int x = 0;
    private int y = 0;
    private int life=100;
    private Armas arma = null;
    private Escudos escudo = null;
    private int lifeMinima=0;
    private String img;

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public PersonagemState getPersonagemState() {
        return personagemState;
    }

    public void setPersonagemState(PersonagemState personagemState) {
        this.personagemState = personagemState;
    }

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
        this.personagemState=new Normal(this);
    }
    
    public void setLife(int life)
    {
        this.life = life;
        this.personagemState.verificarAlteracaoEstado();
    }

    public int getLife() {
        return life;
    }
    
    public void removerLife(int damage)
    {
        this.life -= damage;
        this.personagemState.verificarAlteracaoEstado();
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
        int dano_real=atacar.atacar(dano);
        String tipo_ataque = atacar.getTipoAtaque();
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
