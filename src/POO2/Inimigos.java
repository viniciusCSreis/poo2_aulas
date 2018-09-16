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

    public Inimigos(int x , int y,Armas arma)
    {
        super(x,y,arma);
    }
            
    
    @Override
    public void update(Personagens p) {
        int poder = super.getArma().getPoder();
        //se estiver em distancia de Atacar Personagem
        if(p.getX() == this.getX() && p.getY() == this.getY())
        {
            System.out.println("Inimigo Ataca :"+p);
            super.atacar(p);
            if (Math.random() < 0.5){
                p.setX(p.getX()+ poder);
                p.setY(p.getY()- poder);
            }
            else {
                p.setX(p.getX()- poder);
                p.setY(p.getY()+ poder);
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
