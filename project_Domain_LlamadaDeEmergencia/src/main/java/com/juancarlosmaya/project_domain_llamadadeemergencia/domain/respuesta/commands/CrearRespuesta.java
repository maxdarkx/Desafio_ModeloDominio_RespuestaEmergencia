package com.juancarlosmaya.project_domain_llamadadeemergencia.domain.respuesta.commands;

import co.com.sofka.domain.generic.Command;
import com.juancarlosmaya.project_domain_llamadadeemergencia.domain.respuesta.Bombero;
import com.juancarlosmaya.project_domain_llamadadeemergencia.domain.respuesta.JefeMaquina;
import com.juancarlosmaya.project_domain_llamadadeemergencia.domain.respuesta.Maquina;
import com.juancarlosmaya.project_domain_llamadadeemergencia.domain.respuesta.values.IdRespuesta;
import com.juancarlosmaya.project_domain_llamadadeemergencia.domain.respuesta.values.TipoRespuesta;

public class CrearRespuesta extends Command {
    private final IdRespuesta entityId;
    private final TipoRespuesta tipoRespuesta;
    private final Maquina maquina;
    private final Bombero bombero;
    private final JefeMaquina jefe;

    public CrearRespuesta(IdRespuesta id, TipoRespuesta tipoRespuesta, Maquina maquina, Bombero bombero, JefeMaquina jefe) {
        this.entityId = id;
        this.tipoRespuesta = tipoRespuesta;
        this.maquina = maquina;
        this.bombero = bombero;
        this.jefe = jefe;
    }

    public IdRespuesta getEntityId() {
        return entityId;
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
