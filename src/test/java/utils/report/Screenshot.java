package utils.report;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utils.environment.SetUpEnvironment;

import java.io.File;
import java.io.IOException;

public class Screenshot {

    TakesScreenshot screenshot;
    WebDriver driver;
    SetUpEnvironment setUpEnvironment = new SetUpEnvironment();

    public void takeScreenShot() {

        driver = setUpEnvironment.getDriver();
        this.screenshot = ((TakesScreenshot)driver);

        File screnFile = screenshot.getScreenshotAs(OutputType.FILE);
        File filePath = new File("src/test/resources/img");
        try {
            FileUtils.copyFileToDirectory(screnFile,filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
