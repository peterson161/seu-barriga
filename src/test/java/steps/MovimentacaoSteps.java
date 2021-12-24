package steps;

import cucumber.api.java.pt.E;
import pages.MovimentacaoPage;

public class MovimentacaoSteps {

    MovimentacaoPage movimentacaoPage;

    public MovimentacaoSteps(){
        movimentacaoPage = new MovimentacaoPage();
    }

    @E("inserir uma nova movimentacao")
    public void inserirUmaNovaMovimentacao() {
        movimentacaoPage.acessarNovaMovimentacao();
        movimentacaoPage.criarNovaMovimentacao();
    }
}
