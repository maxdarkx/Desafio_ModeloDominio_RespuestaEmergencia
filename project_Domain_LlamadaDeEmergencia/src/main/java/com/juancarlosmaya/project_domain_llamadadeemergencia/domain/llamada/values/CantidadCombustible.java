package com.juancarlosmaya.project_domain_llamadadeemergencia.domain.llamada.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class CantidadCombustible implements ValueObject<Integer> {
    private final int cantidad;

    public CantidadCombustible(int cantidad) {

        this.cantidad = Objects.requireNonNull(cantidad);
        if(this.cantidad <= 0)
            throw (new IllegalArgumentException("Debe reportar la cantidad de combustible aproximada"));
    }

    @Override
    public Integer value() {
        return this.cantidad;
    }
}
