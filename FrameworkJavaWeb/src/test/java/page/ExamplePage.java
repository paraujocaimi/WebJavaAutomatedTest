package page;

import elementPage.ExampleElementPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.OpenApplication;

public class ExamplePage extends ExampleElementPage {

    WebDriver driver;

    public void setClasse(String url) {
        OpenApplication.openApplication("chrome", url);
        PageFactory.initElements(OpenApplication.getDriver(), this);
        driver = OpenApplication.getDriver();
    }

}
