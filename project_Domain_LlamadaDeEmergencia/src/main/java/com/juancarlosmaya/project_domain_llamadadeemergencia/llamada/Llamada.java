package com.juancarlosmaya.project_domain_llamadadeemergencia.llamada;

import co.com.sofka.domain.generic.AggregateEvent;
import com.juancarlosmaya.project_domain_llamadadeemergencia.llamada.events.*;
import com.juancarlosmaya.project_domain_llamadadeemergencia.llamada.values.DescripcionAlerta;
import com.juancarlosmaya.project_domain_llamadadeemergencia.llamada.values.IdLlamada;
import com.juancarlosmaya.project_domain_llamadadeemergencia.llamada.values.TipoAlerta;
import com.juancarlosmaya.project_domain_llamadadeemergencia.llamada.values.UbicacionAlerta;

import java.util.Objects;

public class Llamada extends AggregateEvent <IdLlamada>{
    protected UbicacionAlerta ubicacionAlerta;
    protected DescripcionAlerta descripcionAlerta;
    protected TipoAlerta tipoAlerta;
    protected BomberoGuardia bomberoGuardia;
    protected Aeronave aeronave;
    protected Informante informante;

    public Llamada(IdLlamada entityId, UbicacionAlerta ubicacionAlerta, DescripcionAlerta descripcionAlerta, TipoAlerta tipoAlerta, BomberoGuardia bomberoGuardia, Aeronave aeronave, Informante informante) {
        super(entityId);
        this.ubicacionAlerta = Objects.requireNonNull(ubicacionAlerta);
        this.descripcionAlerta = Objects.requireNonNull(descripcionAlerta);
        this.tipoAlerta = Objects.requireNonNull(tipoAlerta);
        this.bomberoGuardia = Objects.requireNonNull(bomberoGuardia);
        this.aeronave = Objects.requireNonNull(aeronave);
        this.informante = Objects.requireNonNull(informante);

        appendChange(new LlamadaCreada(entityId, ubicacionAlerta, descripcionAlerta, tipoAlerta, bomberoGuardia, aeronave, informante)).apply();
    }

    public void anadirTipoAlerta(TipoAlerta tipoAlerta)
    {
        Objects.requireNonNull(tipoAlerta);
        appendChange(new TipoAlertaAnadida(tipoAlerta)).apply();
    }

    public void actualizarTipoAlerta(TipoAlerta tipoAlerta)
    {
        Objects.requireNonNull(tipoAlerta);
        appendChange(new TipoAlertaActualizada(tipoAlerta)).apply();
    }

    public void anadirDescripcion(String descripcion)
    {
        Objects.requireNonNull(descripcion);
        appendChange(new DescripcionAlertaAnadida(descripcion)).apply();
    }

    public void cambiarDescripcion(DescripcionAlerta descripcion)
    {
        Objects.requireNonNull(descripcion);
        appendChange(new DescripcionAlertaCambiada(descripcion)).apply();
    }

    public void anadirUbicacion(String ubicacion)
    {
        Objects.requireNonNull(ubicacion);
        appendChange(new UbicacionAlertaAnadida(ubicacion)).apply();
    }

    public void cambiarUbicacion(UbicacionAlerta ubicacion)
    {
        Objects.requireNonNull(ubicacion);
        appendChange(new UbicacionAlertaCambiada(ubicacion)).apply();
    }

}
