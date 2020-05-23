Feature: Criar Usuario Fluxo Alternativo

  Scenario Outline: Alternativo - Email mal Formatado
    Given Naveguei ate o site
    When <nome> <sobrenome> <email> <endereco> <universidade> <profissao> <genero> <idade> em branco
    And Clicar no botão Criar
    Then Valide emailInvalido, tire o print salvando como <nomeArquivo> na pasta <pasta> para o fluxo <fluxo> e feche o navegador

    Examples: 
      | nome | email      | sobrenome | endereco | universidade      | profissao | genero          | idade | nomeArquivo         | pasta              | fluxo        |
      | Nome | Teste@gmai | Sobrenome | AV.Teste | TesteUniversidade | Testador  | TesterMasculino |    21 | Email mal formatado | PaginaCriarUsuario | Fluxo Alternativo |

  Scenario Outline: Alternativo - Profissao em Branco
    Given Naveguei ate o site
    When <nome> <sobrenome> <email> <endereco> <universidade> <profissao> <genero> <idade> em branco
    And Clicar no botão Criar
    Then Tire o print com o nome <nomeArquivo> na pasta <pasta> para o fluxo <fluxo> e feche o navegador

    Examples: 
      | nome | email           | sobrenome | endereco | universidade      | profissao | genero          | idade | nomeArquivo         | pasta              | fluxo        |
      | Nome | Teste@gmail.com | Sobrenome | AV.Teste | TesteUniversidade |           | TesterMasculino |    21 | Profissao Em Branco | PaginaCriarUsuario | Fluxo Alternativo |

  Scenario Outline: Alternativo - Universidade em Branco
    Given Naveguei ate o site
    When <nome> <sobrenome> <email> <endereco> <universidade> <profissao> <genero> <idade> em branco
    And Clicar no botão Criar
    Then Tire o print com o nome <nomeArquivo> na pasta <pasta> para o fluxo <fluxo> e feche o navegador

    Examples: 
      | nome | email           | sobrenome | endereco | universidade | profissao | genero          | idade | nomeArquivo            | pasta              | fluxo        |
      | Nome | Teste@gmail.com | Sobrenome | AV.Teste |              | Testador  | TesterMasculino |    21 | Universidade Em Branco | PaginaCriarUsuario | Fluxo Alternativo |

  Scenario Outline: Alternativo - Endereco em Branco
    Given Naveguei ate o site
    When <nome> <sobrenome> <email> <endereco> <universidade> <profissao> <genero> <idade> em branco
    And Clicar no botão Criar
    Then Tire o print com o nome <nomeArquivo> na pasta <pasta> para o fluxo <fluxo> e feche o navegador

    Examples: 
      | nome | email           | sobrenome | endereco | universidade      | profissao | genero          | idade | nomeArquivo        | pasta              | fluxo        |
      | Nome | Teste@gmail.com | Sobrenome |          | TesteUniversidade | Testador  | TesterMasculino |    21 | Endereco Em Branco | PaginaCriarUsuario | Fluxo Alternativo |

  Scenario Outline: Alternativo - Genero em Branco
    Given Naveguei ate o site
    When <nome> <sobrenome> <email> <endereco> <universidade> <profissao> <genero> <idade> em branco
    And Clicar no botão Criar
    Then Tire o print com o nome <nomeArquivo> na pasta <pasta> para o fluxo <fluxo> e feche o navegador

    Examples: 
      | nome | email           | sobrenome | endereco | universidade      | profissao | genero | idade | nomeArquivo      | pasta              | fluxo        |
      | Nome | Teste@gmail.com | Sobrenome | AV.Teste | TesteUniversidade | Testador  |        |    21 | Genero Em Branco | PaginaCriarUsuario | Fluxo Alternativo |

  Scenario Outline: Alternativo - Sobrenome Em Branco
    Given Naveguei ate o site
    When <nome> <sobrenome> <email> <endereco> <universidade> <profissao> <genero> <idade> em branco
    And Clicar no botão Criar
    Then Tire o print com o nome <nomeArquivo> na pasta <pasta> para o fluxo <fluxo> e feche o navegador

    Examples: 
      | nome | email           | sobrenome | endereco | universidade      | profissao | genero          | idade | nomeArquivo         | pasta              | fluxo        |
      | Nome | Teste@gmail.com |           | AV.Teste | TesteUniversidade | Testador  | TesterMasculino |    21 | Sobrenome Em Branco | PaginaCriarUsuario | Fluxo Alternativo |

  Scenario Outline: Alternativo - Idade Em Branco
    Given Naveguei ate o site
    When <nome> <sobrenome> <email> <endereco> <universidade> <profissao> <genero> <idade> em branco
    And Clicar no botão Criar
    Then Tire o print com o nome <nomeArquivo> na pasta <pasta> para o fluxo <fluxo> e feche o navegador

    Examples: 
      | nome | email           | sobrenome | endereco | universidade      | profissao | genero          | idade | nomeArquivo     | pasta              | fluxo        |
      | Nome | Teste@gmail.com | Sobrenome | AV.Teste | TesteUniversidade | Testador  | TesterMasculino |       | Idade Em Branco | PaginaCriarUsuario | Fluxo Alternativo |

  Scenario Outline: Alternativo - Letra no campo Idade
    Given Naveguei ate o site
    When <nome> <sobrenome> <email> <endereco> <universidade> <profissao> <genero> <idade> em branco
    And Clicar no botão Criar
    Then Tire o print com o nome <nomeArquivo> na pasta <pasta> para o fluxo <fluxo> e feche o navegador

    Examples: 
      | nome | email           | sobrenome | endereco | universidade      | profissao | genero          | idade | nomeArquivo          | pasta              | fluxo        |
      | Nome | Teste@gmail.com | Sobrenome | AV.Teste | TesteUniversidade | Testador  | TesterMasculino | ee    | Letra no campo Idade | PaginaCriarUsuario | Fluxo Alternativo |
