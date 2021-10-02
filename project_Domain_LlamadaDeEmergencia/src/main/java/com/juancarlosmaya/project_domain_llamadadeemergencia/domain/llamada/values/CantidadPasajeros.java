package com.juancarlosmaya.project_domain_llamadadeemergencia.domain.llamada.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class CantidadPasajeros implements ValueObject <Integer> {
    private final int cantidad;

    public CantidadPasajeros(int cantidad) {
        this.cantidad = Objects.requireNonNull(cantidad);

        if(this.cantidad<=0)
            throw(new IllegalArgumentException("La aeronave debe tener pasajeros"));
    }

    @Override
    public Integer value() {
        return this.cantidad;
    }
}
