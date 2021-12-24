package pages;

import org.openqa.selenium.By;
import support.User;
import support.Verifications;
import support.driver.DriverManager;

public class NewUserPage extends DriverManager {

    private User user;
    private LoginPage loginPage;

    public NewUserPage(){
        user = new User(User.TypeUser.NEW_USER);
        loginPage = new LoginPage();
    }

    private By menNovoUsuario = By.xpath("//ul[@class='nav navbar-nav']//li//a[@href='/cadastro']");
    private By txtName = By.id("nome");
    private By txtEmail = By.id("email");
    private By txtPassWord = By.id("senha");
    private By btnCreateUser = By.xpath("//input[@type='submit']");
    private By altSuccess = By.xpath("//div[contains(text(),'sucesso')]");

    public void criarNovoUsuario(){
        getDriver().findElement(menNovoUsuario).click();
        Verifications.verifyElementIsClickable(btnCreateUser);
        getDriver().findElement(txtName).sendKeys(user.getName());
        getDriver().findElement(txtEmail).sendKeys(user.getEmail());
        getDriver().findElement(txtPassWord).sendKeys(user.getPassword());
        getDriver().findElement(btnCreateUser).click();
    }

    public void efetuarLogin(){
        if(altSuccess != null){
           loginPage.efetuarLogin();
        }
    }
}
