package com.juancarlosmaya.project_domain_llamadadeemergencia.respuesta;

import co.com.sofka.domain.generic.AggregateEvent;
import com.juancarlosmaya.project_domain_llamadadeemergencia.llamada.values.IdLlamada;
import com.juancarlosmaya.project_domain_llamadadeemergencia.respuesta.events.RespuestaCreada;
import com.juancarlosmaya.project_domain_llamadadeemergencia.respuesta.events.TiempoDeRespuestaAgregado;
import com.juancarlosmaya.project_domain_llamadadeemergencia.respuesta.events.TiempoDeRespuestaCambiado;
import com.juancarlosmaya.project_domain_llamadadeemergencia.respuesta.values.IdRespuesta;
import com.juancarlosmaya.project_domain_llamadadeemergencia.respuesta.values.TiempoRespuesta;
import com.juancarlosmaya.project_domain_llamadadeemergencia.respuesta.values.TipoRespuesta;

import java.util.Objects;
import java.util.Set;

public class Respuesta extends AggregateEvent<IdRespuesta> {
    ///Agregar y Cambiar tiempo de respuesta
    //Agregar y cambiar tipo de respuesta
    ///extra: verificar si la maquina cumple con los requisitos del maquinista


    protected IdLlamada codigoLlamada;
    protected TipoRespuesta tipoRespuesta;
    protected Maquina maquina;
    protected Set<Bombero> bomberos;
    protected JefeMaquina jefe;

    public Respuesta(IdRespuesta entityId, IdLlamada codigoLlamada, TipoRespuesta tipoRespuesta, Maquina maquina, Set<Bombero> bomberos, JefeMaquina jefe) {
        super(entityId);
        this.codigoLlamada = Objects.requireNonNull(codigoLlamada);
        this.tipoRespuesta = Objects.requireNonNull(tipoRespuesta);
        this.maquina = Objects.requireNonNull(maquina);
        this.bomberos = Objects.requireNonNull(bomberos);
        this.jefe = Objects.requireNonNull(jefe);
        appendChange(new RespuestaCreada(entityId, codigoLlamada, tipoRespuesta, maquina, bomberos, jefe));
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
