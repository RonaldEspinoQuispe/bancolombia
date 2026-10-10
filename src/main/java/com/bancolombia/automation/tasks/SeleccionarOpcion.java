package com.bancolombia.automation.tasks;

import com.bancolombia.automation.interactions.ClicCuandoEsteDisponible;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import static com.bancolombia.automation.userinterfaces.HomePage.MENU_PRODUCTOS_Y_SERVICIOS;
import static com.bancolombia.automation.userinterfaces.HomePage.OPCION_INVERSIONES;
import static com.bancolombia.automation.userinterfaces.HomePage.OPCION_PERSONAS;
import static com.bancolombia.automation.userinterfaces.InversionesPage.ENLACE_INVERSION_VIRTUAL;
import static com.bancolombia.automation.userinterfaces.InversionesPage.PESTANA_PRODUCTOS_DIGITALES;

/**
 * Tareas de navegación con nombre de negocio. Cada método corresponde a un paso del feature.
 */
public class SeleccionarOpcion {

    public static Performable personas() {
        return Task.where("{0} selecciona la opción Personas",
                ClicCuandoEsteDisponible.en(OPCION_PERSONAS));
    }

    public static Performable productosYServicios() {
        return Task.where("{0} selecciona la opción Productos y Servicios",
                ClicCuandoEsteDisponible.en(MENU_PRODUCTOS_Y_SERVICIOS));
    }

    public static Performable inversiones() {
        return Task.where("{0} selecciona la opción Inversiones",
                ClicCuandoEsteDisponible.en(OPCION_INVERSIONES));
    }

    public static Performable productosDigitalesDeInversion() {
        return Task.where("{0} selecciona la opción Productos digitales de inversión",
                ClicCuandoEsteDisponible.en(PESTANA_PRODUCTOS_DIGITALES));
    }

    public static Performable inversionVirtual() {
        return Task.where("{0} selecciona la opción Inversión virtual",
                ClicCuandoEsteDisponible.en(ENLACE_INVERSION_VIRTUAL));
    }

    private SeleccionarOpcion() {
    }
}
