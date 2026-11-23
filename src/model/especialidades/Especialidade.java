package model.especialidades;

import model.Medico;
import model.enums.Planos;

import java.util.ArrayList;

public class Especialidade extends Medico {


    public Especialidade(String nome, String CRM, ArrayList<Planos> planosAtendidos, float valorBase) {
        super(nome, CRM, planosAtendidos, valorBase);
    }
}
