Feature: Create New User Feature


	Scenario: Fluxo principal para criar um usuário
		Given Navegar ao site
		When Inserir os dados do usuario
		And Cliclar no botão Criar
		Then Abra a pagina com as informações do usuario