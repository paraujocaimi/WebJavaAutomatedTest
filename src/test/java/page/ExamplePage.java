package page;

import elementPage.ExampleElementPage;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import utils.OpenApplication;

import java.security.Key;

public class ExamplePage extends ExampleElementPage {

    WebDriver driver;

    public void setClasse(String url) {
        OpenApplication.openApplication("chrome", url);
        PageFactory.initElements(OpenApplication.getDriver(), this);
        driver = OpenApplication.getDriver();
    }

    public void search(String search) {

        try {
            inputPesquisar.sendKeys(search);
            Actions actions = new Actions(driver);
            actions.sendKeys(Keys.TAB).perform();
            btnPesquisar.click();
        }catch (ElementClickInterceptedException e) {
                e.printStackTrace();
                System.out.println("Não foi possível clicar");
        }catch (ElementNotInteractableException e) {
            e.printStackTrace();
            System.out.println("Elemento não visivel na tela");
        } catch(Exception e) {
            e.printStackTrace();
            System.out.println("Exception");
        }

    }

    public void clickFirstSearch(){
        firstSearch.click();
    }

}
