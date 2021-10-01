package com.juancarlosmaya.project_domain_llamadadeemergencia.respuesta.commands;

import co.com.sofka.domain.generic.Command;

public class AgregarTiempoDeRespuestaCommand extends Command {
    private String tiempo;

    public AgregarTiempoDeRespuestaCommand(String tiempo) {
        this.tiempo = tiempo;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }
}
