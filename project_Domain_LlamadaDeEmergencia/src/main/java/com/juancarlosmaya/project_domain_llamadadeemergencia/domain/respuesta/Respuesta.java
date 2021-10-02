package com.juancarlosmaya.project_domain_llamadadeemergencia.domain.respuesta;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.juancarlosmaya.project_domain_llamadadeemergencia.domain.respuesta.events.*;
import com.juancarlosmaya.project_domain_llamadadeemergencia.domain.respuesta.values.IdRespuesta;
import com.juancarlosmaya.project_domain_llamadadeemergencia.domain.respuesta.values.TipoRespuesta;

import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Respuesta extends AggregateEvent<IdRespuesta> {
     ///extra: verificar si la maquina cumple con los requisitos del maquinista

    protected TipoRespuesta tipoRespuesta;
    protected Maquina maquina;
    protected Bombero bombero;
    protected JefeMaquina jefe;

    public Respuesta(IdRespuesta entityId, TipoRespuesta tipoRespuesta, Maquina maquina, Bombero bombero, JefeMaquina jefe) {
        super(entityId);
        this.tipoRespuesta = Objects.requireNonNull(tipoRespuesta);
        this.maquina = Objects.requireNonNull(maquina);
        this.bombero = Objects.requireNonNull(bombero);
        this.jefe = Objects.requireNonNull(jefe);
        appendChange(new RespuestaCreada(entityId, tipoRespuesta, maquina, bombero, jefe));
    }

    public static Respuesta from(IdRespuesta id, List<DomainEvent> events)
    {
        var respuesta = new Respuesta(id);
        events.forEach(respuesta::applyEvent);
        return respuesta;
    }
    private Respuesta(IdRespuesta id)
    {
        super(id);
        subscribe(new RespuestaEventChange(this));
    }

    public void agregarTiempoDeRespuesta(String tiempo)
    {
        Objects.requireNonNull(tiempo);
        if(Integer.parseInt(tiempo)>0)
            appendChange(new TiempoDeRespuestaAgregado(tiempo)).apply();
        else
            throw(new IllegalArgumentException("Debe darse un tiempo mayor que cero"));
    }

    public void cambiarTiempoDeRespuesta(String tiempo)
    {
        Objects.requireNonNull(tiempo);
        appendChange(new TiempoDeRespuestaCambiado(tiempo)).apply();
    }

    public void agregarTipoDeRespuesta(String tipo)
    {
        Objects.requireNonNull(tipo);
        appendChange(new TipoDeRespuestaAgregado(tipo)).apply();
    }

    public void cambiarTipoDeRespuesta(String tipo)
    {
        Objects.requireNonNull(tipo);
        appendChange(new TipoDeRespuestaCambiado(tipo)).apply();
    }
}
