package project.Base;

import java.io.IOException;
import java.text.ParseException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.*;


public class TestBase {
	public static WebDriver driver;
	public static ThreadLocal<String> SystemPath = new ThreadLocal<String>();
	public static ThreadLocal<String> URL = new ThreadLocal<String>();

	@BeforeSuite
	public void beforeSuiteInitializer() throws IOException, ParseException, InterruptedException {
		SystemPath.set(System.getProperty("user.dir")+"/drivers/chromedriver.exe");
	}

	@BeforeTest
	public void initializer(){
		URL.set("https://www.amazon.in/");
	}

	@BeforeClass(alwaysRun = true)
	public static void launchDriver(ITestContext iTestResult) throws Exception {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL.get());
	}

	@AfterSuite()
	public static synchronized void tearDown(ITestContext iTestContext) {
		driver.quit();
	}

}
