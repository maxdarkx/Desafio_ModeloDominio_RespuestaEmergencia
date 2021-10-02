package com.juancarlosmaya.project_domain_llamadadeemergencia.domain.llamada.values;

import co.com.sofka.domain.generic.Identity;
import com.juancarlosmaya.project_domain_llamadadeemergencia.domain.respuesta.values.IdRespuesta;

public class IdAeronave extends Identity {
    public IdAeronave(String id) {
        super(id);
    }

    public IdAeronave(){}
    public static IdAeronave of(String id) {
        return new IdAeronave(id);
    }
}
