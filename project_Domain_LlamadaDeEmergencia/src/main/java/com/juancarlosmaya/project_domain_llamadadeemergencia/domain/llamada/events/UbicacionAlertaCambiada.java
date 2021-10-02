package com.juancarlosmaya.project_domain_llamadadeemergencia.domain.llamada.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.juancarlosmaya.project_domain_llamadadeemergencia.domain.llamada.values.UbicacionAlerta;

public class UbicacionAlertaCambiada extends DomainEvent {
    private final UbicacionAlerta ubicacion;


    public UbicacionAlertaCambiada(UbicacionAlerta ubicacion) {
        super("com.juancarlosmaya.project_domain_llamadadeemergencia.domain.llamada.values.UbicacionAlerta");
        this.ubicacion = ubicacion;
    }

    public UbicacionAlerta getUbicacion() {
        return ubicacion;
    }
}
