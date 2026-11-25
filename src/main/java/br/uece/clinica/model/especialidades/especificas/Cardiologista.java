package br.uece.clinica.model.especialidades.especificas;

import br.uece.clinica.model.especialidades.Especialidade;

public class Cardiologista implements Especialidade {
    public String getNome() { return "Cardiologista"; }

    @Override
    public int getLimiteDeConsultas(){
        return 2;
    }

}
