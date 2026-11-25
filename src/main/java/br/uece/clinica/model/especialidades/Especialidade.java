package br.uece.clinica.model.especialidades;

import br.uece.clinica.model.planos.Plano;

public interface Especialidade {
    String getNome();
    default int getLimiteDeConsultas() {
        return 3;
    }
    default boolean aceitaPlano(Plano plano){
        return true;
    }
}