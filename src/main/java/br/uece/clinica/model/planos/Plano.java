package br.uece.clinica.model.planos;

public abstract class Plano {
    private final String nome;
    private final double preco;

    protected Plano(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() { return nome; }
    public double getPreco() { return preco; }

    public abstract int getLimiteConsultas();
}