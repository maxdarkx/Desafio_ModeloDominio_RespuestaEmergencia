package com.juancarlosmaya.project_domain_llamadadeemergencia.domain.llamada.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class DatosPersonales implements ValueObject<String> {

    private final String nombre;
    private final String cedula;
    private final String licencia;

    public DatosPersonales(String nombre, String cedula, String licencia) {

        Integer.parseInt(cedula);
        Integer.parseInt(licencia);

        this.nombre = Objects.requireNonNull(nombre);
        this.cedula = Objects.requireNonNull(cedula);
        this.licencia = Objects.requireNonNull(licencia);
        if(cedula.length()<10)
        {
            throw( new IllegalArgumentException("La cedula colombiana debe contener al menos diez digitos"));
        }
        if(licencia.length()<3)
        {
            throw( new IllegalArgumentException("La Licencia BAE contiene al menos tres digitos"));
        }
    }

    @Override
    public String value() {
        return "Bombero " + this.nombre + ", C.C. " + this.cedula + ", Licencia BAE ";
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getLicencia() {
        return licencia;
    }
}
