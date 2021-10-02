package com.juancarlosmaya.project_domain_llamadadeemergencia.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.juancarlosmaya.project_domain_llamadadeemergencia.domain.llamada.values.IdBombero;
import com.juancarlosmaya.project_domain_llamadadeemergencia.domain.respuesta.Bombero;
import com.juancarlosmaya.project_domain_llamadadeemergencia.domain.respuesta.JefeMaquina;
import com.juancarlosmaya.project_domain_llamadadeemergencia.domain.respuesta.Maquina;
import com.juancarlosmaya.project_domain_llamadadeemergencia.domain.respuesta.commands.CrearRespuesta;
import com.juancarlosmaya.project_domain_llamadadeemergencia.domain.respuesta.events.RespuestaCreada;
import com.juancarlosmaya.project_domain_llamadadeemergencia.domain.respuesta.values.*;
import com.juancarlosmaya.project_domain_llamadadeemergencia.usecase.respuesta.CrearRespuestaUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CrearRespuestaUseCaseTest {

    @Test
    void crearRespuestaEscenarioEXplicito()
    {
        var command = new CrearRespuesta(
                IdRespuesta.of("1111"),
                new TipoRespuesta("ContraIncendios"),
                new Maquina(IdMaquina.of("2222"),1500,90,450,"Oshkosh","Aeronautico","Caterpillar"),
                new Bombero(IdBombero.of("3333"),"Juan Martinez","1111000333","485", "aluminizado"),
                new JefeMaquina(IdJefe.of("4444"),"Jose Gomez","1111000001","101",1500,90,450)
        );

        var useCase = new CrearRespuestaUseCase();

        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (RespuestaCreada) events.get(0);
        Assertions.assertEquals("1111", event.getIdRespuesta().value());
        Assertions.assertEquals("ContraIncendios",event.getTipoRespuesta().value());
        Assertions.assertEquals("2222",event.getMaquina().getIdMaquina().value());
        Assertions.assertEquals(new CantidadAgenteExtintor(1500,90,450).value(),event.getMaquina().getCantidad().value());
        Assertions.assertEquals(new DatosMaquina("Oshkosh","Aeronautico","Caterpillar").value(), event.getMaquina().getDatos().value());
        Assertions.assertEquals("485",event.getBombero().getDatosPersonales().getLicencia());
        Assertions.assertEquals("101",event.getJefe().getDatos().getLicencia());

    }

}
