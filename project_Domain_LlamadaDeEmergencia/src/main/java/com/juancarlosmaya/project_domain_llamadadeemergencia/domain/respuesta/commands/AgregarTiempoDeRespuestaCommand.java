package com.juancarlosmaya.project_domain_llamadadeemergencia.domain.respuesta.commands;

import co.com.sofka.domain.generic.Command;

public class AgregarTiempoDeRespuestaCommand extends Command {
    private final String tiempo;

    public AgregarTiempoDeRespuestaCommand(String tiempo) {
        this.tiempo = tiempo;
    }

    public String getTiempo() {
        return tiempo;
    }
}
