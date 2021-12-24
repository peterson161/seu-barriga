# language: pt
# charset: UTF-8

Funcionalidade: Realizar tarefa de aluguel
  Acessar o sistema e efetuar as tarefas

  @dev
  Cenario: Cadastrar um usuario e realizar o login
    Dado acessar a aplicação

    #---->>>>  Informar "novo" ou "existente" <<<<------
    Quando Realizar o login com um usuario "existente"

#    E inserir um nova conta
#    E inserir uma nova movimentacao
    E exibir resumo mensal do mes "12" do ano "2021"
    E exluir movimentacao com descricao "Aluguel casa 14" e data "10/12/2021" e valor "-1654.12" e situacao "Pago"
#    Entao sair do sistema
