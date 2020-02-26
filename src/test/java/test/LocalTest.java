package test;

import org.junit.After;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

// https://testingneeds.wordpress.com/2015/09/15/junit-runner-with-cucumberoptions/
@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:target/cucumber-report", "json:target/cucumber.json",
        "junit:target/cucumber.xml" },
        tags = {"@Test" }, strict = true, features = "src/test/resources/feature", glue = { "classpath:step"}, monochrome = true, dryRun = false)

public class LocalTest {


}