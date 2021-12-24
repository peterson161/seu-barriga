package pages;

import org.openqa.selenium.By;
import support.driver.DriverManager;

public class LogoutPage extends DriverManager {

    By menSair = By.xpath("//li//a[@href='/logout']");

    public void sair(){
        getDriver().findElement(menSair).click();
    }
}
