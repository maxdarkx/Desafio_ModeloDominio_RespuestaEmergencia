package com.juancarlosmaya.project_domain_llamadadeemergencia.domain.respuesta.values;

import co.com.sofka.domain.generic.Identity;
import com.juancarlosmaya.project_domain_llamadadeemergencia.domain.llamada.values.IdAeronave;

public class IdMaquina extends Identity {
    public IdMaquina(String id) {
        super(id);
    }

    public IdMaquina(){}
    public static IdMaquina of(String id) {
        return new IdMaquina(id);
    }
}
