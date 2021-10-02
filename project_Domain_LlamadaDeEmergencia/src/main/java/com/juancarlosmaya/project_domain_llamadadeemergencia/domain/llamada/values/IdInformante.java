package com.juancarlosmaya.project_domain_llamadadeemergencia.domain.llamada.values;

import co.com.sofka.domain.generic.Identity;
import com.juancarlosmaya.project_domain_llamadadeemergencia.domain.respuesta.values.IdRespuesta;

public class IdInformante extends Identity {
    public IdInformante(String id) {
        super(id);
    }

    public IdInformante(){}
    public static IdInformante of(String id) {
        return new IdInformante(id);
    }
}
