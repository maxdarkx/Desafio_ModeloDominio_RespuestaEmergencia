package com.juancarlosmaya.project_domain_llamadadeemergencia.domain.respuesta.values;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generic.ValueObject;

import java.util.List;
import java.util.Objects;

public class TiempoRespuesta implements ValueObject <String>{
    private final String tiempo; //segundos

    public TiempoRespuesta(String tiempo) {
        Objects.requireNonNull(tiempo);
        if(Integer.parseInt(tiempo)>0)
            this.tiempo = tiempo;
        else
            throw (new IllegalArgumentException("El tiempo de respuesta debe ser mayor que cero"));
        if(this.tiempo.isBlank()){
            throw new IllegalArgumentException("El tiempo no puede estar vacio");
        }
    }

    public static void from(String tiempo, List<DomainEvent> retrieveEvents) {
    }

    @Override
    public String value() {
        return String.valueOf(this.tiempo);
    }
}
