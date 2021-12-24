$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Processo.feature");
formatter.feature({
  "name": "Realizar tarefa de aluguel",
  "description": "  Acessar o sistema e efetuar as tarefas",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "name": "Cadastrar um usuario e realizar o login",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@dev"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "acessar a aplicação",
  "keyword": "Dado "
});
formatter.match({
  "location": "InicialSteps.acessarAAplicação()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Realizar o login com um usuario \"existente\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "LoginUserSteps.realizarOLoginComUmUsuario(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "exibir resumo mensal do mes \"12\" do ano \"2021\"",
  "keyword": "E "
});
formatter.match({
  "location": "ResumoMensalSteps.exibirResumoMensalDoMesDoAno(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "exluir movimentacao com descricao \"Aluguel casa 14\" e data \"10/12/2021\" e valor \"-1654.12\" e situacao \"Pago\"",
  "keyword": "E "
});
formatter.match({
  "location": "ResumoMensalSteps.exluirMovimentacaoComDescricaoEDataEValorESiatuacao(String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});