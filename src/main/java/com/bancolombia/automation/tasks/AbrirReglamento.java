package com.bancolombia.automation.tasks;

import com.bancolombia.automation.interactions.ClicCuandoEsteDisponible;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import com.bancolombia.automation.interactions.CambiarALaPestanaNueva;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.bancolombia.automation.userinterfaces.DocumentoPage.NOMBRE_DEL_DOCUMENTO;
import static com.bancolombia.automation.userinterfaces.InversionVirtualPage.ENLACE_REGLAMENTO;
import static com.bancolombia.automation.utils.Constantes.TIEMPO_ESPERA_SEGUNDOS;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

/**
 * El enlace del reglamento tiene target="_blank": abre el documento en una pestaña nueva,
 * así que después del clic el actor cambia a esa pestaña y espera a que cargue.
 */
public class AbrirReglamento implements Task {

    public static AbrirReglamento deInversionVirtual() {
        return instrumented(AbrirReglamento.class);
    }

    @Override
    @Step("{0} abre el reglamento de Inversión virtual")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ClicCuandoEsteDisponible.en(ENLACE_REGLAMENTO),
                CambiarALaPestanaNueva.abierta(),
                WaitUntil.the(NOMBRE_DEL_DOCUMENTO, isVisible()).forNoMoreThan(TIEMPO_ESPERA_SEGUNDOS).seconds()
        );
    }
}
