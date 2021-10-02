package com.juancarlosmaya.project_domain_llamadadeemergencia.domain.respuesta.commands;

import co.com.sofka.domain.generic.Command;

public class AgregarTipoDeRespuestaCommand extends Command {
    private String tipo;

    public AgregarTipoDeRespuestaCommand(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
