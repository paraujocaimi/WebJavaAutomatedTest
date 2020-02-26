package elementPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ExampleElementPage {

    @FindBy(xpath="//input[@title='Pesquisar']")
    protected WebElement inputPesquisar;

    @FindBy(xpath="//input[@name='btnK']")
    protected WebElement btnPesquisar;

    @FindBy(xpath="//input[@name='btnI']")
    protected WebElement btnEstouComSorte;

    @FindBy(xpath = "//div[@class='g'][1]/.//a")
    protected WebElement firstSearch;
}
