package com.juancarlosmaya.project_domain_llamadadeemergencia.usecase.llamada;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.juancarlosmaya.project_domain_llamadadeemergencia.domain.llamada.Llamada;
import com.juancarlosmaya.project_domain_llamadadeemergencia.domain.llamada.commands.CrearLlamada;

public class CrearLlamadaUseCase extends UseCase<RequestCommand<CrearLlamada>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearLlamada> crearLlamadaRequestCommand) {
        var command = crearLlamadaRequestCommand.getCommand();
        var llamada = new Llamada(command.getIdLlamada(),
                command.getUbicacionAlerta(),
                command.getDescripcionAlerta(),
                command.getTipoAlerta(),
                command.getBomberoGuardia(),
                command.getAeronave(),
                command.getInformante());
        emit().onResponse(new ResponseEvents(llamada.getUncommittedChanges()));

    }
}
