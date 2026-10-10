package com.bancolombia.automation.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.bancolombia.automation.utils.Constantes.TIEMPO_ESPERA_SEGUNDOS;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

/**
 * Espera a que el elemento se pueda pulsar y luego hace clic.
 * Evita fallos intermitentes en menús desplegables y en páginas que cargan contenido dinámico.
 */
public class ClicCuandoEsteDisponible implements Interaction {

    private final Target elemento;

    public ClicCuandoEsteDisponible(Target elemento) {
        this.elemento = elemento;
    }

    public static ClicCuandoEsteDisponible en(Target elemento) {
        return instrumented(ClicCuandoEsteDisponible.class, elemento);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(elemento, isClickable()).forNoMoreThan(TIEMPO_ESPERA_SEGUNDOS).seconds(),
                Click.on(elemento)
        );
    }
}
