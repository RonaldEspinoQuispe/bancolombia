package com.bancolombia.automation.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InversionesPage {

    public static final Target PESTANA_PRODUCTOS_DIGITALES = Target.the("pestaña Productos digitales de inversión")
            .located(By.xpath("//li[contains(@class,'bc-tab')][contains(normalize-space(),'Productos digitales de inversión')]"));

    public static final Target ENLACE_INVERSION_VIRTUAL = Target.the("enlace 'Conocer más' de la tarjeta Inversión virtual")
            .located(By.xpath("//h3[normalize-space()='Inversión virtual']"
                    + "/ancestor::div[contains(@class,'swiper-slide')]"
                    + "//a[@data-testid='ml-card-actions-link']"));

    private InversionesPage() {
    }
}
