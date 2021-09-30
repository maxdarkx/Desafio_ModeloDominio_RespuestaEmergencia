package com.juancarlosmaya.project_domain_llamadadeemergencia.respuesta.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class datosMaquina implements ValueObject<String> {
    private final String marca;
    private final String tipo;
    private final String motor;

    public datosMaquina(String marca, String tipo, String motor, String especialidad) {
        this.marca = Objects.requireNonNull(marca);
        this.tipo = Objects.requireNonNull(tipo);
        this.motor = Objects.requireNonNull(motor);
    }

    @Override
    public String value() {
        return "Maquina de marca "+ this.marca +" de tipo "+this.tipo +" con motor " +this.motor;
    }
}
