package com.bancolombia.automation.interactions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.bancolombia.automation.userinterfaces.HomePage.BOTON_ACEPTAR_TODO;
import static com.bancolombia.automation.utils.Constantes.TIEMPO_ESPERA_SEGUNDOS;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class AceptarConsentimiento implements Interaction {

    public static AceptarConsentimiento deCookies() {
        return instrumented(AceptarConsentimiento.class);
    }

    @Override
    @Step("{0} acepta todo en el aviso de cookies")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BOTON_ACEPTAR_TODO, isClickable()).forNoMoreThan(TIEMPO_ESPERA_SEGUNDOS).seconds(),
                Click.on(BOTON_ACEPTAR_TODO)
        );
    }
}
