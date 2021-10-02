package com.juancarlosmaya.project_domain_llamadadeemergencia.usecase.respuesta;

import co.com.sofka.business.generic.UseCase;

import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.generic.DomainEvent;
import com.juancarlosmaya.project_domain_llamadadeemergencia.domain.respuesta.Bombero;
import com.juancarlosmaya.project_domain_llamadadeemergencia.domain.respuesta.JefeMaquina;
import com.juancarlosmaya.project_domain_llamadadeemergencia.domain.respuesta.Maquina;
import com.juancarlosmaya.project_domain_llamadadeemergencia.domain.respuesta.Respuesta;

import com.juancarlosmaya.project_domain_llamadadeemergencia.domain.respuesta.commands.CrearRespuesta;
import com.juancarlosmaya.project_domain_llamadadeemergencia.domain.respuesta.values.IdRespuesta;
import com.juancarlosmaya.project_domain_llamadadeemergencia.domain.respuesta.values.TipoRespuesta;

import java.util.List;
import java.util.Set;

public class CrearRespuestaUseCase extends UseCase<RequestCommand<CrearRespuesta>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearRespuesta> crearRespuestaRequestCommand) {
        var command = crearRespuestaRequestCommand.getCommand();
        var respuesta = new Respuesta(
                            command.getEntityId(),
                            command.getTipoRespuesta(),
                            command.getMaquina(),
                            command.getBombero(),
                            command.getJefe());

        emit().onResponse(new ResponseEvents(respuesta.getUncommittedChanges()));
    }
}
