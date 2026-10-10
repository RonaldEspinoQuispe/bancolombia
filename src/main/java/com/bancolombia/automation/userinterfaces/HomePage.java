package com.bancolombia.automation.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {

    public static final Target BOTON_ACEPTAR_TODO = Target.the("botón 'Aceptar todo' del aviso de cookies")
            .located(By.id("acceptCookies"));

    public static final Target OPCION_PERSONAS = Target.the("opción Personas del encabezado")
            .located(By.id("header-personas"));

    public static final Target MENU_PRODUCTOS_Y_SERVICIOS = Target.the("menú Productos y Servicios")
            .located(By.id("menu-productos"));

    public static final Target OPCION_INVERSIONES = Target.the("opción Inversiones del menú")
            .located(By.id("header-productos-inversiones"));

    private HomePage() {
    }
}
