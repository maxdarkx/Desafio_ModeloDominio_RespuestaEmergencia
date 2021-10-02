package com.juancarlosmaya.project_domain_llamadadeemergencia.domain.respuesta;

import co.com.sofka.domain.generic.Entity;
import com.juancarlosmaya.project_domain_llamadadeemergencia.domain.respuesta.values.DatosPersonales;
import com.juancarlosmaya.project_domain_llamadadeemergencia.domain.respuesta.values.IdJefe;
import com.juancarlosmaya.project_domain_llamadadeemergencia.domain.respuesta.values.Recursos;

import java.util.List;
import java.util.Objects;

public class JefeMaquina extends Entity <IdJefe>{
    private Recursos recursos;
    private DatosPersonales datos;


    public JefeMaquina(IdJefe entityId, String nombre, String cedula, String licencia, int cantidadAgua, int cantidadEspuma, int cantidadPolvoQuimico) {
        super(entityId);

        Objects.requireNonNull(nombre);
        Objects.requireNonNull(cedula);
        Objects.requireNonNull(licencia);

        this.recursos = new Recursos(cantidadAgua, cantidadEspuma, cantidadPolvoQuimico);
        this.datos = new DatosPersonales(nombre, cedula, licencia);
    }

    public JefeMaquina(JefeMaquina jefe) {
        super(jefe.entityId);
        this.recursos = jefe.recursos;
        this.datos = jefe.datos;
    }

    public void cambiarDatosPersonales( String nombre, String cedula, String licencia)
    {
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(cedula);
        Objects.requireNonNull(licencia);
        this.datos = new DatosPersonales(nombre, cedula, licencia);
    }

    public void cambiarRecursos(int agua, int espuma, int pqs)
    {
        this.recursos = new Recursos(agua, espuma, pqs);
    }

    public Recursos getRecursos() {
        return recursos;
    }

    public DatosPersonales getDatos() {
        return datos;
    }
}
