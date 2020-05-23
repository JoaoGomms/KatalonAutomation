Feature: Criar Usuario

  Scenario Outline: Validar Email
    Given Naveguei ate o site
    When <nome> <sobrenome> <email> <endereco> <universidade> <profissao> <genero> <idade> em branco
    And Clicar no botão Criar
    Then Valide emailEmBranco, tire o print salvando como <nomeArquivo> na pasta <pasta> para o fluxo <fluxo> e feche o navegador

    Examples: 
      | nome | email           | sobrenome | endereco | universidade      | profissao | genero          | idade | nomeArquivo            | pasta              | fluxo        |
      | Nome |  | Sobrenome | AV.Teste | UniversidadeTeste | Testador  | TesterMasculino |    21 | Email em Branco | PaginaCriarUsuario | Fluxo Excecao |

  Scenario Outline: Validar Nome
    Given Naveguei ate o site
    When <nome> <sobrenome> <email> <endereco> <universidade> <profissao> <genero> <idade> em branco
    And Clicar no botão Criar
    Then Valide nomeEmBranco, tire o print salvando como <nomeArquivo> na pasta <pasta> para o fluxo <fluxo> e feche o navegador

    Examples: 
      | nome | email           | sobrenome | endereco | universidade      | profissao | genero          | idade | nomeArquivo            | pasta              | fluxo        |
      | | Teste@gmail.com | Sobrenome | AV.Teste | UniversidadeTeste | Testador  | TesterMasculino |    21 | Nome em Branco | PaginaCriarUsuario | Fluxo Excecao |
