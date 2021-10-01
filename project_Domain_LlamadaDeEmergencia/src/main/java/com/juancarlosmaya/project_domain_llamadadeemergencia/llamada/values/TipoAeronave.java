package com.juancarlosmaya.project_domain_llamadadeemergencia.llamada.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TipoAeronave implements ValueObject <String>{
    private final String tipo;

    public TipoAeronave(String tipo) {
        this.tipo = Objects.requireNonNull(tipo);
    }

    @Override
    public String value() {
        return this.tipo;
    }
}
