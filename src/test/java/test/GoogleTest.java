package test;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.openqa.selenium.WebDriver;
import utils.environment.OpenApplication;
import utils.environment.SetUpEnvironment;

// https://testingneeds.wordpress.com/2015/09/15/junit-runner-with-cucumberoptions/
@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:target/cucumber-report", "json:target/cucumber-json/cucumber.json",
        "junit:target/cucumber.xml" },
        tags = {"@GoogleTest" }, strict = true, features = "src/test/resources/feature", glue = { "classpath:step"}, monochrome = true, dryRun = false)

public class GoogleTest {


}