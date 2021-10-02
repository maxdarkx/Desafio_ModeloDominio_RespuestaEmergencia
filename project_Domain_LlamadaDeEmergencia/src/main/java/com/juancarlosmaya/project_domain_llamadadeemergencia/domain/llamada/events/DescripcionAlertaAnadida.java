package com.juancarlosmaya.project_domain_llamadadeemergencia.domain.llamada.events;

import co.com.sofka.domain.generic.DomainEvent;

public class DescripcionAlertaAnadida extends DomainEvent {

    private final String descripcion;

    public DescripcionAlertaAnadida(String descripcion) {

        super("com.juancarlosmaya.project_domain_llamadadeemergencia.domain.llamada.values.DescripcionAlerta");
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
