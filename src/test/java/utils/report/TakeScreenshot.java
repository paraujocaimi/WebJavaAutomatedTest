package utils.report;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.cropper.indent.IndentCropper;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import utils.environment.SetUpEnvironment;

import javax.imageio.ImageIO;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;

public class TakeScreenshot {

    TakesScreenshot screenshot;
    WebDriver driver;
    SetUpEnvironment setUpEnvironment = new SetUpEnvironment();
    String filPath = "src\\test\\resources\\img";

    public void takeScreenShot() {
        this.screenshot = ((TakesScreenshot)setUpEnvironment.getDriver());

        File screnFile = screenshot.getScreenshotAs(OutputType.FILE);
        File filePath = new File(filPath);
        try {
            FileUtils.copyFileToDirectory(screnFile,filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void takeFullPageScreenshot() throws IOException {
        Screenshot screenshot = new AShot()
                .shootingStrategy(ShootingStrategies.viewportPasting(100))
                .takeScreenshot(setUpEnvironment.getDriver());

        ImageIO.write((RenderedImage) screenshot, "jpg", new File(filPath));

    }

    public void captureElement(WebElement element){
        new AShot()
                .takeScreenshot(setUpEnvironment.getDriver(), element);
    }


}
