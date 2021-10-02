package com.juancarlosmaya.project_domain_llamadadeemergencia.domain.respuesta.events;

import co.com.sofka.domain.generic.DomainEvent;

import java.util.Objects;

public class TiempoDeRespuestaCambiado extends DomainEvent {
    private final String tiempo;

    public TiempoDeRespuestaCambiado(String tiempo) {
        super("com.juancarlosmaya.project_domain_llamadadeemergencia.domain.respuesta.values.TiempoRespuesta");
        this.tiempo = Objects.requireNonNull(tiempo);
    }
}
