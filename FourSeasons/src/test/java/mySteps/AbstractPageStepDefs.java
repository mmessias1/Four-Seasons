package mySteps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbstractPageStepDefs {

    protected static WebDriver driver;

    protected WebDriver getDriver(){
        //here I'm saying if the driver is not instantiated, then instantiate it
        if (driver == null){

            System.setProperty("webdriver.chrome.driver",
                    "C:\\Users\\Morris.Messias\\Downloads\\chromedriver_win32\\chromedriver.exe");

            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        return driver;

    }
}
