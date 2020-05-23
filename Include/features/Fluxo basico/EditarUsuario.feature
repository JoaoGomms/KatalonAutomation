Feature: Editar Usuario
	
	Scenario: Editar Usuario
		Given Criei um usuario
		When Clicar no botao editar
		And Alterar os dados
		And Clicar no botão Criar
		Then Tire o print e feche o navegador

