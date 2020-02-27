package utils.report;

import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.assertthat.selenium_shutterbug.utils.web.ScrollStrategy;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;
import ru.yandex.qatools.ashot.cropper.indent.IndentCropper;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import utils.environment.SetUpEnvironment;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;

public class TakeScreenshot {

    private TakesScreenshot takesScreenshot;

    private SetUpEnvironment setUpEnvironment = new SetUpEnvironment();
    private WebDriver driver;

    private String filePath = "target\\resources\\screenshot";
    private String compareFilePath = "target\\resources\\compareImage";

    public void takeSnapShot() {
        this.takesScreenshot = ((TakesScreenshot)setUpEnvironment.getDriver());

        File screnFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File file = new File(filePath);
        try {
            FileUtils.copyFileToDirectory(screnFile,file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void takeFullPageScreenshot(String name) {
        driver = setUpEnvironment.getDriver();

        try {
            Shutterbug.shootPage(driver, ScrollStrategy.WHOLE_PAGE).withName(name).save();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void blurTheElement(WebElement element) {
        driver = setUpEnvironment.getDriver();

        try {
            Shutterbug.shootPage(driver, ScrollStrategy.WHOLE_PAGE)
                    .blur(element)
                    .save(filePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void highlightTheElement(WebElement element) {
        driver = setUpEnvironment.getDriver();

        try {
            Shutterbug.shootPage(driver, ScrollStrategy.WHOLE_PAGE)
                    .highlight(element)
                    .save(filePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void highlightWithText(WebElement element, String text) {
        driver = setUpEnvironment.getDriver();

        try {
            Shutterbug.shootPage(driver, ScrollStrategy.WHOLE_PAGE)
                    .highlightWithText(element, Color.blue, 3, text,Color.blue, new Font("SansSerif", Font.BOLD, 20))
                    .save(filePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void imageWithTitle(WebElement element, String title) {
        driver = setUpEnvironment.getDriver();

        try {
            Shutterbug.shootPage(driver, ScrollStrategy.WHOLE_PAGE)
                    .withTitle(title + " - " + new Date())
                    .save(filePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void compareImage() {
        driver = setUpEnvironment.getDriver();
        Screenshot screenshot = null;
        BufferedImage expectedImage = null;
        BufferedImage actualImage = null;

        //take image screenshot
        try {
            screenshot = new AShot().
                    shootingStrategy(ShootingStrategies.viewportPasting(1000)).
                    takeScreenshot(driver);
        }catch (Exception e) {
            e.printStackTrace();
        }

        // read the image to compare
        try {
            expectedImage = ImageIO.read(new File(compareFilePath));
            actualImage = screenshot.getImage();
        }catch (IOException e) {

        }

        // Create ImageDiffer object and call method makeDiff()
        ImageDiffer imgDiff = new ImageDiffer();
        ImageDiff diff = imgDiff.makeDiff(actualImage, expectedImage);

        if (diff.hasDiff() == true) {
            System.out.println("Images are same");
        } else {
            System.out.println("Images are different");
        }
    }


}
