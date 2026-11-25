package br.uece.clinica.model;

import java.util.UUID;

public class Avaliacao {
    private String id;
    private int nota;
    private String descricao;

    public Avaliacao(int nota, String descricao){
        this.id =  UUID.randomUUID().toString();
        this.nota = nota;
        this.descricao = descricao;
    }

}
