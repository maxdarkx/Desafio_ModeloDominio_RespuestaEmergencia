package com.juancarlosmaya.project_domain_llamadadeemergencia.domain.respuesta.values;

import co.com.sofka.domain.generic.Identity;
import com.juancarlosmaya.project_domain_llamadadeemergencia.domain.respuesta.Bombero;
import com.juancarlosmaya.project_domain_llamadadeemergencia.domain.respuesta.JefeMaquina;
import com.juancarlosmaya.project_domain_llamadadeemergencia.domain.respuesta.Maquina;

public class IdRespuesta extends Identity {

    public IdRespuesta(String id) {
        super(id);
    }

    public IdRespuesta(){}
    public static IdRespuesta of(String id) {
        return new IdRespuesta(id);
    }
}
