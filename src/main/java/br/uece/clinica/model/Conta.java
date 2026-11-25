package br.uece.clinica.model;

import br.uece.clinica.model.enums.StatusPagamento;
import java.util.UUID;

public class Conta {

    private String id;
    private float valor;
    private StatusPagamento status;
    private Paciente paciente;
    private Consulta consulta;

    public Conta (float valor, Paciente paciente, Consulta consulta) {
        this.id = UUID.randomUUID().toString();
        this.valor = valor;
        this.status = StatusPagamento.PENDENENTE;
        this.paciente = paciente;
        this.consulta = consulta;
    }
}
