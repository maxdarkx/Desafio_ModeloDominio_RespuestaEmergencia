package com.juancarlosmaya.project_domain_llamadadeemergencia.domain.llamada.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.juancarlosmaya.project_domain_llamadadeemergencia.domain.llamada.values.TipoAlerta;

public class TipoAlertaActualizada extends DomainEvent {
    private final TipoAlerta tipo;

    public TipoAlertaActualizada(TipoAlerta tipoAlerta) {
        super("com.juancarlosmaya.project_domain_llamadadeemergencia.domain.llamada.values.TipoAlerta");
        this.tipo = tipoAlerta;
    }

    public TipoAlerta getTipo() {
        return tipo;
    }
}
