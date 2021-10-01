package com.juancarlosmaya.project_domain_llamadadeemergencia.respuesta.events;

import co.com.sofka.domain.generic.DomainEvent;

import java.util.Objects;

public class TiempoDeRespuestaAgregado extends DomainEvent {
    private final int tiempo;
    public TiempoDeRespuestaAgregado(String tiempo) {
        super("com.juancarlosmaya.project_domain_llamadadeemergencia.respuesta.values.TiempoRespuesta");
        Objects.requireNonNull(tiempo);
        this.tiempo = Integer.parseInt(tiempo);
    }

    public int getTiempo() {
        return tiempo;
    }
}
