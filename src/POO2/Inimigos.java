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
public abstract class Inimigos extends Personagens implements IObserver{

    public Inimigos(int x , int y)
    {
        super(x,y);
    }
            
    
    @Override
    public void update(Personagens p) {
        
        //se estiver em distancia de Atacar Personagem
        if(p.getX() == this.getX() && p.getY() == this.getY())
        {
            System.out.println("Inimigo Ataca :"+p);
            super.atacar(p);
            if (Math.random() < 0.5){
                p.setX(p.getX()+5);
                p.setY(p.getY()-5);
            }
            else {
                p.setX(p.getX()-5);
                p.setY(p.getY()+5);
            }
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
