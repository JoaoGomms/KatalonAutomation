Feature: Criar Usuario

  Scenario Outline: Criar Usuatio
    Given Naveguei ate o site
    When <nome> <sobrenome> <email> <endereco> <universidade> <profissao> <genero> <idade> em branco
    And Clicar no botão Criar
    Then Tire o print com o nome <nomeArquivo> na pasta <pasta> para o fluxo <fluxo> e feche o navegador

    Examples: 
      | nome | email           | sobrenome | endereco | universidade      | profissao | genero          | idade | nomeArquivo            | pasta              | fluxo        |
      | Nome | Teste@gmail.com | Sobrenome | AV.Teste | UniversidadeTeste | Testador  | TesterMasculino |    21 | Usuario Criado | PaginaCriarUsuario | Fluxo Basico |
