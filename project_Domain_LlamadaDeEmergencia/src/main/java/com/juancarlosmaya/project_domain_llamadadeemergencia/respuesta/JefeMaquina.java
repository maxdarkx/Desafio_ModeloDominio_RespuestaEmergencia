package com.juancarlosmaya.project_domain_llamadadeemergencia.respuesta;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.generic.Identity;
import com.juancarlosmaya.project_domain_llamadadeemergencia.respuesta.values.DatosPersonales;
import com.juancarlosmaya.project_domain_llamadadeemergencia.respuesta.values.IdJefe;
import com.juancarlosmaya.project_domain_llamadadeemergencia.respuesta.values.Recursos;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class JefeMaquina extends Entity <IdJefe>{
    private Recursos recursos;
    private DatosPersonales datos;


    public JefeMaquina(IdJefe entityId, String nombre, String cedula, String licencia, int cantidadAgua, int cantidadEspuma, int cantidadPolvoQuimico, List<String> herramientaEspecial) {
        super(entityId);

        Objects.requireNonNull(nombre);
        Objects.requireNonNull(cedula);
        Objects.requireNonNull(licencia);
        Objects.requireNonNull(herramientaEspecial);

        this.recursos = new Recursos(cantidadAgua, cantidadEspuma, cantidadPolvoQuimico, herramientaEspecial);
        this.datos = new DatosPersonales(nombre, cedula, licencia);
    }
    public void cambiarDatosPersonales( String nombre, String cedula, String licencia)
    {
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(cedula);
        Objects.requireNonNull(licencia);
        this.datos = new DatosPersonales(nombre, cedula, licencia);
    }

    public void cambiarRecursos(int agua, int espuma, int pqs, List <String> herramienta)
    {
        this.recursos = new Recursos(agua,espuma, pqs, herramienta);
    }

    public Recursos getRecursos() {
        return recursos;
    }

    public DatosPersonales getDatos() {
        return datos;
    }
}
