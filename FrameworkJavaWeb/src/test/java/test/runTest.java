package test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

// https://testingneeds.wordpress.com/2015/09/15/junit-runner-with-cucumberoptions/
@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:target/cucumber", "json:target/cucumber.json",
		"junit:target/cucumber.xml" }, tags = {
				"@SmokeTest" }, strict = true, features = "src/test/resource/feature", glue = { "classpath:step"}, monochrome = true, dryRun = false)

public class runTest {
}