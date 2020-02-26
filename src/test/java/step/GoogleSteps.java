package step;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import page.GooglePage;
import utils.environment.SetUpEnvironment;

public class GoogleSteps {

	public WebDriver driver;
	GooglePage examplePage = new GooglePage();
	SetUpEnvironment setUpEnvironment = new SetUpEnvironment();

	@Given("^acess the page \"(.*)\"$")
	public void acessPage(String url) {
		examplePage.initTest(url);
	}

	@When("^search about \"(.*)\"$")
	public void given(String search) {
		Assert.assertTrue("Isn't search",examplePage.search(search));
	}

	@And("^click to search$")
	public void clcikToSearch(){
		Assert.assertTrue("Isn't click on search button", examplePage.clickToSearch());
	}

	@And("^click in the first search$")
	public void clickFirstSearch(){
		Assert.assertTrue("Didn't click in the first search", examplePage.clickFirstSearch());
	}

	@And("^close application$")
	public void closeDriver(){ setUpEnvironment.closeDriver();}

}
