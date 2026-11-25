package br.uece.clinica.model;

import br.uece.clinica.model.enums.StatusConsulta;
import java.util.ArrayList;
import java.util.UUID;

public class Consulta {
    private String id;
    private String turno;
    private Medico medico;
    private Paciente paciente;
    private StatusConsulta estado;
    private Conta pagamento;
    private boolean usaPlano;
    private Prontuario prontuario;
    private ArrayList<Paciente> listaDeEspera;


    public Consulta(String turno, Medico medico, Paciente paciente, boolean usaPlano) {
        this.id = UUID.randomUUID().toString();
        this.turno = turno;
        this.medico = medico;
        this.paciente = paciente;
        this.usaPlano = usaPlano;
        this.estado = StatusConsulta.AGENDADO;
        this.listaDeEspera = new ArrayList<>();
    }
}