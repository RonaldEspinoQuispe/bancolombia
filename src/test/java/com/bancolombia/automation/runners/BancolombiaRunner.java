package com.bancolombia.automation.runners;

import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.bancolombia.automation.stepdefinitions",
        tags = "@bancolombia",
        plugin = {"pretty"}
)
public class BancolombiaRunner {
}