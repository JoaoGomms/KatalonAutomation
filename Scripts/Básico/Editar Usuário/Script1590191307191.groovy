import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Básico/Criar usuario'), [('gravacao') : 'PaginaEditarUsuario'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PaginaDetalhesUsuário/a_Editar'))

WebUI.setText(findTestObject('PaginaInserirDadosUsuario/input_Nome _username'), nome)

WebUI.setText(findTestObject('PaginaInserirDadosUsuario/input_ltimo nome _userlastname'), sobrenome)

WebUI.setText(findTestObject('PaginaInserirDadosUsuario/input_Email _useremail'), email)

WebUI.setText(findTestObject('PaginaInserirDadosUsuario/input_Endereo_useraddress'), endereco)

WebUI.setText(findTestObject('PaginaInserirDadosUsuario/input_Universidade_useruniversity'), universidade)

WebUI.setText(findTestObject('PaginaInserirDadosUsuario/input_Profisso_userprofile'), profissao)

WebUI.setText(findTestObject('PaginaInserirDadosUsuario/input_Gnero_usergender'), genero)

WebUI.setText(findTestObject('PaginaInserirDadosUsuario/input_Idade_userage'), idade)

WebUI.click(findTestObject('PaginaInserirDadosUsuario/input_Idade_commit'))

CustomKeywords.'cabal.utils.TakeScreenshotLocal.takeScreenshot'('PaginaEditarUsuario', 'UsuarioEditado', 'FluxoBasico')

