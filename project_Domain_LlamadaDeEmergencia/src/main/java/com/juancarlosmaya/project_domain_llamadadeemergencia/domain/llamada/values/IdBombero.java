package com.juancarlosmaya.project_domain_llamadadeemergencia.domain.llamada.values;

import co.com.sofka.domain.generic.Identity;
import com.juancarlosmaya.project_domain_llamadadeemergencia.domain.respuesta.values.IdRespuesta;

public class IdBombero extends Identity {
    public IdBombero(String id) {
        super(id);
    }

    public IdBombero(){}

    public static IdBombero of(String id) {
        return new IdBombero(id);

    }
}
