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



class Excecoes {


	@And("Alterar para Email em Branco")
	def alterarEmailBranco(){
		WebUI.setText(findTestObject('PaginaInserirDadosUsuario/input_Email _useremail'), "")
	}

	@And("Alterar para Nome em Branco")
	def alterarNomeBranco(){
		WebUI.setText(findTestObject('PaginaInserirDadosUsuario/input_Nome _username'), "")
	}

	@Then("Valide emailInvalido, tire o print salvando como (.*) na pasta (.*) para o fluxo (.*) e feche o navegador")
	def validarEmailinvalidoEFinalizar(String nomeArquivo, String pasta, String fluxo) {

		def text = WebUI.getText(findTestObject('Excecoes/li_Email translation missing pt-BRactiverec_a96981'))

		WebUI.verifyMatch(text, 'Email translation missing: pt-BR.activerecord.errors.models.user.attributes.email.invalid', true)

		CustomKeywords.'cabal.utils.TakeScreenshotLocal.takeScreenshot'(pasta, nomeArquivo, fluxo)

		WebUI.closeBrowser()
	}

	@Then("Valide emailEmBranco, tire o print salvando como (.*) na pasta (.*) para o fluxo (.*) e feche o navegador")
	def validarEmailEmBrancoEFinalizar(String nomeArquivo, String pasta, String fluxo) {

		String text = WebUI.getText(findTestObject('Excecoes/h2_2 errors proibiu que este usurio fosse salvo'))

		WebUI.verifyMatch(text, '2 errors proibiu que este usuário fosse salvo:', true)

		CustomKeywords.'cabal.utils.TakeScreenshotLocal.takeScreenshot'(pasta, nomeArquivo, fluxo)

		WebUI.closeBrowser()
	}


	@Then("Valide nomeEmBranco, tire o print salvando como (.*) na pasta (.*) para o fluxo (.*) e feche o navegador")
	def validarNomeEmBrancoEFinalizar(String nomeArquivo, String pasta, String fluxo) {

		String text = WebUI.getText(findTestObject('Excecoes/li_Name translation missing pt-BRactivereco_4aa27c'))

		WebUI.verifyEqual(text, 'Name translation missing: pt-BR.activerecord.errors.models.user.attributes.name.blank')

		CustomKeywords.'cabal.utils.TakeScreenshotLocal.takeScreenshot'(pasta, nomeArquivo, fluxo)

		WebUI.closeBrowser()
	}
}