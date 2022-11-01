package baseTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AddUserPage;
import pages.HomePage;

public class AddUserTest extends BaseTest {

    @Test(dataProvider = "UserDetails")
    public void addUserTest(String Firstname, String Lastname, String Username, String Password,String EmailAddress, String CellphoneNumber ) {
        //String Password, String Email, int Cellphone
        //user wants to access the Add user screen
        AddUserPage addUserPage = homepage.clickOnAddUser();

        addUserPage.setFirstname(Firstname);
        addUserPage.setLastName(Lastname);
        addUserPage.setUsername(Username);
        addUserPage.setPassword(Password);
        addUserPage.setEmail(EmailAddress);
        addUserPage.setCellPhoneNumber(CellphoneNumber);
        addUserPage.clickRadioButton();
        //addUserPage.selectOption1RadioButton(CompanyRadioButton);
        addUserPage.selectValue1DropDown();

        //HomePage homePage = addUserPage.clickOnSaveButton();

    }

    @DataProvider()
    public Object[][] UserDetails() {
        Object[][] data = new Object[1][6];
        data[0][0] = "FName1";data[0][1]="LName1"; data[0][2]="User1"; data[0][3]="Pass1";data[0][4]="admin@mail.com";data[0][5]="082555";
        return data;

    }





}
