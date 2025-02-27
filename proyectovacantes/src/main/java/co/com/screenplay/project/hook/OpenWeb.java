package co.com.screenplay.project.hook;

import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.ThucydidesSystemProperty;
import net.thucydides.core.util.EnvironmentVariables;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenWeb implements Task {

    private EnvironmentVariables environmentVariables;

    @Override
    public <T extends Actor> void performAs(T actor) {
        String pathWebURL = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(ThucydidesSystemProperty.WEBDRIVER_BASE_URL);

        actor.attemptsTo(Open.url(pathWebURL));
    }

    public static Performable broserURL() {
        return instrumented(OpenWeb.class);
    }
}
