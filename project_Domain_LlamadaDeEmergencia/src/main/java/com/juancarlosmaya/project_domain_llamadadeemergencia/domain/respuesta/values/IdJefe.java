package com.juancarlosmaya.project_domain_llamadadeemergencia.domain.respuesta.values;

import co.com.sofka.domain.generic.Identity;

public class IdJefe extends Identity {
    public IdJefe(String id) {
        super(id);
    }

    public IdJefe(){}
    public static IdJefe of(String id) {
        return new IdJefe(id);
    }
}
