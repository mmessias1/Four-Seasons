package mySteps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class private_retreats_page extends AbstractPageStepDefs{

    WebDriver driver = getDriver();

    @And("^I like the sound of this so I click the link$")
    public void iLikeTheSoundOfThisSoIClickTheLink() throws Throwable {
        Thread.sleep(300);
        driver.findElement(By.xpath("//a[contains(text(),'Private Retreats')]")).click();
    }

    @When("^I navigate to the private retreats page I scroll down$")
    public void iNavigateToThePrivateRetreatsPageIScrollDown() throws Throwable {
        Thread.sleep(400);
        ((JavascriptExecutor)driver).executeScript("scroll(0,1000)");
        Thread.sleep(1000);
        ((JavascriptExecutor)driver).executeScript("scroll(0,2000)");
        Thread.sleep(1000);
        ((JavascriptExecutor)driver).executeScript("scroll(0,2000)");
        Thread.sleep(1000);
        ((JavascriptExecutor)driver).executeScript("scroll(0,2000)");
        Thread.sleep(1000);
        ((JavascriptExecutor)driver).executeScript("scroll(0,1000)");
        Thread.sleep(1000);
        ((JavascriptExecutor)driver).executeScript("scroll(0,1000)");
        Thread.sleep(1000);
        ((JavascriptExecutor)driver).executeScript("scroll(1000,0)");
        ((JavascriptExecutor)driver).executeScript("scroll(1500,0)");
        ((JavascriptExecutor)driver).executeScript("scroll(2000,0)");
    }

    @And("^I start browsing the page and notice one-of-a-kind experience$")
    public void iStartBrowsingThePageAndNoticeOneOfAKindExperience()throws Throwable {
        Thread.sleep(200);
        ((JavascriptExecutor)driver).executeScript("scroll(0,1700)");
        //test 2
        String actual_h2 = driver.findElement(By.xpath("//h2[text()='A one-of-a-kind experience']")).getText();
        String expect_h2 = "A One-Of-A-Kind Experience";
        if (actual_h2.equalsIgnoreCase(expect_h2)){System.out.println("Test 2 complete");}
        else {System.out.println("Test failed");}
    }

    @Then("^I begin scroll right/left to view some of the pictures$")
    public void iBeginScrollRightLeftToViewSomeOfThePictures()throws Throwable {
        driver.findElement(By.xpath("//button[@class='InlineCarousel-nextButton " +
                "InlineCarousel-button Button--nextIcon--light']")).click();
        Thread.sleep(1100);
        driver.findElement(By.xpath("//button[@class='InlineCarousel-nextButton " +
                "InlineCarousel-button Button--nextIcon--light']")).click();

        Thread.sleep(1100);
        driver.findElement(By.xpath("//button[@class='InlineCarousel-nextButton " +
                "InlineCarousel-button Button--nextIcon--light']")).click();

        Thread.sleep(1100);
        driver.findElement(By.xpath("//button[@class='InlineCarousel-nextButton " +
                "InlineCarousel-button Button--nextIcon--light']")).click();

        Thread.sleep(1100);
        driver.findElement(By.xpath("//button[@class='InlineCarousel-nextButton " +
                "InlineCarousel-button Button--nextIcon--light']")).click();

        Thread.sleep(1100);
        driver.findElement(By.xpath("//button[@class='InlineCarousel-prevButton " +
                "InlineCarousel-button Button--prevIcon--light']")).click();

        Thread.sleep(1100);
        driver.findElement(By.xpath("//button[@class='InlineCarousel-nextButton " +
                "InlineCarousel-button Button--nextIcon--light']")).click();

        Thread.sleep(1100);
        driver.findElement(By.xpath("//button[@class='InlineCarousel-prevButton " +
                "InlineCarousel-button Button--prevIcon--light']")).click();

        Thread.sleep(1100);
        driver.findElement(By.xpath("//button[@class='InlineCarousel-prevButton " +
                "InlineCarousel-button Button--prevIcon--light']")).click();

        Thread.sleep(1100);
        driver.findElement(By.xpath("//button[@class='InlineCarousel-nextButton " +
                "InlineCarousel-button Button--nextIcon--light']")).click();

        Thread.sleep(1100);
        driver.findElement(By.xpath("//button[@class='InlineCarousel-nextButton " +
                "InlineCarousel-button Button--nextIcon--light']")).click();

        Thread.sleep(1100);
        driver.findElement(By.xpath("//button[@class='InlineCarousel-nextButton " +
                "InlineCarousel-button Button--nextIcon--light']")).click();

        Thread.sleep(1100);
        driver.findElement(By.xpath("//button[@class='InlineCarousel-nextButton " +
                "InlineCarousel-button Button--nextIcon--light']")).click();

        Thread.sleep(1100);
        driver.findElement(By.xpath("//button[@class='InlineCarousel-nextButton " +
                "InlineCarousel-button Button--nextIcon--light']")).click();
    }

    @Given("^I've had enough of looking at the pictures$")
    public void iVeHadEnoughOfLookingAtThePictures() {
        //test 3
        String actual_h2 = driver.findElement(By.xpath("//h2[text()='A one-of-a-kind experience']")).getText();
        String expect_h2 = "A One-Of-A-Kind Experience";
        if (actual_h2.equalsIgnoreCase(expect_h2)){System.out.println("Test 3 complete");}
        else {System.out.println("Test failed");}
    }

    @And("^I now want to book my vacation$")
    public void iNowWantToBookMyVacation() {
        //Ignore test
    }

    @Then("^I look at all my options and close my broswer$")
    public void iLookAtAllMyOptionsAndCloseMyBroswer() {

        driver.close();

    }
}
