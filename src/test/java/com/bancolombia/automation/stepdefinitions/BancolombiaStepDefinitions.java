package com.bancolombia.automation.stepdefinitions;

import com.bancolombia.automation.tasks.AbrirPaginaBancolombia;

import io.cucumber.java.es.Cuando;
import net.serenitybdd.screenplay.actors.OnStage;

public class BancolombiaStepDefinitions {

    @Cuando("el usuario ingresa a la pagina de bancolombia")
    public void elUsuarioIngresaALaPaginaDeBancolombia() {

        OnStage.theActorCalled("Usuario")
                .attemptsTo(
                        AbrirPaginaBancolombia.paginaPersonas()
                );
    }
}
