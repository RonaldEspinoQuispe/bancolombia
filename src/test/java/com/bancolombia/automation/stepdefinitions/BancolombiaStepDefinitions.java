package com.bancolombia.automation.stepdefinitions;

import com.bancolombia.automation.interactions.AceptarConsentimiento;
import com.bancolombia.automation.questions.NombreDelDocumento;
import com.bancolombia.automation.questions.UrlActual;
import com.bancolombia.automation.tasks.AbrirPaginaBancolombia;
import com.bancolombia.automation.tasks.AbrirReglamento;
import com.bancolombia.automation.tasks.SeleccionarOpcion;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.actors.OnStage;

import static com.bancolombia.automation.utils.Constantes.DOMINIO_DOCUMENTOS;
import static com.bancolombia.automation.utils.Constantes.NOMBRE_PRODUCTO;
import static com.bancolombia.automation.utils.Constantes.NOMBRE_REGLAMENTO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.containsString;

public class BancolombiaStepDefinitions {

    @Cuando("el usuario ingresa a la pagina de bancolombia")
    public void elUsuarioIngresaALaPaginaDeBancolombia() {
        OnStage.theActorCalled("Usuario")
                .attemptsTo(
                        AbrirPaginaBancolombia.paginaPersonas()
                );
    }

    @Y("el usuario selecciona aceptar todo del aviso visible")
    public void elUsuarioSeleccionaAceptarTodoDelAvisoVisible() {
        theActorInTheSpotlight().attemptsTo(AceptarConsentimiento.deCookies());
    }

    @Y("el usuario selecciona la opcion personas")
    public void elUsuarioSeleccionaLaOpcionPersonas() {
        theActorInTheSpotlight().attemptsTo(SeleccionarOpcion.personas());
    }

    @Y("el usuario selecciona la opcion productos y servicios")
    public void elUsuarioSeleccionaLaOpcionProductosYServicios() {
        theActorInTheSpotlight().attemptsTo(SeleccionarOpcion.productosYServicios());
    }

    @Y("el usuario selecciona la opcion inversiones")
    public void elUsuarioSeleccionaLaOpcionInversiones() {
        theActorInTheSpotlight().attemptsTo(SeleccionarOpcion.inversiones());
    }

    @Y("el usuario selecciona la opcion productos digitales de inversion")
    public void elUsuarioSeleccionaLaOpcionProductosDigitalesDeInversion() {
        theActorInTheSpotlight().attemptsTo(SeleccionarOpcion.productosDigitalesDeInversion());
    }

    @Y("el usuario selecciona la opcion inversion virtual")
    public void elUsuarioSeleccionaLaOpcionInversionVirtual() {
        theActorInTheSpotlight().attemptsTo(SeleccionarOpcion.inversionVirtual());
    }

    @Y("el usuario abre el reglamento")
    public void elUsuarioAbreElReglamento() {
        theActorInTheSpotlight().attemptsTo(AbrirReglamento.deInversionVirtual());
    }

    @Entonces("visualiza el documento esperado")
    public void visualizaElDocumentoEsperado() {
        theActorInTheSpotlight().should(
                seeThat(UrlActual.delNavegador(), containsString(DOMINIO_DOCUMENTOS)),
                seeThat(NombreDelDocumento.visible(),
                        allOf(containsString(NOMBRE_REGLAMENTO), containsString(NOMBRE_PRODUCTO)))
        );
    }
}
