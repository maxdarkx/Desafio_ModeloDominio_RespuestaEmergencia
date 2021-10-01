package com.juancarlosmaya.project_domain_llamadadeemergencia.respuesta;

import co.com.sofka.domain.generic.Entity;
import com.juancarlosmaya.project_domain_llamadadeemergencia.respuesta.values.CantidadAgenteExtintor;
import com.juancarlosmaya.project_domain_llamadadeemergencia.respuesta.values.DatosMaquina;
import com.juancarlosmaya.project_domain_llamadadeemergencia.respuesta.values.IdMaquina;

import java.util.Objects;

public class Maquina extends Entity<IdMaquina> {
    CantidadAgenteExtintor cantidad;
    DatosMaquina datos;

    public Maquina(IdMaquina entityId, int cantidadAgua, int cantidadEspuma, int cantidadPolvoQuimico, String marca, String tipo, String motor) {
        super(entityId);
        this.cantidad = new CantidadAgenteExtintor(cantidadAgua, cantidadEspuma, cantidadPolvoQuimico);
        Objects.requireNonNull(marca);
        Objects.requireNonNull(tipo);
        Objects.requireNonNull(motor);
        this.datos = new DatosMaquina(marca, tipo, motor);
    }

    public void cambiarAgenteExtintor(int cantidadAgua, int cantidadEspuma, int cantidadPolvoQuimico)
    {
        this.cantidad = new CantidadAgenteExtintor(cantidadAgua, cantidadEspuma,cantidadPolvoQuimico);
    }

    public void cambiarDatosMaquina(String marca, String tipo, String motor)
    {
        Objects.requireNonNull(marca);
        Objects.requireNonNull(tipo);
        Objects.requireNonNull(motor);
        this.datos = new DatosMaquina(marca, tipo, motor);
    }

    public CantidadAgenteExtintor getCantidad() {
        return cantidad;
    }

    public DatosMaquina getDatos() {
        return datos;
    }
}
