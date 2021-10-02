package com.juancarlosmaya.project_domain_llamadadeemergencia.domain.llamada.commands;

import co.com.sofka.domain.generic.Command;

public class ActualizarTipoAlerta extends Command {
    private final String tipo;

    public ActualizarTipoAlerta(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

}
