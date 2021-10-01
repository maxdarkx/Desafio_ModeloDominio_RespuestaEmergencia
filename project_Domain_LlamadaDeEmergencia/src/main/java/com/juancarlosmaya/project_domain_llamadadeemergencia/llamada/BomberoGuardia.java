package com.juancarlosmaya.project_domain_llamadadeemergencia.llamada;

import co.com.sofka.domain.generic.Entity;
import com.juancarlosmaya.project_domain_llamadadeemergencia.llamada.values.DatosPersonales;
import com.juancarlosmaya.project_domain_llamadadeemergencia.llamada.values.IdBombero;

import java.util.Objects;

public class BomberoGuardia extends Entity<IdBombero> {
    private DatosPersonales datosPersonales;

    public BomberoGuardia(IdBombero entityId, String nombre, String cedula, String licencia) {
        super(entityId);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(cedula);
        Objects.requireNonNull(licencia);

        this.datosPersonales = new DatosPersonales(nombre, cedula, licencia);
    }
    public void cambiarDatosPersonales(String nombre, String cedula, String licencia)
    {
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(cedula);
        Objects.requireNonNull(licencia);
        this.datosPersonales = new DatosPersonales(nombre, cedula, licencia);
    }
}
