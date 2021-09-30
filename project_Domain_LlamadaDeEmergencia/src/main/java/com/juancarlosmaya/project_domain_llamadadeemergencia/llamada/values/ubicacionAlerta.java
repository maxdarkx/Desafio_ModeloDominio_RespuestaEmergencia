package com.juancarlosmaya.project_domain_llamadadeemergencia.llamada.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class ubicacionAlerta implements ValueObject<String> {
    private final String ubicacion;

    public ubicacionAlerta(String ubicacion) {
        this.ubicacion = Objects.requireNonNull(ubicacion);
    }


    @Override
    public String value() {
        return this.ubicacion;
    }
}
