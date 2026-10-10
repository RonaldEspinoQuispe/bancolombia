package com.bancolombia.automation.stepdefinitions;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class SerenityHooks {

    @Before
    public void configurarEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }
}
