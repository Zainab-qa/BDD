package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\zaina\\eclipse-workspace\\BehaviourDrivenDevelopment\\src\\main\\java\\Features\\tagging.feature",
		glue = {"stepDefinitions"},
		format= {"pretty","html:test-ouout","json:json-output/cucumber.json","junit:junit-xml/cucumber.xml"},
		dryRun = false,
		monochrome = true,
		strict = true,
		tags = {"~@End2End", "@RegressionTest"}
		)


//OR: tags = {"@SmokeTest, @Regression"}--  comma separated
//AND tags = {"@SmokeTest","@Regression"}
//Ignore specific tagged test cases  use tilda
public class TestRunner {
	

}
