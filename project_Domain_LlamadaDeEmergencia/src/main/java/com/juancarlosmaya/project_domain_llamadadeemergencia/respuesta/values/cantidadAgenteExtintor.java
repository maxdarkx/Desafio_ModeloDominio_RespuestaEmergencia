package com.juancarlosmaya.project_domain_llamadadeemergencia.respuesta.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class cantidadAgenteExtintor implements ValueObject <Integer> {
    private final int cantidadAgente;

    public cantidadAgenteExtintor(int cantidadAgente) {
        this.cantidadAgente = Objects.requireNonNull(cantidadAgente);
    }

    @Override
    public Integer value() {
        return this.cantidadAgente;
    }
}
