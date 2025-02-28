package co.com.screenplay.project.steps.hook;

import co.com.screenplay.project.hook.OpenWeb;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import static co.com.screenplay.project.utils.Constants.*;
import static co.com.screenplay.project.utils.Time.waiting;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Hook {
    private static WebDriver driver;

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
        setupEdgeDriver(); // 🔹 Llamamos al método que inicializa Edge
    }

    private void setupEdgeDriver() {
        System.setProperty("webdriver.edge.driver", "proyectovacantes/msedgedriver.exe/msedgedriver.exe"); // 🔹 Ruta del driver
        driver = new EdgeDriver();
        driver.manage().window().maximize();
    }

    @Given("{string} abre el sitio web")
    public void openTheTestWebSite(String actor) {
        OnStage.theActorCalled(actor).attemptsTo(
        OpenWeb.broserURL(BASE_URL));
        waiting(TIME_SHORT);
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                        TheWebPage.title(),
                        Matchers.containsString(TITLE)
                )
        );
    }


}
