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
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dev.kompack.id/pendaftaran/')

WebUI.click(findTestObject('Object Repository/Login_Page1/kompack-register/Page_Kompack - Jasa Pergudangan di Lokasi S_f77db1/input_Email_input-email'))

WebUI.setText(findTestObject('Object Repository/Login_Page1/kompack-register/Page_Kompack - Jasa Pergudangan di Lokasi S_f77db1/input_Email_input-email'), 
    'testingkompack@yopmail.com')

WebUI.setText(findTestObject('Object Repository/Login_Page1/kompack-register/Page_Kompack - Jasa Pergudangan di Lokasi S_f77db1/input_Nama Lengkap_input-name'), 
    'kompack test ')

WebUI.setText(findTestObject('null'), 
    '887846700752')

WebUI.setEncryptedText(findTestObject('null'), 
    'RigbBhfdqOCnyLqa2nk7hw==')

WebUI.setEncryptedText(findTestObject('null'), 
    '9NLz+4tGZcQ=')

WebUI.setText(findTestObject('null'), 
    '87846700752')

WebUI.setEncryptedText(findTestObject('null'), 
    'RigbBhfdqOCnyLqa2nk7hw==')

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('Object Repository/Login_Page1/kompack-register/Page_Kompack - Jasa Pergudangan di Lokasi S_f77db1/div_Silahkan verifikasi melalui email yang _b3ec43'))

