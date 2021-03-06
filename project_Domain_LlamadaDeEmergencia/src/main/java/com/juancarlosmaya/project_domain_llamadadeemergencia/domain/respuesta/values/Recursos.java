package com.juancarlosmaya.project_domain_llamadadeemergencia.domain.respuesta.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Recursos implements ValueObject<String> {
    private final int cantidadAgua;
    private final int cantidadEspuma;
    private final int cantidadPolvoQuimico;


    public Recursos(int cantidadAgua, int cantidadEspuma, int cantidadPolvoQuimico) {
        this.cantidadAgua = cantidadAgua;
        this.cantidadEspuma = cantidadEspuma;
        this.cantidadPolvoQuimico = cantidadPolvoQuimico;


        chequearCantidad(cantidadAgua);
        chequearCantidad(cantidadEspuma);
        chequearCantidad(cantidadPolvoQuimico);
    }

    private void chequearCantidad(int cantidad) {
        if(cantidad <= 0)
            throw(new IllegalArgumentException("Debe agregar una cantidad valida de agente extintor"));
    }


    @Override
    public String value() {
        return  "Recursos:{" +
                        "Cantidad de agua= " + this.cantidadAgua +
                        ", Cantidad de Espuma= "+this.cantidadEspuma +
                        ", Cantidad de PQS= "+ this.cantidadPolvoQuimico;
        }

    }

