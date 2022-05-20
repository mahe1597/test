package Modules.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import project.Base.AbstractTestNG;

@CucumberOptions(
		features = "src/test/java/Modules/Features",
		glue = {"Modules/StepDefinitions","project.Hooks"},
		tags = "@TVSearch",
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/" },
		monochrome = false,
		dryRun = false
)

public class TVRunner extends AbstractTestNG {
}
