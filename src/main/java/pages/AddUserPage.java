package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AddUserPage {

    private WebDriver driver;
    //private By firstNameField = By.cssSelector("input[name='FirstName']");
    private By firstNameField = By.name("FirstName");
    private By lastNameField = By.cssSelector("input[name='LastName']");
    private By usernameField = By.cssSelector("input[name='UserName']");
    private By passwordField = By.cssSelector("input[name='Password']");
    private By emailField = By.cssSelector("input[name='Email']");
    private By cellPhoneField = By.cssSelector("input[name='Mobilephone']");
    private By option1RadioButton = By.cssSelector("input[type='radio'][value='15']");
    //private By option2RadioButton = By.cssSelector("input[type='radio'][value='16']");
    private By role1DropDownList = By.cssSelector("select[name='RoleId']");
    private By saveButton = By.xpath("button[ng-click='save(user)']");

    public AddUserPage(WebDriver driver){
        this.driver = driver;
    }

    public void setFirstname (String firstname){
        driver.findElement(firstNameField).sendKeys(firstname);
    }

   public void setLastName(String lastName){
       driver.findElement(lastNameField).sendKeys(lastName);
   }

    public void setUsername(String username){
       driver.findElement(usernameField).sendKeys(username);
    }

    public void setPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public void setEmail(String email){
        driver.findElement(emailField).sendKeys(email);
        //driver.findElement(emailField).sendKeys(email);
    }
    public void setCellPhoneNumber(String phone){
     driver.findElement(cellPhoneField).sendKeys(phone);
   }

   public void clickRadioButton(){
        driver.findElement(option1RadioButton).click();
   }

   public void selectValue1DropDown(){
        Select dropdown = new Select(driver.findElement(role1DropDownList));
        dropdown.selectByVisibleText("Sales Team");
   }

   public HomePage clickOnSaveButton(){
        driver.findElement(saveButton).click();
        return new HomePage(driver);
           }

}
