package model;

import java.util.UUID;

public class Prontuario {
    private String id;
    private Medico medico;
    private String sintomas;
    private String diagnostico;
    private String tratamento;
    private String medicamentos;
    private String exames;
    private String observacao;

    public Prontuario (Medico medico, String sintomas,String diagnostico, String tratamento,
                       String medicamentos,String exames, String observacao) {
        this.id=UUID.randomUUID().toString();
        this.medico = medico;
        this.sintomas = sintomas;
        this.diagnostico = diagnostico;
        this.tratamento = tratamento;
        this.medicamentos = medicamentos;
        this.exames = exames;
        this.observacao = observacao;
    }
}
