package steps;

import cucumber.api.java.pt.E;
import pages.ResumoMensalPage;

public class ResumoMensalSteps {

    ResumoMensalPage resumoMensalPage;

    public ResumoMensalSteps(){
        resumoMensalPage = new ResumoMensalPage();
    }

    @E("exibir resumo mensal do mes {string} do ano {string}")
    public void exibirResumoMensalDoMesDoAno(String mes, String ano) {
        resumoMensalPage.acessarResumoMensal();
        resumoMensalPage.filtrarResumoMensal(mes, ano);
    }

    @E("exluir movimentacao com descricao {string} e data {string} e valor {string} e situacao {string}")
    public void exluirMovimentacaoComDescricaoEDataEValorESiatuacao(String descricao, String dataPagamento,
                                                                    String valor, String situacao) {
        resumoMensalPage.apagaMovimentacao(descricao, dataPagamento, valor, situacao);
    }
}
