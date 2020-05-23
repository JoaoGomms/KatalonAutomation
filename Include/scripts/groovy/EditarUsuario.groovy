import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class EditarUsuario {

	@Given("Criei um usuario")
	def criarUsuario() {
		WebUI.callTestCase(findTestCase('Básico/Criar usuario'), [('gravacao') : 'PaginaEditarUsuario'], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Clicar no botao editar")
	def clicarEditar() {

		WebUI.click(findTestObject('PaginaDetalhesUsuário/a_Editar'))
	}

	@And("Alterar os dados")
	def alterarDados() {
		WebUI.setText(findTestObject('PaginaInserirDadosUsuario/input_Nome _username'), 'Alterar Nome Usuario')

		WebUI.setText(findTestObject('PaginaInserirDadosUsuario/input_ltimo nome _userlastname'), 'Alterar Sobrenome Usuario')

		WebUI.setText(findTestObject('PaginaInserirDadosUsuario/input_Email _useremail'), 'AlterarEmail@gmail.com')

		WebUI.setText(findTestObject('PaginaInserirDadosUsuario/input_Endereo_useraddress'), 'Alterar Endereço Usuario')

		WebUI.setText(findTestObject('PaginaInserirDadosUsuario/input_Universidade_useruniversity'), 'Alterar Universidade Usuario')

		WebUI.setText(findTestObject('PaginaInserirDadosUsuario/input_Profisso_userprofile'), 'Alterar Profissao Usuario')

		WebUI.setText(findTestObject('PaginaInserirDadosUsuario/input_Gnero_usergender'), 'Alterar Genero Usuario')

		WebUI.setText(findTestObject('PaginaInserirDadosUsuario/input_Idade_userage'), '21')
	}
}