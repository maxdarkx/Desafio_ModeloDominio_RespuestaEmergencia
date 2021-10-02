package com.juancarlosmaya.project_domain_llamadadeemergencia.domain.llamada.commands;

import co.com.sofka.domain.generic.Command;
import com.juancarlosmaya.project_domain_llamadadeemergencia.domain.llamada.Aeronave;
import com.juancarlosmaya.project_domain_llamadadeemergencia.domain.llamada.BomberoGuardia;
import com.juancarlosmaya.project_domain_llamadadeemergencia.domain.llamada.Informante;
import com.juancarlosmaya.project_domain_llamadadeemergencia.domain.llamada.values.DescripcionAlerta;
import com.juancarlosmaya.project_domain_llamadadeemergencia.domain.llamada.values.IdLlamada;
import com.juancarlosmaya.project_domain_llamadadeemergencia.domain.llamada.values.TipoAlerta;
import com.juancarlosmaya.project_domain_llamadadeemergencia.domain.llamada.values.UbicacionAlerta;

public class CrearLlamada extends Command {


    private final IdLlamada idLlamada;
    private final UbicacionAlerta ubicacionAlerta;
    private final DescripcionAlerta descripcionAlerta;
    private final TipoAlerta tipoAlerta;
    private final BomberoGuardia bomberoGuardia;
    private final Aeronave aeronave;
    private final Informante informante;

    public CrearLlamada(IdLlamada idllamada, UbicacionAlerta ubicacionAlerta, DescripcionAlerta descripcionAlerta, TipoAlerta tipoAlerta, BomberoGuardia bomberoGuardia, Aeronave aeronave, Informante informante) {
        this.idLlamada = idllamada;
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
