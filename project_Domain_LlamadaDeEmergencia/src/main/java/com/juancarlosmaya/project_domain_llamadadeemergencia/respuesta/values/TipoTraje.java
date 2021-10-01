package com.juancarlosmaya.project_domain_llamadadeemergencia.respuesta.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TipoTraje implements ValueObject<String> {
    private final String tipoTraje;


    public TipoTraje(String tipoTraje) {
        switch (tipoTraje.toLowerCase()) {
            case ("aluminizado"):
            case ("general"):
            case ("forestal"):
                this.tipoTraje = Objects.requireNonNull(tipoTraje);
                break;
            default:
                throw (new IllegalArgumentException("Tipo de traje no reconocido"));
        }
    }

    @Override
    public String value() {
        return "El traje contraincendios es de tipo "+this.tipoTraje;
    }
}
