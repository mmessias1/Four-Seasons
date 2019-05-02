package mySteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class home_page extends AbstractPageStepDefs{

    WebDriver driver = getDriver();

    @Given("^I want a quick getaway, I navigate to the four seasons website$")
    public void iWantAQuickGetawayINavigateToTheFourSeasonsWebsite() {
        driver.get("https://www.fourseasons.com/");
        driver.findElement(By.xpath("//a[@id='GdprCookieBannerAccept']")).click();
    }

    @When("^I get to the homepage, I see private retreats$")
    public void iGetToTheHomepageISeePrivateRetreats() {
        //test 1
        String actual_tab = driver.findElement(By.xpath("//a[contains(text(),'Private Retreats')]")).getText();
        String expected_tab = "Private Retreats";
        if (actual_tab.equalsIgnoreCase(expected_tab)){System.out.println("Test 1 complete");}
        else {System.out.println("Test failed");}
    }
}
