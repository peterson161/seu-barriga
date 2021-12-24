package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import support.Verifications;
import support.dates.DatePicker;
import support.driver.DriverManager;

public class MovimentacaoPage extends DriverManager {

    By altSuccess = By.xpath("//div[@role='alert' and contains(text(), 'sucesso')]");
    By menCriarMovimentacao = By.xpath("//li//a[@href='/movimentacao']");

    By cbbTipo = By.id("tipo");
    By txtDataMovimentacao = By.id("data_transacao");
    By txtDataPagamento = By.id("data_pagamento");
    By txtDescricao = By.id("descricao");
    By txtInteressado = By.id("interessado");
    By txtValor = By.id("valor");
    By cbbConta = By.id("conta");
    By rdbStatus = By.xpath("//input[@type='radio' and @id='status_pago']");
    By btnSalvar = By.xpath("//button[@type='submit']");

    public void acessarNovaMovimentacao(){
        if(altSuccess != null){
            getDriver().findElement(menCriarMovimentacao).click();
        }
    }

    public void criarNovaMovimentacao(){
        Verifications.verifyElementIsClickable(btnSalvar);
        new Select(getDriver().findElement(cbbTipo)).selectByValue("DESP");
        getDriver().findElement(txtDataMovimentacao).sendKeys(DatePicker.getDateUpOrDown(-2));
        getDriver().findElement(txtDataPagamento).sendKeys(DatePicker.getDateUpOrDown(0));
        getDriver().findElement(txtDescricao).sendKeys("Aluguel casa 14");
        getDriver().findElement(txtInteressado).sendKeys("Rubens");
        getDriver().findElement(txtValor).sendKeys("1654.12");
        new Select(getDriver().findElement(cbbConta)).selectByIndex(0);
        getDriver().findElement(rdbStatus).click();
        getDriver().findElement(btnSalvar).click();
    }
}
