package step;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import page.ExamplePage;

public class ExampleSteps {

	private static WebDriver driver;
	ExamplePage examplePage = new ExamplePage();

	@Given("^acesso a pagina \"(.*)\"$")
	public void given(String url) {
		examplePage.setClasse(url);
	}
}
