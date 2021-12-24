package steps;

import cucumber.api.java.pt.Entao;
import pages.LogoutPage;

public class LogoutSteps {

    LogoutPage logoutPage;

    public LogoutSteps(){
        logoutPage = new LogoutPage();
    }

    @Entao("sair do sistema")
    public void sairDoSistema() {
        logoutPage.sair();
    }
}
