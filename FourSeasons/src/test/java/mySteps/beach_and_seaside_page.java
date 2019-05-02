package mySteps;

import cucumber.api.java.en.And;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class beach_and_seaside_page extends AbstractPageStepDefs {

    WebDriver driver = getDriver();

    @And("^I select the beach & seaside style$")
    public void iSelectTheBeachSeasideStyle() {
        driver.navigate().to("https://www.fourseasons.com/privateretreats/explore/#beach-seaside");
    }
    @And("^I begin to browse the page$")
    public void iBeginToBrowseThePage()throws Throwable {
        Thread.sleep(400);
        ((JavascriptExecutor)driver).executeScript("scroll(0,100)");

        ((JavascriptExecutor)driver).executeScript("scroll(0,250)");

        ((JavascriptExecutor)driver).executeScript("scroll(0,400)");

        Thread.sleep(800);
        ((JavascriptExecutor)driver).executeScript("scroll(0,550)");

        ((JavascriptExecutor)driver).executeScript("scroll(0,700)");

        ((JavascriptExecutor)driver).executeScript("scroll(0,850)");

        Thread.sleep(800);
        ((JavascriptExecutor)driver).executeScript("scroll(0,1000)");

        ((JavascriptExecutor)driver).executeScript("scroll(0,1150)");

        ((JavascriptExecutor)driver).executeScript("scroll(0,1300)");

        Thread.sleep(800);
        ((JavascriptExecutor)driver).executeScript("scroll(0,1450)");

        ((JavascriptExecutor)driver).executeScript("scroll(0,1600)");

        ((JavascriptExecutor)driver).executeScript("scroll(0,1750)");

        Thread.sleep(800);
        ((JavascriptExecutor)driver).executeScript("scroll(0,1900)");

        ((JavascriptExecutor)driver).executeScript("scroll(0,2050)");
    }
}
