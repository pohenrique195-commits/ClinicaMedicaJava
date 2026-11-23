package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Paciente {

    private String nome;
    private LocalDate nascimento;
    private String cpf;
    private ArrayList<Consulta> consultas;
    private Plano plano;
    private ArrayList<Mensagem> mensagens;
    private ArrayList<Prontuario> historico;

    public Paciente(String nome, LocalDate nascimento, String cpf, Plano plano){
        this.nome = nome;
        this.nascimento = nascimento;
        this.cpf = cpf;
        this.plano = plano;
    }

}
