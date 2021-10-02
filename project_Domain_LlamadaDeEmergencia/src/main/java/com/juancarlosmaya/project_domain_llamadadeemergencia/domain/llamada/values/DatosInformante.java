package com.juancarlosmaya.project_domain_llamadadeemergencia.domain.llamada.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class DatosInformante implements ValueObject<String> {
    private final String nombre;
    private final String tipo;

    public DatosInformante(String nombre, String tipo) {
        this.nombre = Objects.requireNonNull(nombre);
        this.tipo = Objects.requireNonNull(tipo);
    }

    @Override
    public String value() {
        return "El informante de la alerta fue " + this.nombre + " de tipo " + this.tipo;
    }
}

