package pages;

import org.openqa.selenium.By;
import support.User;
import support.Verifications;
import support.driver.DriverManager;

public class LoginPage extends DriverManager {

    private User user;

    public LoginPage(){
        user = new User(User.TypeUser.GET_USER);
    }

    private By txtEmail = By.id("email");
    private By txtPassWord = By.id("senha");
    private By btnSubmitUser = By.xpath("//button[@type='submit']");

    public void efetuarLogin(){
        Verifications.verifyElementIsClickable(btnSubmitUser);
        getDriver().findElement(txtEmail).sendKeys(user.getEmail());
        getDriver().findElement(txtPassWord).sendKeys(user.getPassword());
        getDriver().findElement(btnSubmitUser).click();
    }
}
