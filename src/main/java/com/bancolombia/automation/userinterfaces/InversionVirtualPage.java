package com.bancolombia.automation.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InversionVirtualPage {

    public static final Target ENLACE_REGLAMENTO = Target.the("enlace Reglamento")
            .located(By.cssSelector("a[data-testid='ml-card-actions-link'][aria-label='Reglamento']"));

    private InversionVirtualPage() {
    }
}
