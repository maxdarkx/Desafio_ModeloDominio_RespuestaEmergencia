package com.juancarlosmaya.project_domain_llamadadeemergencia.llamada;

import co.com.sofka.domain.generic.Entity;
import com.juancarlosmaya.project_domain_llamadadeemergencia.llamada.values.CantidadCombustible;
import com.juancarlosmaya.project_domain_llamadadeemergencia.llamada.values.CantidadPasajeros;
import com.juancarlosmaya.project_domain_llamadadeemergencia.llamada.values.IdAeronave;
import com.juancarlosmaya.project_domain_llamadadeemergencia.llamada.values.TipoAeronave;

import java.util.Objects;

public class Aeronave extends Entity <IdAeronave> {

    private TipoAeronave tipoAeronave;
    private CantidadPasajeros cantidadPasajeros;
    private CantidadCombustible cantidadCombustible;


    public Aeronave(IdAeronave entityId, TipoAeronave tipoAeronave, CantidadPasajeros cantidadPasajeros, CantidadCombustible cantidadCombustible) {
        super(entityId);
        this.tipoAeronave = tipoAeronave;
        this.cantidadPasajeros = cantidadPasajeros;
        this.cantidadCombustible = cantidadCombustible;
    }

    public void cambiarTipoAeronave(TipoAeronave tipo) {
        this.tipoAeronave = Objects.requireNonNull(tipo);
    }

    public void cambiarCantidadCombustible(CantidadCombustible cantidad)
    {
        this.cantidadCombustible = Objects.requireNonNull(cantidad);
        if (cantidad.value()<=0)
            throw (new IllegalArgumentException("Debe agregar la cantidad de combustible de la aeronave"));
    }

    public TipoAeronave TipoAeronave() {
        return tipoAeronave;
    }

    public CantidadPasajeros CantidadPasajeros() {
        return cantidadPasajeros;
    }

    public CantidadCombustible CantidadCombustible() {
        return cantidadCombustible;
    }
}