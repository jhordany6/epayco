package org.example.userinterfaces.pragma;

import co.com.devco.automation.mobile.locator.Locator;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.devco.automation.mobile.locator.ElementFinder.theElementBy;
import static co.com.devco.automation.mobile.locator.Locator.locator;

public class loginPage {

    public static final Locator BTN_INGRESA_LOCATOR = locator().withAndroidXpathStatic("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[2]/android.widget.Button").withIosAccesibilityId("1");
    public static final Target BTN_INGRESA = Target.the("Boton de ingresa desde el carrusel").located(theElementBy(BTN_INGRESA_LOCATOR));

    public static final Locator INP_CORREO_LOCATOR = locator().withAndroidClassName("android.widget.EditText").withIosAccesibilityId("1");
    public static final Target INP_CORREO = Target.the("Input de correo").located(theElementBy(INP_CORREO_LOCATOR));

    public static final Locator INP_CONTRASENA_LOCATOR = locator().withAndroidXpathStatic("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.EditText[2]").withIosAccesibilityId("1");
    public static final Target INP_CONTRASENA = Target.the("Input de contrasena").located(theElementBy(INP_CONTRASENA_LOCATOR));



    private loginPage() {
        throw new IllegalStateException("user interface class");
    }
}
