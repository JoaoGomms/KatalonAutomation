Feature: Criar Usuario
	
	Scenario: Validar Email
		Given Criei um usuario
		When Clicar no botao editar
		And Alterar para Email em Branco
		And Clicar no botão Criar
		Then Valide emailEmBranco, tire o print e feche o navegador
	
	Scenario: Validar Nome
		Given Criei um usuario
		When Clicar no botao editar
		And Alterar para Nome em Branco
		And Clicar no botão Criar
		Then Valide nomeEmBranco, tire o print e feche o navegador
	