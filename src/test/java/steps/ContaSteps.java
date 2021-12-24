package steps;

import cucumber.api.java.pt.E;
import pages.ContaPage;

public class ContaSteps {

    ContaPage contaPage;

    public ContaSteps() {
        contaPage = new ContaPage();
    }

    @E("inserir um nova conta")
    public void inserirUmNovaConta() {
        contaPage.acessarPaginaConta();
        contaPage.criarNovaConta();
    }
}
