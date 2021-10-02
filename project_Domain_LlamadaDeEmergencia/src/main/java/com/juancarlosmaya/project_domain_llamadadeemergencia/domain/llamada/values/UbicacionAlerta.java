package com.juancarlosmaya.project_domain_llamadadeemergencia.domain.llamada.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class UbicacionAlerta implements ValueObject<String> {
    private final String ubicacion;

    public UbicacionAlerta(String ubicacion) {
        this.ubicacion = Objects.requireNonNull(ubicacion);
        if(ubicacion.length()< 2)
            throw (new IllegalArgumentException("Debe introducir un lugar de mas de una letra"));
    }


    @Override
    public String value() {
        return this.ubicacion;
    }
}
