package Modules.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import project.Base.TestBase;

public class Home extends TestBase {


    public Home() {
        this.driver = driver;
    }

    By btn = By.xpath("abc");

    public void btnClick() throws Exception {
        driver.findElement(btn);
    }

}
