Feature: Criar Usuario
	
	Scenario: Validar Email
		Given Naveguei ate o site
		When Inserir email em branco 
		And Clicar no botão Criar
		Then Valide emailEmBranco, tire o print e feche o navegador
	
	Scenario: Validar Nome
		Given Naveguei ate o site
		When nome em branco
		And Clicar no botão Criar
		Then Valide nomeEmBranco, tire o print e feche o navegador
	