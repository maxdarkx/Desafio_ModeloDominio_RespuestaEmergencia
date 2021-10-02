package com.juancarlosmaya.project_domain_llamadadeemergencia.domain.respuesta;

import co.com.sofka.domain.generic.EventChange;
import com.juancarlosmaya.project_domain_llamadadeemergencia.domain.respuesta.events.RespuestaCreada;

public class RespuestaEventChange extends EventChange {
    public RespuestaEventChange(Respuesta respuesta)
    {
        apply((RespuestaCreada event)->{
            respuesta.tipoRespuesta = event.getTipoRespuesta();
            respuesta.bombero = event.getBombero();
            respuesta.jefe = event.getJefe();
            respuesta.maquina = event.getMaquina();
        });
    }
}
