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

	@Given("^acess the page \"(.*)\"$")
	public void acessPage(String url) {
		examplePage.setClasse(url);
	}

	@When("^search about \"(.*)\"$")
	public void given(String search) {
		examplePage.search(search);
	}

	@Then("^click in the first search$")
	public void clickFirstSearch(){
		examplePage.clickFirstSearch();
	}
}
