package br.uece.clinica.model.especialidades.especificas;

import br.uece.clinica.model.especialidades.Especialidade;
import br.uece.clinica.model.planos.Plano;

public class Neurologista implements Especialidade {
    public String getNome() { return "Neurologista"; }

    @Override
    public boolean aceitaPlano(Plano plano) {
        if (plano.getNome() == "Premium") {
            return true;
        }
        return false;
    }
}
