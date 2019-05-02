package mySteps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Wait;

import java.util.concurrent.TimeUnit;

public class fourSeasons {

    WebDriver browser;

    @Given("^I navigate to the Four Seasons website$")
    public void iNavigateToTheFourSeasonsWebsite() {
        browser = new FirefoxDriver();
        browser.manage().window().maximize();
        browser.get("https://www.fourseasons.com/");
    }

    @And("^I want to look at holiday resorts$")
    public void iWantToLookAtHolidayResorts()throws Throwable {
        //test1
        String HotelsAndResorts = browser.findElement(By.xpath("//a[text()='Hotels & Resorts']")).getText();
        String HotelsAndResorts1 = "Hotels & Resorts";
        if (HotelsAndResorts.equalsIgnoreCase(HotelsAndResorts1)){System.out.println("Test 1 successful");}
        else {System.out.println("Test 2 failed");}
    }

    @When("^I click on hotels & resorts$")
    public void iClickOnHotelsResorts() throws Throwable {
        Thread.sleep(1000);
        browser.findElement(By.xpath("//a[text()='Hotels & Resorts']")).click();
        Thread.sleep(1000);
        browser.findElement(By.xpath("//a[@id='GdprCookieBannerAccept']")).click();
    }

    @Then("^I expect to see a list of hotels and resorts$")
    public void iExpectToSeeAListOfHotelsAndResorts() {
        //test2
        String act_headingTitle = browser.findElement(By.xpath("//span[@class='Heading-eyebrow ty-h4']")).getText();
        String exp_headingTitle = "Four Seasons Hotels and Resorts";
        browser.close();
        if (act_headingTitle.equalsIgnoreCase(exp_headingTitle)){System.out.println("Test 2 successful");}
        else {System.out.println("Test 2 failed");}
    }

    @Given("^I want a resort in Asia & Pacific$")
    public void iWantAResortInAsiaPacific() throws Throwable {
        browser = new FirefoxDriver();
        browser.manage().window().maximize();
        browser.get("https://www.fourseasons.com/");
        browser.findElement(By.xpath("//a[text()='Hotels & Resorts']")).click();
        browser.findElement(By.xpath("//a[@id='GdprCookieBannerAccept']")).click();
        Thread.sleep(2000);
        browser.findElement(By.xpath("//span[text()='Asia & Pacific']")).click();
    }

    @And("^I the location I want is Kuala Lumpur$")
    public void iTheLocationIWantIsKualaLumpur() {
        //test3
        String act_location = browser.findElement(By.xpath("//a[contains(text(),'Kuala Lumpur')]")).getText();
        String exp_location = "Kuala Lumpur";
        if (act_location.equalsIgnoreCase(exp_location)){System.out.println("Test 3 successful");}
        else {System.out.println("Test 3 failed");}
    }

    @When("^I've clicked on Kuala Lumpur as my location$")
    public void iVeClickedOnKualaLumpurAsMyLocation() throws Throwable {
        Thread.sleep(2000);
        browser.findElement(By.xpath("//a[text()='Kuala Lumpur']")).click();
    }

    @Then("^I expect to be taken to the page of Four Seasons Kuala Lumpur$")
    public void iExpectToBeTakenToThePageOfFourSeasonsKualaLumpur() {
        //test4
        String actual_KL = browser.findElement(By.xpath("//address[@class='LocationBar-address ty-c2']")).getText();
        String expted_KL = "Four Seasons Place, 145 Jalan Ampang, 50450 Kuala Lumpur, Malaysia";
        browser.close();
        if (actual_KL.equalsIgnoreCase(expted_KL)){System.out.println("Test 4 successful");}
        else {System.out.println("Test 4 failed");}
    }
}
