package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Waits {
    WebDriver driver;


    public void implicitWait(int time){
        driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
    }

    public void explicitWait(int time, String element){
        new WebDriverWait(driver, time).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(element)));
    }

    public void alertIsPresent(int time){
        new WebDriverWait(driver, time).until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }


}
