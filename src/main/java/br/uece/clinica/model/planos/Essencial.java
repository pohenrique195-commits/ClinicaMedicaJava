package br.uece.clinica.model.planos;

public class Essencial extends Plano {
    public Essencial() { super("Essencial", 114); }

    @Override
    public int getLimiteConsultas() { return 5; }
}
