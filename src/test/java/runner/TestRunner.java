package runner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "C:\\Users\\raghu\\eclipse-workspace\\CuumberSetup\\src\\test\\resources\\Features\\background.feature",
		glue = {"stepDefinition"},
		plugin = {"pretty", "html:target/cucumber-reports/report.HTML",},
		monochrome = true,
		tags= "@Regression"
		)


  public class TestRunner {

  }
