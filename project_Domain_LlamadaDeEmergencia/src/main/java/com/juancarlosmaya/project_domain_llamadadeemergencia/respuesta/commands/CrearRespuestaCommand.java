package com.juancarlosmaya.project_domain_llamadadeemergencia.respuesta.commands;

import co.com.sofka.domain.generic.Command;
import com.juancarlosmaya.project_domain_llamadadeemergencia.llamada.values.IdLlamada;
import com.juancarlosmaya.project_domain_llamadadeemergencia.respuesta.Bombero;
import com.juancarlosmaya.project_domain_llamadadeemergencia.respuesta.JefeMaquina;
import com.juancarlosmaya.project_domain_llamadadeemergencia.respuesta.Maquina;
import com.juancarlosmaya.project_domain_llamadadeemergencia.respuesta.values.IdRespuesta;
import com.juancarlosmaya.project_domain_llamadadeemergencia.respuesta.values.TipoRespuesta;

import java.util.Set;

public class CrearRespuestaCommand extends Command {
    private IdRespuesta idRespuesta;
    private IdLlamada codigoLlamada;
    private TipoRespuesta tipoRespuesta;
    private Maquina maquina;
    private Set<Bombero> bomberos;
    private JefeMaquina jefe;

    public CrearRespuestaCommand(IdRespuesta idRespuesta, IdLlamada codigoLlamada, TipoRespuesta tipoRespuesta, Maquina maquina, Set<Bombero> bomberos, JefeMaquina jefe) {
        this.idRespuesta = idRespuesta;
        this.codigoLlamada = codigoLlamada;
        this.tipoRespuesta = tipoRespuesta;
        this.maquina = maquina;
        this.bomberos = bomberos;
        this.jefe = jefe;
    }

    public IdRespuesta getIdRespuesta() {
        return idRespuesta;
    }

    public IdLlamada getCodigoLlamada() {
        return codigoLlamada;
    }

    public void setCodigoLlamada(IdLlamada codigoLlamada) {
        this.codigoLlamada = codigoLlamada;
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
