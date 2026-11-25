package br.uece.clinica.model.planos;

public class Standard extends Plano {

    public Standard() { super("Standard", 67); }

    @Override
    public int getLimiteConsultas() { return 3; }
}
