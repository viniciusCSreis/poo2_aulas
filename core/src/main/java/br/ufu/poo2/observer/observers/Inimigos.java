/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufu.poo2.observer.observers;


import br.ufu.poo2.observer.subjects.PersonagemPrincipal;
import br.ufu.poo2.Personagens;
import br.ufu.poo2.decorator.Armas;
import br.ufu.poo2.observer.IObserver;
import br.ufu.poo2.observer.ISubject;

/**
 *
 * @author vinicius
 */
public abstract class Inimigos extends Personagens implements IObserver {

    public Inimigos(int x , int y, Armas arma)
    {
        super(x,y,arma);
    }
            
    
    @Override
    public void update(ISubject subject, String tipo) {
        
        PersonagemPrincipal p = (PersonagemPrincipal)subject;
        
        int distanciaX= p.getX() - this.getX();
        if(distanciaX<0)
            distanciaX*=-1;
        int distanciaY= p.getY() - this.getY();
        if(distanciaY<0)
            distanciaY*=-1;
        if(!this.isAlife())
           return;
        if(tipo != null)
        {
            
  
            
           if(distanciaX < 50 && distanciaY < 50){
               p.atacar(this);
           }
        }
         
        
        
        //se estiver em distancia de Atacar Personagem
        if(distanciaX <= 20  && distanciaY <= 20 )
        {
            super.atacar(p);
           
        }
        //se precisar andar em direcao ao Personagem
        else
        {
            //se precisa andar para frente 
            if (p.getX() > this.getX()) {
                this.setX(this.getX() + 1);
            } else {
                this.setX(this.getX() - 1);
            }
            //se precisa andar para tras
            if (p.getY() > this.getY()) {
                this.setY(this.getY() + 1 );
            } else {
                this.setY(this.getY() + -1 );
            }
        }
    }
}
