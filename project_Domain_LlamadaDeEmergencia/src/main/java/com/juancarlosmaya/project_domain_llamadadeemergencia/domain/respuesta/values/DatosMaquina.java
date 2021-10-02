package com.juancarlosmaya.project_domain_llamadadeemergencia.domain.respuesta.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class DatosMaquina implements ValueObject<String> {
    private final String marca;
    private final String tipo;
    private final String motor;


    public DatosMaquina(String marca, String tipo, String motor) {

        this.marca = Objects.requireNonNull(marca);
        this.tipo = Objects.requireNonNull(tipo);
        this.motor = Objects.requireNonNull(motor);
        if(this.marca.isBlank()){
            throw new IllegalArgumentException("La marca no puede estar vacia");
        }
        if(this.tipo.isBlank()){
            throw new IllegalArgumentException("El tipo no puede estar vacio");
        }
        if(this.motor.isBlank()){
            throw new IllegalArgumentException("El motor no puede estar vacio");
        }
    }

    @Override
    public String value() {
        return "Maquina de marca "+ this.marca +" de tipo "+this.tipo +" con motor " +this.motor;
    }
}
