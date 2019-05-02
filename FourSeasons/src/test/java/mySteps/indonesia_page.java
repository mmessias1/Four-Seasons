package mySteps;

import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class indonesia_page extends AbstractPageStepDefs {

    WebDriver driver = getDriver();

    @When("^I notice Indonesia I select it's property details$")
    public void iNoticeIndonesiaISelectItSPropertyDetails() throws Throwable {

        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.navigate().to("https://www.fourseasons.com/jimbaranbay/privateretreats/");

        Thread.sleep(400);
        ((JavascriptExecutor)driver).executeScript("scroll(0,200)");
        Thread.sleep(300);
        ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
        Thread.sleep(300);
        ((JavascriptExecutor)driver).executeScript("scroll(0,800)");
        Thread.sleep(300);
        ((JavascriptExecutor)driver).executeScript("scroll(0,1000)");
        Thread.sleep(300);
        ((JavascriptExecutor)driver).executeScript("scroll(0,1200)");
        Thread.sleep(300);
        ((JavascriptExecutor)driver).executeScript("scroll(0,1400)");
        Thread.sleep(300);
        ((JavascriptExecutor)driver).executeScript("scroll(0,1800)");
        Thread.sleep(300);
        ((JavascriptExecutor)driver).executeScript("scroll(0,2000)");
        Thread.sleep(300);
        ((JavascriptExecutor)driver).executeScript("scroll(0,2200)");

        Thread.sleep(400);
        ((JavascriptExecutor)driver).executeScript("scroll(20000,0)");

        driver.close();
    }
}
