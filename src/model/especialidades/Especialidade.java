package model.especialidades;

import model.planos.Plano;

public interface Especialidade {
    String getNome();
    default int getLimiteDeConsultas() {
        return 3;
    }
    default boolean aceitaPlano(Plano plano){
        return true;
    }
}