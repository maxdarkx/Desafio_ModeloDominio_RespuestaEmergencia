package com.juancarlosmaya.project_domain_llamadadeemergencia.llamada.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.juancarlosmaya.project_domain_llamadadeemergencia.llamada.values.TipoAlerta;

public class TipoAlertaAnadida extends DomainEvent {

    private final TipoAlerta tipo;

    public TipoAlertaAnadida(TipoAlerta tipo) {
        super("com.juancarlosmaya.project_domain_llamadadeemergencia.llamada.values.TipoAlerta");
        this.tipo = tipo;
    }

    public TipoAlerta getTipo() {
        return tipo;
    }
}
