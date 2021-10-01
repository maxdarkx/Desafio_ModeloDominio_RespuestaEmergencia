package com.juancarlosmaya.project_domain_llamadadeemergencia.respuesta.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.juancarlosmaya.project_domain_llamadadeemergencia.respuesta.values.TiempoRespuesta;

import java.util.Objects;

public class TiempoDeRespuestaCambiado extends DomainEvent {
    private final String tiempo;

    public TiempoDeRespuestaCambiado(String tiempo) {
        super("com.juancarlosmaya.project_domain_llamadadeemergencia.respuesta.values.TiempoRespuesta");
        this.tiempo = Objects.requireNonNull(tiempo);
    }
}
