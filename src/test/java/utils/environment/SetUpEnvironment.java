package utils.environment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import utils.fileReader.PropertiesFile;

import java.util.Properties;

public class SetUpEnvironment {

    public static WebDriver driver;
    public static String browser;
    public PropertiesFile propertiesFile;
    public Properties prop;

    public static String getBrowser() {
        return browser;
    }

    public static void setBrowser(Properties prop) {
        SetUpEnvironment.browser = prop.getProperty("browser");
    }

    public Properties getProp() {
        return prop;
    }

    public void setProp(PropertiesFile propFile) {
        this.prop = propFile.ReadPropertiesFile();
    }

    public void upApplication(String url){

        setProp(propertiesFile);
        setBrowser(this.prop);

        if (this.browser.equals("chrome")) {
            setChromeDriver(driver);
        } else {
            System.out.println("Navegador não encontrado!");
        }
        openBrowser(url);
    }

    public WebDriver getDriver() {
        return this.driver;
    }

    private void setChromeDriver(WebDriver driver) {
        System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
        this.driver = new ChromeDriver();
    }

    public void openBrowser(String url){
        this.driver.manage().window().maximize();
        this.driver.get(url);
    }

    public void closeDriver(){
        this.driver.close();
    }

}
