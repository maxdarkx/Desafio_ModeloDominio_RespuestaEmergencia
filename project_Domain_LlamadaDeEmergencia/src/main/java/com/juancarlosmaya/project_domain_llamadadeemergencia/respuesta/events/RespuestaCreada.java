package com.juancarlosmaya.project_domain_llamadadeemergencia.respuesta.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.juancarlosmaya.project_domain_llamadadeemergencia.llamada.values.IdLlamada;
import com.juancarlosmaya.project_domain_llamadadeemergencia.respuesta.Bombero;
import com.juancarlosmaya.project_domain_llamadadeemergencia.respuesta.JefeMaquina;
import com.juancarlosmaya.project_domain_llamadadeemergencia.respuesta.Maquina;
import com.juancarlosmaya.project_domain_llamadadeemergencia.respuesta.values.IdRespuesta;
import com.juancarlosmaya.project_domain_llamadadeemergencia.respuesta.values.TipoRespuesta;

import java.util.Objects;
import java.util.Set;

public class RespuestaCreada extends DomainEvent {

    private final IdRespuesta idRespuesta;
    private final IdLlamada codigoLlamada;
    private final TipoRespuesta tipoRespuesta;
    private final Maquina maquina;
    private final Set<Bombero> bomberos;
    private final JefeMaquina jefe;

    public RespuestaCreada(IdRespuesta entityId, IdLlamada codigoLlamada, TipoRespuesta tipoRespuesta, Maquina maquina, Set<Bombero> bomberos, JefeMaquina jefe) {
        super("com.juancarlosmaya.project_domain_llamadadeemergencia.respuesta.Respuesta");
        this.idRespuesta = Objects.requireNonNull(entityId);
        this.codigoLlamada = Objects.requireNonNull(codigoLlamada);
        this.tipoRespuesta = Objects.requireNonNull(tipoRespuesta);
        this.maquina = Objects.requireNonNull(maquina);
        if(bomberos.size()>0 && bomberos.size()<3)
            this.bomberos = Objects.requireNonNull(bomberos);
        else
            throw(new IllegalArgumentException("Debe haber al menos un bombero en la maquina, y maximo 3"));
        this.jefe = Objects.requireNonNull(jefe);
    }

    public IdRespuesta getIdRespuesta() {
        return idRespuesta;
    }

    public IdLlamada getCodigoLlamada() {
        return codigoLlamada;
    }

    public TipoRespuesta getTipoRespuesta() {
        return tipoRespuesta;
    }

    public Maquina getMaquina() {
        return maquina;
    }

    public Set<Bombero> getBomberos() {
        return bomberos;
    }

    public JefeMaquina getJefe() {
        return jefe;
    }
}
