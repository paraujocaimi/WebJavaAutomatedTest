package utils.environment;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

/*
	@deprecated
	The new class of set Up the environment is SetUpEnvironment
 */
public class OpenApplication {

	private static WebDriver driver;

	public OpenApplication() {
		super();
	}

	public static void openApplication(String browser, String url) {

		if (browser.equals("chrome")) {
			openApplicationChrome(url);
		} else {
			System.err.print("Browser not found!");
		}

	}

	public static WebDriver getDriver() {
		return driver;
	}

	private static void setDriverChrome() {
		System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
	}

	private static void chromeCapabilities(){

	}

	public static void openApplicationChrome(String url) {
		setDriverChrome();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);

	}
	
	public static void closeDriver() {
		driver.close();
	}

}
