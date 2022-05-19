package Modules.StepDefinitions;

import project.Base.TestBase;
import Modules.POM.Home;
import io.cucumber.java.en.And;

public class HomePage {
	public Home home;

	public HomePage(){
		home = new Home();
	}
	@And("^Open the Browser and Site is launched$")
	public void Open_the_Browser_and_Site_is_launched() throws Exception {
		home.btnClick();
	}

	@And("^Print$")
	public void print() throws Exception {
		System.out.println("Printed");
	}

}
