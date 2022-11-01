package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By addUserLink = By.cssSelector("button[type='add']");

    //create the constructor
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public AddUserPage clickOnAddUser(){
        driver.findElement(addUserLink).click();
        return new AddUserPage(driver);
    }
}
