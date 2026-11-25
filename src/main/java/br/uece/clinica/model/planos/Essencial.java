package br.uece.clinica.model.planos;

public class Essencial extends Plano {
    public Essencial(){
        this.preco = 114;
        this.qtdConsultas = 5;
    }
    @Override
    public String getNome() {
        return "Essencial";
    }
}
