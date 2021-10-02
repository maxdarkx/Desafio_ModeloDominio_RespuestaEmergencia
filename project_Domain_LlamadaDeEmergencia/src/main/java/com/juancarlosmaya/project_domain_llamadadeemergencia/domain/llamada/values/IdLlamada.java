package com.juancarlosmaya.project_domain_llamadadeemergencia.domain.llamada.values;

import co.com.sofka.domain.generic.Identity;

public class IdLlamada extends Identity {
    public IdLlamada(String id)
    {
        super(id);
    }
    public IdLlamada(){}
    public static IdLlamada of(String id)
    {
        return new IdLlamada(id);
    }
}
