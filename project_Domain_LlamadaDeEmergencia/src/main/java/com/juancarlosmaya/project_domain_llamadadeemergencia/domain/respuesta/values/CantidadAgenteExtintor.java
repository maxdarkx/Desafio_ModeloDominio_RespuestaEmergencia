package com.juancarlosmaya.project_domain_llamadadeemergencia.domain.respuesta.values;
import co.com.sofka.domain.generic.ValueObject;


public class CantidadAgenteExtintor implements ValueObject <String> {
    private final int cantidadAgua;
    private final int cantidadEspuma;
    private final int cantidadPQS;

    public CantidadAgenteExtintor(int cantidadAgua, int cantidadEspuma, int cantidadPolvoQuimico) {
        this.cantidadAgua = cantidadAgua;
        this.cantidadEspuma = cantidadEspuma;
        this.cantidadPQS = cantidadPolvoQuimico;
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
        return "Recursos:{" +
                "Cantidad de agua= " + this.cantidadAgua +
                "Cantidad de Espuma= " + this.cantidadEspuma +
                "Cantidad de PQS= " + this.cantidadPQS;
    }



}
