package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;
import pages.LoginPage;
import pages.NewUserPage;

public class LoginUserSteps {

    private NewUserPage newUserPage;
    private LoginPage loginPage;

    @Quando("Realizar o login com um usuario {string}")
    public void realizarOLoginComUmUsuario(String tipoUsuario) {
        switch (tipoUsuario){
            case "novo":
                newUserPage = new NewUserPage();
                newUserPage.criarNovoUsuario();
                newUserPage.efetuarLogin();
                break;
            case "existente":
                loginPage = new LoginPage();
                loginPage.efetuarLogin();
                break;
        }
    }
}
