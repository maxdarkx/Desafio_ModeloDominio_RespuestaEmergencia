package com.juancarlosmaya.project_domain_llamadadeemergencia.domain.respuesta.events;

import co.com.sofka.domain.generic.DomainEvent;

import java.util.Objects;

public class TipoDeRespuestaCambiado extends DomainEvent {
    private final String tipo;

    public TipoDeRespuestaCambiado(String tipo) {
        super("com.juancarlosmaya.project_domain_llamadadeemergencia.domain.respuesta.values.TipoRespuesta");
        if(tipo.length()>3)
            this.tipo =  Objects.requireNonNull(tipo);
        else
            throw (new IllegalArgumentException("El tipo de respuesta debe ser una palabra de mas de dos caracteres"));
    }

    public String getTipo() {
        return tipo;
    }
}
