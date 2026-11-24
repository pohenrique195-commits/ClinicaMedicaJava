package model.especialidades.especificas;

import model.especialidades.Especialidade;
import model.planos.Plano;

public class Cardiologista implements Especialidade {
    public String getNome() { return "Cardiologista"; }

    @Override
    public int getLimiteDeConsultas(){
        return 2;
    }

}
