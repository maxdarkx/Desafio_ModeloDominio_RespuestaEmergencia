package com.juancarlosmaya.project_domain_llamadadeemergencia.domain.respuesta.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.juancarlosmaya.project_domain_llamadadeemergencia.domain.llamada.values.IdLlamada;
import com.juancarlosmaya.project_domain_llamadadeemergencia.domain.respuesta.Bombero;
import com.juancarlosmaya.project_domain_llamadadeemergencia.domain.respuesta.JefeMaquina;
import com.juancarlosmaya.project_domain_llamadadeemergencia.domain.respuesta.Maquina;
import com.juancarlosmaya.project_domain_llamadadeemergencia.domain.respuesta.values.IdRespuesta;
import com.juancarlosmaya.project_domain_llamadadeemergencia.domain.respuesta.values.TipoRespuesta;

import java.util.Objects;
import java.util.Set;

public class RespuestaCreada extends DomainEvent {

    private final IdRespuesta idRespuesta;
    private final TipoRespuesta tipoRespuesta;
    private final Maquina maquina;
    private final Bombero bombero;
    private final JefeMaquina jefe;

    public RespuestaCreada(IdRespuesta entityId, TipoRespuesta tipoRespuesta, Maquina maquina, Bombero bombero, JefeMaquina jefe) {
        super("com.juancarlosmaya.project_domain_llamadadeemergencia.domain.respuesta.Respuesta");
        this.idRespuesta = Objects.requireNonNull(entityId);
        this.tipoRespuesta = Objects.requireNonNull(tipoRespuesta);
        this.maquina = Objects.requireNonNull(maquina);
        this.bombero = Objects.requireNonNull(bombero);
        this.jefe = Objects.requireNonNull(jefe);
    }

    public IdRespuesta getIdRespuesta() {
        return idRespuesta;
    }

    public TipoRespuesta getTipoRespuesta() {
        return tipoRespuesta;
    }

    public Maquina getMaquina() {
        return maquina;
    }

    public Bombero getBombero() {
        return bombero;
    }

    public JefeMaquina getJefe() {
        return jefe;
    }
}
