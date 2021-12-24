package pages;

import support.driver.DriverManager;

public class InicialPage extends DriverManager {

    public void acessarAplicacao(){
        getDriver().get(configuration.url());
    }
}
