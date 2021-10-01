package com.juancarlosmaya.project_domain_llamadadeemergencia.llamada.commands;

import co.com.sofka.domain.generic.Command;

public class AnadirDescripcionAlerta extends Command{
    private final String ubicacion;

    public AnadirDescripcionAlerta(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
