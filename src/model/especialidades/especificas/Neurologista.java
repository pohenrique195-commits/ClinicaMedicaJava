package model.especialidades.especificas;

import model.especialidades.Especialidade;
import model.planos.Plano;

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
