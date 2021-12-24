package steps;

import cucumber.api.java.pt.Dado;
import pages.InicialPage;

public class InicialSteps {

    InicialPage inicialPage;

    public InicialSteps(){
        inicialPage = new InicialPage();
    }

    @Dado("acessar a aplicação")
    public void acessarAAplicação() {
        inicialPage.acessarAplicacao();
    }
}
