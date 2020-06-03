#language: pt

  Funcionalidade: Aprender Cucumber
  como um aluno
  eu quero aprender a utilizar Cucumber
  para que eu possa automatizar critérios de aceitação

  Cenario: Deve executar a especificacao
    Dado que criei o arquivo corretamente
    Quando executa-lo
    Então a especificação deve finalizar com sucesso
    
   Cenario: Deve incrementar o contador 
    Dado que o valor do contador é 15
    Quando eu incrementar em 3
    Então o valor do contador será 18