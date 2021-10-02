package com.juancarlosmaya.project_domain_llamadadeemergencia.domain.llamada.events;

import co.com.sofka.domain.generic.DomainEvent;

public class UbicacionAlertaAnadida extends DomainEvent {
    private final String ubicacion;

    public UbicacionAlertaAnadida(String ubicacion) {
        super("com.juancarlosmaya.project_domain_llamadadeemergencia.domain.llamada.values.UbicacionAlerta");
        this.ubicacion = ubicacion;
    }

    public String getUbicacion() {
        return ubicacion;
    }
}
