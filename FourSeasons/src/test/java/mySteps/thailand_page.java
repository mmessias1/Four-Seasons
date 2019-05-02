package mySteps;

import cucumber.api.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class thailand_page extends AbstractPageStepDefs {

    WebDriver driver = getDriver();

    @And("^I also notice Thailand so I select it's property details$")
    public void iAlsoNoticeThailandSoISelectItSPropertyDetails() throws Throwable {

        driver = new ChromeDriver();
        driver.navigate().to("https://www.fourseasons.com/kohsamui/privateretreats/");

        Thread.sleep(400);
        ((JavascriptExecutor)driver).executeScript("scroll(0,200)");
        Thread.sleep(200);
        ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
        Thread.sleep(200);
        ((JavascriptExecutor)driver).executeScript("scroll(0,800)");
        Thread.sleep(200);
        ((JavascriptExecutor)driver).executeScript("scroll(0,1000)");
        Thread.sleep(200);
        ((JavascriptExecutor)driver).executeScript("scroll(0,1200)");
        Thread.sleep(200);
        ((JavascriptExecutor)driver).executeScript("scroll(10000,0)");

        driver.close();
    }
}
