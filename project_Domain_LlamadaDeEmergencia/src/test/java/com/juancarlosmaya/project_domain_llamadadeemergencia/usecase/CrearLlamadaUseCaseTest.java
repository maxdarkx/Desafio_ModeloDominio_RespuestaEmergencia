package com.juancarlosmaya.project_domain_llamadadeemergencia.usecase;


import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.juancarlosmaya.project_domain_llamadadeemergencia.domain.llamada.Aeronave;
import com.juancarlosmaya.project_domain_llamadadeemergencia.domain.llamada.BomberoGuardia;
import com.juancarlosmaya.project_domain_llamadadeemergencia.domain.llamada.Informante;
import com.juancarlosmaya.project_domain_llamadadeemergencia.domain.llamada.LlamadaCreada;
import com.juancarlosmaya.project_domain_llamadadeemergencia.domain.llamada.commands.CrearLlamada;
import com.juancarlosmaya.project_domain_llamadadeemergencia.domain.llamada.values.*;
import com.juancarlosmaya.project_domain_llamadadeemergencia.usecase.llamada.CrearLlamadaUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CrearLlamadaUseCaseTest {
    @Test
    void crearLlamadaEscenarioExplicito()
    {
        //arrange
        var command = new CrearLlamada(
                IdLlamada.of("1111"),
                new UbicacionAlerta("cabecera 01"),
                new DescripcionAlerta("Aeronave reporta falla en cabina "),
                new TipoAlerta("Alerta 1"),
                new BomberoGuardia(IdBombero.of("2222"),"Jose Martinez","1105111444","585"),
                new Aeronave(IdAeronave.of("3333"),new TipoAeronave("boeing 737"),new CantidadPasajeros(100),new CantidadCombustible(2000)),
                new Informante(IdInformante.of("4444"),new DatosInformante("Pepito Perez","Controlador TorreControl"))
        );

        var useCase = new CrearLlamadaUseCase();
        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (LlamadaCreada) events.get(0);
        Assertions.assertEquals("1111",event.getIdLlamada().value());
        Assertions.assertEquals("cabecera 01",event.getUbicacionAlerta().value());
        Assertions.assertEquals("Aeronave reporta falla en cabina ",event.getDescripcionAlerta().value());
        Assertions.assertEquals("Alerta 1",event.getTipoAlerta().value());
        Assertions.assertEquals("585",event.getBomberoGuardia().getDatosPersonales().getLicencia());
        Assertions.assertEquals("El informante de la alerta fue "+"Pepito Perez"+" de tipo "+"Controlador TorreControl" ,event.getInformante().getDatosInformante().value());


    }

}
