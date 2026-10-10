package com.bancolombia.automation.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DocumentoPage {

    public static final Target NOMBRE_DEL_DOCUMENTO = Target.the("nombre del documento compartido")
            .located(By.cssSelector("[data-test-id='shared-assets-filename']"));

    private DocumentoPage() {
    }
}
