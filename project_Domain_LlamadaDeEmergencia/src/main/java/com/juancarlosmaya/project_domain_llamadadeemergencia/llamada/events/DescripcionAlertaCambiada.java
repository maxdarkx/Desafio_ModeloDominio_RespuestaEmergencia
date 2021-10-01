package com.juancarlosmaya.project_domain_llamadadeemergencia.llamada.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.juancarlosmaya.project_domain_llamadadeemergencia.llamada.values.DescripcionAlerta;

public class DescripcionAlertaCambiada extends DomainEvent {
    private final DescripcionAlerta descripcionAlerta;

    public DescripcionAlertaCambiada(DescripcionAlerta descripcion) {
        super("com.juancarlosmaya.project_domain_llamadadeemergencia.llamada.values.DescripcionAlerta");
        this.descripcionAlerta = descripcion;
    }

    public DescripcionAlerta getDescripcionAlerta() {
        return descripcionAlerta;
    }
}
