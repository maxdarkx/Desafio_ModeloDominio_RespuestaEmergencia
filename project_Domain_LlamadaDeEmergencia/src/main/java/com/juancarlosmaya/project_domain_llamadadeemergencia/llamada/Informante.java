package com.juancarlosmaya.project_domain_llamadadeemergencia.llamada;

import co.com.sofka.domain.generic.Entity;
import com.juancarlosmaya.project_domain_llamadadeemergencia.llamada.values.DatosInformante;
import com.juancarlosmaya.project_domain_llamadadeemergencia.llamada.values.IdInformante;

import java.util.Objects;

public class Informante extends Entity<IdInformante> {
    DatosInformante datosInformante;

    public Informante(IdInformante entityId, DatosInformante datosInformante) {
        super(entityId);
        this.datosInformante = Objects.requireNonNull(datosInformante);
    }

    public void cambiarDatosInformante(DatosInformante datos)
    {
        this.datosInformante = Objects.requireNonNull(datos);
    }

    public DatosInformante getDatosInformante() {
        return datosInformante;
    }
}
