package project.Utility;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import project.Base.TestBase;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class UtilsManager extends TestBase {

	static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	public static void click(By by) {
		wait.until(ExpectedConditions.elementToBeClickable(by)).click();
	}

	public static void scrollDownToElementAndClick(By by) {
		WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(by));
		Actions ac= new Actions(driver);
		ac.moveToElement(ele).build().perform();
		wait.until(ExpectedConditions.elementToBeClickable(by)).click();
	}

	public static void displayCheckOfElement(By by) {
		scrollDownToElementAndClick(by);
		Assert.assertEquals(wait.until(ExpectedConditions.presenceOfElementLocated(by)).isDisplayed(),true);
	}

	public static byte[] screenshot() throws IOException {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		byte[] fileContent = FileUtils.readFileToByteArray(src);
		return fileContent;
	}
}
