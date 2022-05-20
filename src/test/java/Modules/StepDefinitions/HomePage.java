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
		home.validatingTheHomePageTitle();
	}

	@And("^click on the hamburger menu in the top left corner$")
	public void clickOnHamburgerMenu() throws Exception {
		home.clickOnHamburgerMenu();
	}

	@And("^scroll down and then click on the TV,Appliances and Electronics link under Shop by Department section$")
	public void clickOnTvAppliancesElectronics() throws Exception {
		home.clickOnTvAppliancesElectronics();
	}

	@And("^click on Televisions under Tv,Audio & Cameras sub section$")
	public void clickOnTelevision() throws Exception {
		home.clickOnTelevision();
	}

	@And("^scroll down and filter the results by Brand Samsung$")
	public void clickOnSamsung() throws Exception {
		home.clickOnSamsung();
	}

	@And("^Sort the Samsung results with price High to Low$")
	public void clickOnSortBy_Price_HighToLow() throws Exception {
		home.clickOnSortBy_Price_HighToLow();
	}

	@And("^Click on the second highest priced item$")
	public void clickOnSecondHighPriceProduce() throws Exception {
		home.clickOnSecondHighPriceProduce();
	}

	@And("^Switch the Window and Validate the about this item$")
	public void ValidateAboutThisItem() throws Exception {
		home.switchToWindowProductWindow();
		home.ValidateAboutThisItem();
	}


}
