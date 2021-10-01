package com.juancarlosmaya.project_domain_llamadadeemergencia.llamada.commands;

import co.com.sofka.domain.generic.Command;

public class AnadirUbicacionAlerta extends Command {
    private final String ubicacion;

    public AnadirUbicacionAlerta(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getUbicacion() {
        return ubicacion;
    }
}
