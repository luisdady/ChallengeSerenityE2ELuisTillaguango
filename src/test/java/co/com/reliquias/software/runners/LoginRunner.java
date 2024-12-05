package co.com.reliquias.software.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import  org.junit.runner.RunWith;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/search/Loging/Autenticacion.feature",
        glue="co.com.reliquias.software.glue",
        snippets= CucumberOptions.SnippetType.CAMELCASE,
        plugin="pretty",
        tags=" @InicioSesionExitoso"
)



public class LoginRunner {
}
