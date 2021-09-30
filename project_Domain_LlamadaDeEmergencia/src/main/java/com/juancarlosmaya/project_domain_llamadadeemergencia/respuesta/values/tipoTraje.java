package com.juancarlosmaya.project_domain_llamadadeemergencia.respuesta.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class tipoTraje implements ValueObject<String> {
    private final String tipoTraje;


    public tipoTraje(String tipoTraje) {
        if(tipoTraje == "Aluminizado" || tipoTraje == "Incendios") {
            this.tipoTraje = Objects.requireNonNull(tipoTraje);
        }
        throw new IllegalArgumentException("Tipo de traje no reconocido");
    }

    @Override
    public String value() {
        return null;
    }
}
