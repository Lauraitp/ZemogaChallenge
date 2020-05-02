package com.zemoga.technicalchallenge.runners;

import static cucumber.api.SnippetType.CAMELCASE;
import org.junit.runner.RunWith;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import cucumber.api.CucumberOptions;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(monochrome=true,
features = "src/test/resources/features/carnival.feature",
glue = {"com.zemoga.technicalchallenge.stepdefinitions"},
snippets = CAMELCASE)


public class Carnival {

}
