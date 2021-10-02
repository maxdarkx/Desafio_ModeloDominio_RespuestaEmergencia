package com.juancarlosmaya.project_domain_llamadadeemergencia.domain.llamada.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class DescripcionAlerta implements ValueObject {
    private final String ubicacion;

    public DescripcionAlerta(String ubicacion) {
        this.ubicacion = Objects.requireNonNull(ubicacion);
    }

    @Override
    public Object value() {
        return this.ubicacion;
    }
}
