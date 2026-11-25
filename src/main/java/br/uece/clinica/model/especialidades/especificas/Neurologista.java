package br.uece.clinica.model.especialidades.especificas;

import br.uece.clinica.model.especialidades.Especialidade;
import br.uece.clinica.model.planos.Plano;
import br.uece.clinica.model.planos.Premium;

import java.util.List;

public class Neurologista implements Especialidade {
    public String getNome() { return "Neurologista"; }

    @Override
    public List<Plano> getPlanosAtendido() {
        return List.of(new Premium());
    }
}
