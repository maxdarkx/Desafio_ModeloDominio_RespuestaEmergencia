package com.juancarlosmaya.project_domain_llamadadeemergencia.respuesta;

import co.com.sofka.domain.generic.EventChange;
import com.juancarlosmaya.project_domain_llamadadeemergencia.respuesta.events.RespuestaCreada;

public class RespuestaEventChange extends EventChange {
    public RespuestaEventChange(Respuesta respuesta)
    {
        apply((RespuestaCreada event)->{
            respuesta.tipoRespuesta = event.getTipoRespuesta();
            respuesta.codigoLlamada = event.getCodigoLlamada();
            respuesta.bomberos = event.getBomberos();
            respuesta.jefe = event.getJefe();
            respuesta.maquina = event.getMaquina();
        });
    }
}
