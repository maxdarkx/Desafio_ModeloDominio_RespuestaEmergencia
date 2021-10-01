package com.juancarlosmaya.project_domain_llamadadeemergencia.llamada.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class UbicacionAlerta implements ValueObject<String> {
    private final String ubicacion;

    public UbicacionAlerta(String ubicacion) {
        this.ubicacion = Objects.requireNonNull(ubicacion);
    }


    @Override
    public String value() {
        return this.ubicacion;
    }
}
