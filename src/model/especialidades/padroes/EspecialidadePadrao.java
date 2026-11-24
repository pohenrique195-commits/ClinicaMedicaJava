package model.especialidades.padroes;

import model.enums.Planos;
import model.especialidades.Especialidade;

public class EspecialidadePadrao extends Especialidade {
    public EspecialidadePadrao(String nome){
        this.nome = nome;
        this.qtdAtendimentos = 3;
        this.planosAtendidos = Planos.values();
    }
}
