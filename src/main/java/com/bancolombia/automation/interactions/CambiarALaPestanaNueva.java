package com.bancolombia.automation.interactions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Switch;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.bancolombia.automation.utils.Constantes.TIEMPO_ESPERA_SEGUNDOS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

/**
 * Switch.toNewWindow() no hace nada si la pestaña todavía no existe,
 * así que primero se espera a que el navegador tenga dos pestañas abiertas.
 */
public class CambiarALaPestanaNueva implements Interaction {

    public static CambiarALaPestanaNueva abierta() {
        return instrumented(CambiarALaPestanaNueva.class);
    }

    @Override
    @Step("{0} cambia a la pestaña nueva")
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        new WebDriverWait(driver, Duration.ofSeconds(TIEMPO_ESPERA_SEGUNDOS))
                .until(ExpectedConditions.numberOfWindowsToBe(2));
        actor.attemptsTo(Switch.toNewWindow());
    }
}
