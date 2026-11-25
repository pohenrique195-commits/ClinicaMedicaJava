package br.uece.clinica.model.planos;

public class Standart extends Plano {

    public Standart(){
        this.preco = 67;
        this.qtdConsultas = 3;
    }
    @Override
    public String getNome(){
        return "Standart";
    }
}
