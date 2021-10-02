package com.juancarlosmaya.project_domain_llamadadeemergencia.domain.respuesta;

import co.com.sofka.domain.generic.Entity;
import com.juancarlosmaya.project_domain_llamadadeemergencia.domain.llamada.values.DatosPersonales;
import com.juancarlosmaya.project_domain_llamadadeemergencia.domain.llamada.values.IdBombero;
import com.juancarlosmaya.project_domain_llamadadeemergencia.domain.respuesta.values.TipoTraje;

import java.util.Objects;

public class Bombero extends Entity {
    private DatosPersonales datosPersonales;
    private TipoTraje tipoTraje;

    public Bombero(IdBombero Id, String nombre, String cedula, String licencia, String tipoTraje) {
        super(Id);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(cedula);
        Objects.requireNonNull(licencia);
        Objects.requireNonNull(tipoTraje);
        this.datosPersonales = new DatosPersonales(nombre, cedula, licencia);
        this.tipoTraje = new TipoTraje(tipoTraje);
    }
    public Bombero(Bombero bombero) {
        super(bombero.entityId);
        this.datosPersonales = bombero.datosPersonales;
        this.tipoTraje = bombero.tipoTraje;
    }


    public void cambiarDatosPersonales(String nombre, String cedula, String licencia)
    {
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(cedula);
        Objects.requireNonNull(licencia);
        this.datosPersonales = new DatosPersonales(nombre, cedula, licencia);
    }

    public void cambiarTipoTraje(TipoTraje traje)
    {
        this.tipoTraje = Objects.requireNonNull(traje);
    }

    public DatosPersonales getDatosPersonales() {
        return datosPersonales;
    }

    public TipoTraje getTipoTraje() {
        return tipoTraje;
    }
}
