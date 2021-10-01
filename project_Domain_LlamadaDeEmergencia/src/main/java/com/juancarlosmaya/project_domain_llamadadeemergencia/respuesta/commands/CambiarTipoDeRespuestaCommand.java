package com.juancarlosmaya.project_domain_llamadadeemergencia.respuesta.commands;

import co.com.sofka.domain.generic.Command;

public class CambiarTipoDeRespuestaCommand extends Command {
    private String tipo;

    public CambiarTipoDeRespuestaCommand(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
