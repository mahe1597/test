package Modules.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import project.Base.AbstractTestNG;

@CucumberOptions(
		features = "src/test/java/Modules/Features",
		glue = {"Modules/StepDefinitions","project.Hooks"},
		tags = "@TVSearch",
		plugin = {"pretty",
				"html:target/cucumber-reports/cucumber.html",
				"json:target/cucumber-report/cucumber.json" },
		monochrome = false,
		dryRun = false
)

public class TVRunner extends AbstractTestNG {
}
