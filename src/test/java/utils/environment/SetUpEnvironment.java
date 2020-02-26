package utils.environment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.fileReader.PropertiesFile;

import java.io.IOException;
import java.util.Properties;

public class setUp {

    public static WebDriver driver;
    public static String browser;
    public static Properties prop;

    public Properties getProp() {
        return prop;
    }

    public void setProp(Properties prop) {
        this.prop = new PropertiesFile().ReadPropertiesFile();
    }

    public void upApplication(String url){

        browser  = this.getProp().getProperty("browser");

        if (browser.equals("chrome")) {
            setChromeDriver(driver);
        } else {
            System.out.println("Navegador não encontrado!");
        }
        openBrowser(url);
    }

    public static WebDriver getDriver() {
        return driver;
    }

    private static void setChromeDriver(WebDriver driver) {
        System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
        setUp.driver = new ChromeDriver();
    }

    public static void openBrowser(String url){
        driver.manage().window().maximize();
        driver.get(url);
    }

}
