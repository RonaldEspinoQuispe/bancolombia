package com.bancolombia.automation.questions;

import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.bancolombia.automation.userinterfaces.DocumentoPage.NOMBRE_DEL_DOCUMENTO;

public class NombreDelDocumento implements Question<String> {

    public static NombreDelDocumento visible() {
        return new NombreDelDocumento();
    }

    @Override
    @Subject("el nombre del documento visualizado")
    public String answeredBy(Actor actor) {
        return NOMBRE_DEL_DOCUMENTO.resolveFor(actor).getText().trim();
    }
}
