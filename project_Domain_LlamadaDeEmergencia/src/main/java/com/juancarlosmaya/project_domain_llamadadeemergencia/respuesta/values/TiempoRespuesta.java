package com.juancarlosmaya.project_domain_llamadadeemergencia.respuesta.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TiempoRespuesta implements ValueObject <String>{
    private final int tiempo; //segundos


    public TiempoRespuesta(int tiempo) {
        this.tiempo =  Objects.requireNonNull(tiempo);
    }

    @Override
    public String value() {
        return String.valueOf(this.tiempo);
    }
}