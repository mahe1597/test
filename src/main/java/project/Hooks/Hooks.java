package project.Hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;

public class Hooks {


    @BeforeStep
    public void BeforeSteps() {

    }

    @Before
    public synchronized void beforeScenario(Scenario scenario) throws Exception {

    }

    @After
    public synchronized void afterScenario(Scenario scenario) throws Exception {
        if (scenario.getStatus() == Status.PASSED) {

        } else {

        }

    }

}