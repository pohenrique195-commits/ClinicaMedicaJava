package br.uece.clinica.model;

import br.uece.clinica.model.Medico;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

public class Mensagem {

    private String texto;
    private String ID;
    private LocalDate data;
    private LocalTime hora;
    private Medico remetente;

    private Mensagem(Medico remetente, String texto) {
        this.ID = UUID.randomUUID().toString();
        this.remetente = remetente;
        this.texto = texto;
        this.data = LocalDate.now();
        this.hora = LocalTime.now();
    }

}


