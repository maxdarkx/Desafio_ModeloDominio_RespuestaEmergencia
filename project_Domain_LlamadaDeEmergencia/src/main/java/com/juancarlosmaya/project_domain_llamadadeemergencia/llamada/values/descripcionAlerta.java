package com.juancarlosmaya.project_domain_llamadadeemergencia.llamada.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class descripcionAlerta implements ValueObject {
    private final String ubicacion;

    public descripcionAlerta(String ubicacion) {
        this.ubicacion = Objects.requireNonNull(ubicacion);
    }

    @Override
    public Object value() {
        return this.ubicacion;
    }
}
