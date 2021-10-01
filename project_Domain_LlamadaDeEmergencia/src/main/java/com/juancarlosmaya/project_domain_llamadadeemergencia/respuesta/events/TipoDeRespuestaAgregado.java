package com.juancarlosmaya.project_domain_llamadadeemergencia.respuesta.events;

import co.com.sofka.domain.generic.DomainEvent;

import java.util.Objects;

public class TipoDeRespuestaAgregado extends DomainEvent {

    private final String tipo;
    public TipoDeRespuestaAgregado(String tipo) {
        super("com.juancarlosmaya.project_domain_llamadadeemergencia.respuesta.values.TipoRespuesta");
        if(tipo.length()>3)
            this.tipo =  Objects.requireNonNull(tipo);
        else
            throw (new IllegalArgumentException("El tipo de respuesta debe ser una palabra de mas de dos caracteres"));
    }

}
