package model.especialidades.especificas;

import model.enums.Planos;
import model.especialidades.Especialidade;

public class Cardiologia extends Especialidade {
    public Cardiologia(String nome){
        this.nome = nome;
        this.qtdAtendimentos = 3;
        Planos[] planosAtendidos = {Planos.NENHUM, Planos.PREMIUM, Planos.ESSENCIAL};
    }

}
