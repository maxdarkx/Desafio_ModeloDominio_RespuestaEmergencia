package com.juancarlosmaya.project_domain_llamadadeemergencia.respuesta.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class recursos implements ValueObject<String> {
    private final int cantidadAgua;
    private final int cantidadEspuma;
    private final int cantidadPolvoQuimico;
    private final List<String> herramientaEspecial;

    public recursos(int cantidadAgua, int cantidadEspuma, int cantidadPolvoQuimico, List<String> herramientaEspecial) {
        this.cantidadAgua = Objects.requireNonNull(cantidadAgua);
        this.cantidadEspuma = Objects.requireNonNull(cantidadEspuma);
        this.cantidadPolvoQuimico = Objects.requireNonNull(cantidadPolvoQuimico);
        this.herramientaEspecial = Objects.requireNonNull(herramientaEspecial);
    }

    @Override
    public String value() {
        return  "Recursos:{" +
                        "Cantidad de agua= " + this.cantidadAgua +
                        "Cantidad de Espuma= "+this.cantidadEspuma +
                        "Cantidad de PQS= "+ this.cantidadPolvoQuimico+
                        "Herramientas Especiales= "+this.herramientaEspecial.stream().map(Object::toString).collect(Collectors.joining(", "));

        }

    }

