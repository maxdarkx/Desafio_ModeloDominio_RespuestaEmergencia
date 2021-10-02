package com.juancarlosmaya.project_domain_llamadadeemergencia.domain.respuesta.commands;

import co.com.sofka.domain.generic.Command;
import com.juancarlosmaya.project_domain_llamadadeemergencia.domain.llamada.values.IdLlamada;
import com.juancarlosmaya.project_domain_llamadadeemergencia.domain.respuesta.Bombero;
import com.juancarlosmaya.project_domain_llamadadeemergencia.domain.respuesta.JefeMaquina;
import com.juancarlosmaya.project_domain_llamadadeemergencia.domain.respuesta.Maquina;
import com.juancarlosmaya.project_domain_llamadadeemergencia.domain.respuesta.values.IdRespuesta;
import com.juancarlosmaya.project_domain_llamadadeemergencia.domain.respuesta.values.TipoRespuesta;

import java.util.Set;

public class CrearRespuestaCommand extends Command {
    private IdRespuesta idRespuesta;
    private TipoRespuesta tipoRespuesta;
    private Maquina maquina;
    private Set<Bombero> bomberos;
    private JefeMaquina jefe;

    public CrearRespuestaCommand(IdRespuesta idRespuesta, TipoRespuesta tipoRespuesta, Maquina maquina, Set<Bombero> bomberos, JefeMaquina jefe) {
        this.idRespuesta = idRespuesta;
        this.tipoRespuesta = tipoRespuesta;
        this.maquina = maquina;
        this.bomberos = bomberos;
        this.jefe = jefe;
    }

    public IdRespuesta getIdRespuesta() {
        return idRespuesta;
    }

    public TipoRespuesta getTipoRespuesta() {
        return tipoRespuesta;
    }

    public void setTipoRespuesta(TipoRespuesta tipoRespuesta) {
        this.tipoRespuesta = tipoRespuesta;
    }

    public Maquina getMaquina() {
        return maquina;
    }

    public void setMaquina(Maquina maquina) {
        this.maquina = maquina;
    }

    public Set<Bombero> getBomberos() {
        return bomberos;
    }

    public void setBomberos(Set<Bombero> bomberos) {
        this.bomberos = bomberos;
    }

    public JefeMaquina getJefe() {
        return jefe;
    }

    public void setJefe(JefeMaquina jefe) {
        this.jefe = jefe;
    }
}
