package com.juancarlosmaya.project_domain_llamadadeemergencia.respuesta.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TiempoRespuesta implements ValueObject <String>{
    private final String tiempo; //segundos

    public TiempoRespuesta(String tiempo) {
        Objects.requireNonNull(tiempo);
        if(Integer.parseInt(tiempo)>0)
            this.tiempo = tiempo;
        else
            throw (new IllegalArgumentException("El tiempo de respuesta debe ser mayor que cero"));
    }

    @Override
    public String value() {
        return String.valueOf(this.tiempo);
    }
}
