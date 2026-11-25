package br.uece.clinica.model.especialidades;

import br.uece.clinica.model.planos.Essencial;
import br.uece.clinica.model.planos.Plano;
import br.uece.clinica.model.planos.Premium;
import br.uece.clinica.model.planos.Standart;

import java.util.ArrayList;
import java.util.List;

public interface Especialidade {
    String getNome();
    default int getLimiteDeConsultas() {
        return 3;
    }
    default List<Plano> getplanosAtendidos(){
        return List.of(new Standart(), new Premium(), new Essencial());
    }

    List<Plano> getPlanosAtendido();
}