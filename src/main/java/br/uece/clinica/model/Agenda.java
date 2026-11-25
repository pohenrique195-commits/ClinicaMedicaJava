package br.uece.clinica.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Agenda {
    private String id;
    private Medico medico;
    private Date date;
    private List<Paciente> pacientes;
    private List<Consulta> consultas;

    public  Agenda(Paciente paciente, Medico medico, Date date) {
        this.id = UUID.randomUUID().toString();
        this.medico = medico;
        this.date = date;
        this.pacientes = new ArrayList<>();
        this.consultas = new ArrayList<>();
    }
}
