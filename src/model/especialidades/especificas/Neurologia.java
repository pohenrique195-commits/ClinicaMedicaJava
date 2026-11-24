package model.especialidades.especificas;

import model.enums.Planos;
import model.especialidades.Especialidade;

public class Neurologia extends Especialidade {
    public Neurologia(String nome){
        this.nome = nome;
        this.qtdAtendimentos = 2;
        Planos[] planosAtendidos = {Planos.NENHUM, Planos.PREMIUM};
    }
}
