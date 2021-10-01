package com.juancarlosmaya.project_domain_llamadadeemergencia.llamada.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.juancarlosmaya.project_domain_llamadadeemergencia.llamada.Aeronave;
import com.juancarlosmaya.project_domain_llamadadeemergencia.llamada.BomberoGuardia;
import com.juancarlosmaya.project_domain_llamadadeemergencia.llamada.Informante;
import com.juancarlosmaya.project_domain_llamadadeemergencia.llamada.values.DescripcionAlerta;
import com.juancarlosmaya.project_domain_llamadadeemergencia.llamada.values.IdLlamada;
import com.juancarlosmaya.project_domain_llamadadeemergencia.llamada.values.TipoAlerta;
import com.juancarlosmaya.project_domain_llamadadeemergencia.llamada.values.UbicacionAlerta;

public class LlamadaCreada extends DomainEvent {
    private final IdLlamada idLlamada;
    private final UbicacionAlerta ubicacionAlerta;
    private final DescripcionAlerta descripcionAlerta;
    private final TipoAlerta tipoAlerta;
    private final BomberoGuardia bomberoGuardia;
    private final Aeronave aeronave;
    private final Informante informante;

    public LlamadaCreada(IdLlamada entityId, UbicacionAlerta ubicacionAlerta,
                         DescripcionAlerta descripcionAlerta, TipoAlerta tipoAlerta,
                         BomberoGuardia bomberoGuardia, Aeronave aeronave,
                         Informante informante) {
        super("com.juancarlosmaya.project_domain_llamadadeemergencia.llamada");
        this.idLlamada = entityId;
        this.ubicacionAlerta = ubicacionAlerta;
        this.descripcionAlerta = descripcionAlerta;
        this.tipoAlerta = tipoAlerta;
        this.bomberoGuardia = bomberoGuardia;
        this.aeronave = aeronave;
        this.informante = informante;

    }

    public IdLlamada getIdLlamada() {
        return idLlamada;
    }

    public UbicacionAlerta getUbicacionAlerta() {
        return ubicacionAlerta;
    }

    public DescripcionAlerta getDescripcionAlerta() {
        return descripcionAlerta;
    }

    public TipoAlerta getTipoAlerta() {
        return tipoAlerta;
    }

    public BomberoGuardia getBomberoGuardia() {
        return bomberoGuardia;
    }

    public Aeronave getAeronave() {
        return aeronave;
    }

    public Informante getInformante() {
        return informante;
    }
}
