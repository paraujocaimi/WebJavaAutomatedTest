package elementPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleElementPage {

    @FindBy(xpath="//input[@title='Pesquisar']")
    protected WebElement inputPesquisar;

    @FindBy(xpath="//div[@class='FPdoLc tfB0Bf']/center/input[@name='btnK']")
    protected WebElement btnPesquisar;

    @FindBy(xpath="//div[@class='FPdoLc tfB0Bf']/center/input[@name='btnI']")
    protected WebElement btnEstouComSorte;

    @FindBy(xpath = "//div[@class='g'][1]/.//a")
    protected WebElement firstSearch;
}
