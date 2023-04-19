package org.example.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.example.utils.Time;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.example.userinterfaces.pragma.loginPage.*;

public class Login implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        Time.getTimeFive();
        Time.getTimeFive();
        actor.attemptsTo(Click.on(BTN_INGRESA));
        actor.attemptsTo(Enter.keyValues("holamundo").into(INP_CORREO),
                (Enter.keyValues("hola").into(INP_CONTRASENA))
                );
        Time.getTimeFive();
        Time.getTimeFive();
    }

    public static Performable login() {
        return instrumented(Login.class);
    }

}
