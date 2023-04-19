package org.example.stepdefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import org.example.tasks.Login;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
public class Epayco {


    @Dado("^que \"([^\"]*)\" quiere iniciar pruebas en epayco$")
    public void queQuiereIniciarPruebasEnEpayco(String actor) {
        theActorCalled(actor).entersTheScene();
        theActorInTheSpotlight().attemptsTo(Login.login());

     }

}