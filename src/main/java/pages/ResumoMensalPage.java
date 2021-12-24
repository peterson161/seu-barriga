package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import support.Verifications;
import support.driver.DriverManager;

public class ResumoMensalPage extends DriverManager {

    By altSuccess = By.xpath("//div[@role='alert' and contains(text(), 'sucesso')]");
    By menResumoMensal = By.xpath("//li//a[@href='/extrato']");

    By cbbMes = By.id("mes");
    By cbbAno = By.id("ano");
    By btnBuscar = By.xpath("//input[@type='submit']");

    public void acessarResumoMensal(){
        if(altSuccess != null){
            getDriver().findElement(menResumoMensal).click();
        }
    }

    public void filtrarResumoMensal(String mes, String ano){
        Verifications.verifyElementIsClickable(btnBuscar);
        new Select(getDriver().findElement(cbbMes)).selectByValue(mes);
        new Select(getDriver().findElement(cbbAno)).selectByValue(ano);
        getDriver().findElement(btnBuscar).click();
    }

    public void apagaMovimentacao(String descricao, String dataPagamento, String valor, String situacao){
        String xpath = "//table[@id='tabelaExtrato']//tbody//tr";
        By tbody = By.xpath(xpath);
        int quantLinhas = getDriver().findElements(tbody).size();

        By itemDescricao, itemDataPagamento, itemValor, itemSituacao, itemExcluir;
        String vDescricao, vDataPagamento, vValor, vSituacao;

        for(int i = 1; i <= quantLinhas; i++){
            itemDescricao = By.xpath(xpath + "[" + i + "]//td[1]");
            itemDataPagamento = By.xpath(xpath + "[" + i + "]//td[2]");
            itemValor = By.xpath(xpath + "[" + i + "]//td[4]");
            itemSituacao = By.xpath(xpath + "[" + i + "]//td[5]");
            itemExcluir = By.xpath(xpath + "[" + i + "]//td[6]//a//span");

            vDescricao = getDriver().findElement(itemDescricao).getText();
            vDataPagamento = getDriver().findElement(itemDataPagamento).getText();
            vValor = getDriver().findElement(itemValor).getText();
            vSituacao = getDriver().findElement(itemSituacao).getText();

            if(descricao.equals(vDescricao) && dataPagamento.equals(vDataPagamento) &&
                                    valor.equals(vValor) && situacao.equals(vSituacao)){
                getDriver().findElement(itemExcluir).click();
                Verifications.verifyElementIsVisible(altSuccess);
                quantLinhas--;
                i = 0;
            }
        }
    }
}
