package br.ufu.poo2.state;

import br.ufu.poo2.Personagens;

public class Perigo extends PersonagemState{

    public Perigo(Personagens personagens) {
        super(personagens);
    }

    @Override
    public void setLimite() {
        setLimiteInferior(0);
        setLimiteSuperior(30);
    }

    @Override
    public void verificarAlteracaoEstado() {

        if(this.getPersonagens().getLife() <= this.getLimiteInferior()){
            this.getPersonagens().setPersonagemState(new Morto(this.getPersonagens()));
            this.getPersonagens().getPersonagemState().verificarAlteracaoEstado();
        }else if(this.getPersonagens().getLife() >= this.getLimiteSuperior()){
            this.getPersonagens().setPersonagemState(new Normal(this.getPersonagens()));
            this.getPersonagens().getPersonagemState().verificarAlteracaoEstado();
        }

    }
}
