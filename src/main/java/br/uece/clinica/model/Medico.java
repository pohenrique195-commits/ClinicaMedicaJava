package br.uece.clinica.model;

import br.uece.clinica.model.enums.Planos;
import br.uece.clinica.model.especialidades.Especialidade;

import java.util.ArrayList;

public class Medico {

    private String nome;
    private String CRM;
    private ArrayList<Planos> planosAtendidos;
    private Especialidade especialidade;
    private float valorBase;
    private ArrayList<Avaliacao> avaliacoes;

    public Medico(String nome, String CRM, ArrayList<Planos> planosAtendidos, float valorBase){
        this.nome = nome;
        this.CRM = CRM;
        this.planosAtendidos = planosAtendidos;
        this.valorBase = valorBase;
    }
}
