package br.uece.clinica.model.planos;

public class Premium extends Plano {
    public Premium(){
        this.preco = 299;
    }
    @Override
    public String getNome() {
        return "Premium";
    }
}
