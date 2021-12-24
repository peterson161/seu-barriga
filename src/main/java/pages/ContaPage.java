package pages;

import org.openqa.selenium.By;
import support.Verifications;
import support.driver.DriverManager;

import java.time.LocalDateTime;

public class ContaPage extends DriverManager {

    By altSuccess = By.xpath("//div[contains(text(),'Bem vindo')]");
    By menConta = By.xpath("//li//a[text()='Contas ']");
    By menAdd = By.xpath("//li//a[@href='/addConta']");
    By txtNomeConta = By.id("nome");
    By btnSalvar = By.xpath("//button[@type='submit']");

    public void acessarPaginaConta(){
        if(altSuccess != null){
            getDriver().findElement(menConta).click();
            getDriver().findElement(menAdd).click();
        }
    }

    public void criarNovaConta(){
        Verifications.verifyElementIsClickable(btnSalvar);
        getDriver().findElement(txtNomeConta).sendKeys("Conta " + LocalDateTime.now());
        getDriver().findElement(btnSalvar).click();
    }

}
