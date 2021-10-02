package com.juancarlosmaya.project_domain_llamadadeemergencia.domain.llamada;

import co.com.sofka.domain.generic.DomainEvent;
import com.juancarlosmaya.project_domain_llamadadeemergencia.domain.llamada.values.DescripcionAlerta;
import com.juancarlosmaya.project_domain_llamadadeemergencia.domain.llamada.values.IdLlamada;
import com.juancarlosmaya.project_domain_llamadadeemergencia.domain.llamada.values.TipoAlerta;
import com.juancarlosmaya.project_domain_llamadadeemergencia.domain.llamada.values.UbicacionAlerta;

import java.util.Objects;

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
        super("com.juancarlosmaya.project_domain_llamadadeemergencia.Llamada");
        this.idLlamada = Objects.requireNonNull(entityId);
        this.ubicacionAlerta = Objects.requireNonNull(ubicacionAlerta);
        this.descripcionAlerta = Objects.requireNonNull(descripcionAlerta);
        this.tipoAlerta = Objects.requireNonNull(tipoAlerta);
        this.bomberoGuardia = Objects.requireNonNull(bomberoGuardia);
        this.aeronave = Objects.requireNonNull(aeronave);
        this.informante = Objects.requireNonNull(informante);

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
