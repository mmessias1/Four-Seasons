package mySteps;

import cucumber.api.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class vietnam_page extends AbstractPageStepDefs {

    WebDriver driver = getDriver();

    @And("^I also notice Vietnam so I select it's property details$")
    public void iAlsoNoticeVietnamSoISelectItSPropertyDetails() throws Throwable {

        driver = new ChromeDriver();
        driver.navigate().to("https://www.fourseasons.com/hoian/privateretreats/");

        Thread.sleep(400);
        ((JavascriptExecutor) driver).executeScript("scroll(0,200)");
        Thread.sleep(300);
        ((JavascriptExecutor) driver).executeScript("scroll(0,400)");
        Thread.sleep(300);
        ((JavascriptExecutor) driver).executeScript("scroll(0,800)");
        Thread.sleep(300);
        ((JavascriptExecutor) driver).executeScript("scroll(0,1000)");
        Thread.sleep(300);
        ((JavascriptExecutor) driver).executeScript("scroll(0,1200)");
        Thread.sleep(300);
        ((JavascriptExecutor) driver).executeScript("scroll(0,1400)");
        Thread.sleep(300);
        ((JavascriptExecutor) driver).executeScript("scroll(0,1800)");
        Thread.sleep(300);
        ((JavascriptExecutor) driver).executeScript("scroll(0,2000)");
        Thread.sleep(300);
        ((JavascriptExecutor) driver).executeScript("scroll(0,2200)");

        Thread.sleep(400);
        ((JavascriptExecutor) driver).executeScript("scroll(20000,0)");

        driver.close();
    }
}
