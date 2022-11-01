package baseTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;


import java.util.concurrent.TimeUnit;

public class BaseTest {
    private WebDriver driver;
    protected HomePage homepage;
    String BASEURL = "http://www.way2automation.com/angularjs-protractor/webtables/";
        @BeforeClass
        public void setup(){
             ChromeOptions options = new ChromeOptions();
             System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

             //instantiate the driver to say that it is a chromedriver - setup your chrome driver
             driver = new ChromeDriver(options);
             driver.manage().window().maximize();
             driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
             driver.get(BASEURL);
             //driver.getTitle();
             Assert.assertTrue(driver.getTitle().contains("Protractor practice website"));
             homepage = new HomePage(driver);
    }
}
