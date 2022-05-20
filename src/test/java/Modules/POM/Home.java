package Modules.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.Assertion;
import project.Base.TestBase;
import project.Utility.UtilsManager;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class Home extends TestBase {


    public Home() {
        this.driver = driver;
    }

    By btn_HamburgerMenu = By.id("nav-hamburger-menu");
    By txt_TvAppliancesElectronics = By.xpath(".//div[contains(text(),'TV, Appliances, Electronics')]");
    By lnk_Television = By.xpath(".//a[contains(@href,'television')]");
    By lnk_Samsung = By.xpath(".//span[@class='a-list-item']/a[contains(@href,'Samsung')]");
    By btn_SortBy = By.id("a-autoid-0-announce");
    By select_PriceHighToLow = By.id("s-result-sort-select_2");
    By select_2_HighPriceProduct = By.xpath("(.//*[@data-component-type='s-search-result'])[2]");

    By txt_AboutThisItem = By.xpath(".//div[@id='feature-bullets']/h1");
    By txt_AllTextAboutThisItem = By.xpath(".//div[@id='feature-bullets']/ul/li/span");

    public void validatingTheHomePageTitle() throws Exception {
        String title = driver.getTitle();
        Assert.assertEquals(title, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
    }

    public void clickOnHamburgerMenu() throws Exception {
        UtilsManager.click(btn_HamburgerMenu);
    }

    public void clickOnTvAppliancesElectronics() throws Exception {
        UtilsManager.scrollDownToElementAndClick(txt_TvAppliancesElectronics);
    }

    public void clickOnTelevision() throws Exception {
        UtilsManager.scrollDownToElementAndClick(lnk_Television);
    }

    public void clickOnSamsung() throws Exception {
        UtilsManager.scrollDownToElementAndClick(lnk_Samsung);
    }

    public void clickOnSortBy_Price_HighToLow() throws Exception {
        UtilsManager.click(btn_SortBy);
        UtilsManager.click(select_PriceHighToLow);
    }

    public void clickOnSecondHighPriceProduce() throws Exception {
        UtilsManager.click(select_2_HighPriceProduct);
    }

    public void switchToWindowProductWindow() throws Exception {
        String parentWindow = driver.getWindowHandle();
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> iterator = windows.iterator();

        while (iterator.hasNext()) {
            String ChildWindow = iterator.next();
            if (!parentWindow.equalsIgnoreCase(ChildWindow)) {
                driver.switchTo().window(ChildWindow);
            }
        }
    }

    public void ValidateAboutThisItem(){
        UtilsManager.displayCheckOfElement(txt_AboutThisItem);
        List<WebElement> ls= driver.findElements(txt_AllTextAboutThisItem);
        for(int i=0;i<ls.size();i++){
           System.out.println(ls.get(i).getText());
        }
    }



}
