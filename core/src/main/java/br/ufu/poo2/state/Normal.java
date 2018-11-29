package br.ufu.poo2.state;

import br.ufu.poo2.Personagens;

public class Normal extends PersonagemState {

    public Normal(Personagens personagens){
        super(personagens);
    }

    @Override
    public void setLimite() {
        setLimiteInferior(30);
        setLimiteSuperior(70);
    }

    @Override
    public void verificarAlteracaoEstado() {

        if(this.getPersonagens().getLife() <= this.getLimiteInferior()){
            this.getPersonagens().setPersonagemState(new Perigo(this.getPersonagens()));
            this.getPersonagens().getPersonagemState().verificarAlteracaoEstado();
        }else if(this.getPersonagens().getLife() >= this.getLimiteSuperior()){
            this.getPersonagens().setPersonagemState(new Forte(this.getPersonagens()));
            this.getPersonagens().getPersonagemState().verificarAlteracaoEstado();
        }


    }

}
