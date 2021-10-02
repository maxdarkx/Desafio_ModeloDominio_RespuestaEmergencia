package com.juancarlosmaya.project_domain_llamadadeemergencia.domain.llamada;

import co.com.sofka.domain.generic.EventChange;

public class LlamadaEventChange extends EventChange {
    public LlamadaEventChange(Llamada llamada) {
        apply((LlamadaCreada event)->{
            llamada.ubicacionAlerta = event.getUbicacionAlerta();
            llamada.descripcionAlerta = event.getDescripcionAlerta();
            llamada.tipoAlerta = event.getTipoAlerta();
            llamada.bomberoGuardia = event.getBomberoGuardia();
            llamada.aeronave = event.getAeronave();
            llamada.informante = event.getInformante();
        });
    }
}
