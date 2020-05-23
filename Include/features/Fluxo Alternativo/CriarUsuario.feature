Feature: Criar Usuario

  Scenario Outline: Excecao - Email mal Formatado
    Given Naveguei ate o site
    When <email> invalido for inserido
    And Clicar no botão Criar
    Then Valide emailInvalido, tire o print e feche o navegador

    Examples: 
      | email       |
      | teste@gmail |
      
      
	Scenario: Excecao - Profissao em Branco
		Given Naveguei ate o site
		When profissao em branco
		And Clicar no botão Criar
		Then Tire o print e feche o navegador
	
	Scenario: Excecao - Universidade em Branco
		Given Naveguei ate o site
		When universidade em branco
		And Clicar no botão Criar
		Then Tire o print e feche o navegador
	
	Scenario: Excecao - Endereco em Branco
		Given Naveguei ate o site
		When endereco em branco
	And Clicar no botão Criar
		Then Tire o print e feche o navegador
	
	Scenario: Excecao - Genero em Branco
		Given Naveguei ate o site
		When genero em branco
		And Clicar no botão Criar
		Then Tire o print e feche o navegador

	Scenario: Excecao - Sobrenome Em Branco
		Given Naveguei ate o site
		When sobrenome em branco
		And Clicar no botão Criar
		Then Tire o print e feche o navegador
	
	Scenario: Excecao - Idade Em Branco
		Given Naveguei ate o site
		When idade em branco
		And Clicar no botão Criar
		Then Tire o print e feche o navegador
