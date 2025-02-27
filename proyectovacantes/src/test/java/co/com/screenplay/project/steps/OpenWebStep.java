package co.com.screenplay.project.steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class OpenWebStep {
    @Before
    public void setTheStage(){OnStage.setTheStage(new OnlineCast());}

    @Given("{string} abre el sitio web")
    public void openTheTestWebSite(String actor) {
    }

    @When("ingresa al sitio con el navegador Edge")
    public void enterEdgeBrowser() {
    }

    @Then("visualizara el login de la pagina")
    public void willDisplayThePageLogin() {
    }
}
