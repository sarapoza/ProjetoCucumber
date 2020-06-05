package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Features",
		glue = "StepDefs",
		plugin = "pretty", monochrome = true, snippets = SnippetType.CAMELCASE, dryRun = false, strict = false,
		tags = "~@ignore")

public class Runner {	

}
