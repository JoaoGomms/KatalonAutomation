Feature: Editar Usuario

  Scenario Outline: Editar Usuário
    Given Criei um usuario
    When Clicar no botao editar
    When <nome> <sobrenome> <email> <endereco> <universidade> <profissao> <genero> <idade> em branco
    And Clicar no botão Criar
    Then Tire o print com o nome <nomeArquivo> na pasta <pasta> para o fluxo <fluxo> e feche o navegador

    Examples: 
      | nome          | email                  | sobrenome        | endereco         | universidade               | profissao      | genero         | idade | nomeArquivo     |pasta|fluxo|
      | AlterandoNome | AlterarTeste@gmail.com | AlterarSobrenome | AV.TesteAlterada | TesteUniversidadeAlteração | GeneroAlterado | TesterFeminino |    21 | Usuario Editado |PaginaEditarUsuario|Fluxo Basico|
