package br.uece.clinica.model.planos;

public class Premium extends Plano {
    public Premium() { super("Premium", 299); }

    @Override
    public int getLimiteConsultas() { return Integer.MAX_VALUE; }
}
