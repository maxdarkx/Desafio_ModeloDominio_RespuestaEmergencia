package com.juancarlosmaya.project_domain_llamadadeemergencia.llamada.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class tipoAeronave implements ValueObject <String>{
    private final String tipo;

    public tipoAeronave(String tipo) {
        this.tipo = Objects.requireNonNull(tipo);
    }

    @Override
    public String value() {
        return this.tipo;
    }
}
