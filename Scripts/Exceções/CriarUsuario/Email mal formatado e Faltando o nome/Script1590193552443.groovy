import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://automacaocombatista.herokuapp.com/users/new')

WebUI.setText(findTestObject('PaginaInserirDadosUsuario/input_Nome _username'), '')

WebUI.setText(findTestObject('PaginaInserirDadosUsuario/input_ltimo nome _userlastname'), GlobalVariable.sobrenome)

WebUI.setText(findTestObject('PaginaInserirDadosUsuario/input_Email _useremail'), 'teste')

WebUI.setText(findTestObject('PaginaInserirDadosUsuario/input_Endereo_useraddress'), GlobalVariable.endereco)

WebUI.setText(findTestObject('PaginaInserirDadosUsuario/input_Universidade_useruniversity'), GlobalVariable.universidade)

WebUI.setText(findTestObject('PaginaInserirDadosUsuario/input_Profisso_userprofile'), GlobalVariable.profissao)

WebUI.setText(findTestObject('PaginaInserirDadosUsuario/input_Gnero_usergender'), GlobalVariable.genero)

WebUI.setText(findTestObject('PaginaInserirDadosUsuario/input_Idade_userage'), GlobalVariable.idade)

WebUI.click(findTestObject('PaginaInserirDadosUsuario/input_Idade_commit'))

def textEmail = WebUI.getText(findTestObject('Exceções/li_Name translation missing pt-BRactivereco_4aa27c'))

def textName = WebUI.getText(findTestObject('Exceções/li_Email translation missing pt-BRactiverec_a96981'))


if(textEmail == 'Email translation missing: pt-BR.activerecord.errors.models.user.attributes.email.invalid'){
	return KeywordUtil.markPassed("O erro de email invalido foi recebido ")
} else if(textName == 'Name translation missing: pt-BR.activerecord.errors.models.user.attributes.name.blank'){
	return KeywordUtil.markPassed("O erro de nome em branco foi recebido ")

} else{
return KeywordUtil.markFailed("Os erros esperados não foram alertados")
}
