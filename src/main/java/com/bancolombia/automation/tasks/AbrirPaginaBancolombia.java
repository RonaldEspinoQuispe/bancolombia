package com.bancolombia.automation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPaginaBancolombia implements Task {

    private static final String URL_BANCOLOMBIA =
            "https://www.bancolombia.com/personas";

    public static AbrirPaginaBancolombia paginaPersonas() {
        return Tasks.instrumented(AbrirPaginaBancolombia.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(URL_BANCOLOMBIA)
        );
    }
}