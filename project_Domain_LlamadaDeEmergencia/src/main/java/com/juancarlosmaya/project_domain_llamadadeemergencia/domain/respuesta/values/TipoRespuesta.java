package com.juancarlosmaya.project_domain_llamadadeemergencia.domain.respuesta.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TipoRespuesta implements ValueObject <String>{
    private final String tipo;

    public TipoRespuesta(String tipo) {
        if(tipo.isBlank()){
            throw new IllegalArgumentException("El tipo no puede estar vacio");
        }
        if(tipo.length()>3)
            this.tipo =  Objects.requireNonNull(tipo);
        else
            throw (new IllegalArgumentException("El tipo de respuesta debe ser una palabra de mas de dos caracteres"));
    }


    @Override
    public String value() {
        return this.tipo;
    }
}
