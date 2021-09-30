package com.juancarlosmaya.project_domain_llamadadeemergencia.respuesta.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class tipoRespuesta implements ValueObject <String>{
    private final String tipo;

    public tipoRespuesta(String tipo) {
        this.tipo =  Objects.requireNonNull(tipo);
    }

    @Override
    public String value() {
        return this.tipo;
    }
}
